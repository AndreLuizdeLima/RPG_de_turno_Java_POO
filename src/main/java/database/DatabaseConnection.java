package database;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection {

	private static final String DATABASE_NAME = "rpg";

	private static final String URL = "jdbc:mysql://localhost:3307/";

	private static final String USER = "root";

	private static final String PASSWORD = "admin";

	private static boolean databaseInitialized = false;

	public static Connection conectar() throws SQLException {
		final String fullUrl = databaseInitialized ? URL + DATABASE_NAME : URL;
		// System.out.println("Tentando conectar com" + fullUrl);

		Connection conexao = DriverManager.getConnection(fullUrl, USER, PASSWORD);

		if (!databaseInitialized) {

			inicializarBancoDeDados(conexao);

			databaseInitialized = true;

		}

		return conexao;
	}

	private static void inicializarBancoDeDados(Connection conexao) {
		try (

				BufferedReader reader = new BufferedReader(
						new InputStreamReader(DatabaseConnection.class.getResourceAsStream("/create_database.sql")));

				Statement statement = conexao.createStatement()) {

			StringBuilder sql = new StringBuilder();
			String linha;

			while ((linha = reader.readLine()) != null) {
				sql.append(linha).append("\n");

				if (linha.trim().endsWith(";")) {
					statement.execute(sql.toString());

					sql.setLength(0);
				}
			}

			System.out.println("Banco de dados inicializado com sucesso.");

		} catch (Exception e) {

			e.printStackTrace();
			System.err.println("Erro ao inicializar o banco: " + e.getMessage());
		}
	}

	public static void desconectar(Connection conexao) {
		try {

			if (conexao != null && !conexao.isClosed()) {

				conexao.close();
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}
}