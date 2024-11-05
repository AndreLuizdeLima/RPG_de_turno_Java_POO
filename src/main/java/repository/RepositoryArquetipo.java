package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import database.DatabaseConnection;
import entities.Arquetipo;

public class RepositoryArquetipo {

	 public void salvarArquetipo(Arquetipo arquetipo) {
		    
	        String sql = "INSERT INTO arquetipos (nome, bonusVida, bonusEscudo, bonusPoderFisico, bonusPoderHabilidade) VALUES (?, ?, ?, ?, ?)";

	    
	        try (Connection conexao = DatabaseConnection.conectar();
	    
	             PreparedStatement stmt = conexao.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)) {

	    
	            stmt.setString(1, arquetipo.getNome());
	            stmt.setInt(2, arquetipo.getBonusVida());
	            stmt.setInt(3, arquetipo.getBonusEscudo());
	            stmt.setInt(4, arquetipo.getBonusPoderFisico());
	            stmt.setInt(5, arquetipo.getBonusPoderHabilidade());
	    
	            stmt.executeUpdate();

	            System.out.println("Arquetipo " + arquetipo.getNome() + " salvo com sucesso!!");
	    
	        } catch (SQLException e) {
	    
	            e.printStackTrace();
	        }
	    }
	 
	 public List<Arquetipo> buscarTodasArquetipo() {
		    
	        List<Arquetipo> arquetipoArray = new ArrayList<>();
	    
	        String sql = "SELECT * FROM arquetipos";

	    
	        try (Connection conexao = DatabaseConnection.conectar();
	             PreparedStatement stmt = conexao.prepareStatement(sql);
	             ResultSet rs = stmt.executeQuery()) {

	    
	            while (rs.next()) {
	            	Arquetipo arquetipo = new Arquetipo();
	            	
	            	arquetipo.setNome(rs.getString("nome"));
	            	arquetipo.setBonusVida(rs.getInt("bonusVida"));
	            	arquetipo.setBonusEscudo(rs.getInt("bonusEscudo"));
	            	arquetipo.setBonusPoderFisico(rs.getInt("bonusPoderFisico"));
	            	arquetipo.setBonusPoderHabilidade(rs.getInt("bonusPoderHabilidade"));
	    
	            	arquetipoArray.add(arquetipo);
	                
	                
	            }

	        } catch (SQLException e) {
	    
	            e.printStackTrace();
	        }

	    
	        return arquetipoArray;
	    }

	   
	    
	    
	    public Arquetipo buscarArquetipoPorNome(String nome) {
	    
	        String sql = "SELECT * FROM arquetipos WHERE nome = ?";
	        Arquetipo arquetipo = null;

	    
	        try (Connection conexao = DatabaseConnection.conectar();
	             PreparedStatement stmt = conexao.prepareStatement(sql)) {

	    
	            stmt.setString(1, nome);
	    
	            try (ResultSet rs = stmt.executeQuery()) {
	    
	                if (rs.next()) {
	                	Arquetipo arquetipo1 = new Arquetipo();
	                	arquetipo1.setNome(rs.getString("nome"));
	                	arquetipo1.setBonusVida(rs.getInt("bonusVida"));
	                	arquetipo1.setBonusEscudo(rs.getInt("bonusEscudo"));
	                	arquetipo1.setBonusPoderFisico(rs.getInt("bonusPoderFisico"));
	                	arquetipo1.setBonusPoderHabilidade(rs.getInt("bonusPoderHabilidade"));
	                }
	            }

	        } catch (SQLException e) {
	    
	            e.printStackTrace();
	        }

	    
	        return arquetipo;
	    }


}
