package utilities;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import database.DatabaseConnection;

public class limpaTabelaPersonagens {

	public void limpaTabelaPersonagens() {
		
		String sql = "TRUNCATE TABLE personagens";
		
		 try (Connection conexao = DatabaseConnection.conectar();
				 
			PreparedStatement stmt = conexao.prepareStatement(sql)) {
			 

			  stmt.executeUpdate();
			 
		 }catch (SQLException e) {
	            e.printStackTrace();
	        }
	}
	
}
