package utilities;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import database.DatabaseConnection;

public class IniciandoBanco {

	public void IniciandoBanco() {
		
		PopulandoRacas popularRacas = new PopulandoRacas();
		PopulandoArquetipo popularArquetipos = new PopulandoArquetipo();
		popularArquetipos.PopulandoArquetipo();
		popularRacas.PopulandoRacas();
		
		System.out.println("Racas e Arquetipos Criados com sucesso");
		
	}
	
	public void clearDatabase() {
		
		String sql = "delete from personagens";
		
		 try (Connection conexao = DatabaseConnection.conectar();
				 
			PreparedStatement stmt = conexao.prepareStatement(sql)) {
			 

			  stmt.executeUpdate();
			 
		 }catch (SQLException e) {
	            e.printStackTrace();
	        }
		
		
		String sql1 = "ALTER TABLE personagens AUTO_INCREMENT = 1";
		
		 try (Connection conexao = DatabaseConnection.conectar();
				 
			PreparedStatement stmt = conexao.prepareStatement(sql1)) {
			 

			  stmt.executeUpdate();
			 
		 }catch (SQLException e) {
	            e.printStackTrace();
	        }
		 
		 
	}
		
}
