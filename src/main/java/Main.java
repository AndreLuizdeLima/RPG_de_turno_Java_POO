import java.sql.SQLException;

import database.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws SQLException {
		
		try {
			
			Connection conexao = DatabaseConnection.conectar();
			System.out.println("Banco criado com sucesso!!!");
			
			conexao.close();
			
			
		} catch (SQLException e) {
			 e.printStackTrace();
			 
		}
	}

}
