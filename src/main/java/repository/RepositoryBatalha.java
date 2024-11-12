package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import database.DatabaseConnection;
import entities.Batalha;

public class RepositoryBatalha {

	 public void salvaBatalha(Batalha batalha) {
		    
	        String sql = "INSERT INTO batalhaResultado (lutador1, lutador2, vencedor) VALUES (?, ?, ?)";

	    
	        try (Connection conexao = DatabaseConnection.conectar();
	    
	             PreparedStatement stmt = conexao.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)) {

	    
	            
	            stmt.setString(1, batalha.getLutador1());
	            stmt.setString(2, batalha.getLutador2());
	            stmt.setString(3, batalha.getVencedor());
	    
	            stmt.executeUpdate();
	    
	        } catch (SQLException e) {
	    
	            e.printStackTrace();
	        }
	    }
	
	
}
