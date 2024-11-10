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
		
		System.out.println("Racas e Arquetipos Criados com sucesso.Indiferente ");
		
	}
	
	public void dropDatabase() {
		
		String sql = "drop database rpg";
		
		 try (Connection conexao = DatabaseConnection.conectar();
				 
			PreparedStatement stmt = conexao.prepareStatement(sql)) {
			 

			  stmt.executeUpdate();
			 
		 }catch (SQLException e) {
	            e.printStackTrace();
	        }
		
		
	}
	
}
