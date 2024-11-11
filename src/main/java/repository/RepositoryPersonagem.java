package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import database.DatabaseConnection;
import entities.Personagem;

public class RepositoryPersonagem {

    public void salvarPersonagem(Personagem personagem) {
    	
    	
        
        String sql = "INSERT INTO personagens ( nome, vida, escudo, poderFisico, poderHabilidade, racaId, arquetipoId) "
        		+ "VALUES ( ?, ?, ?, ?, ?, ?, ?)";

        
        try (Connection conexao = DatabaseConnection.conectar();

             PreparedStatement stmt = conexao.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)) {
        	
        	

            stmt.setString(1, personagem.getNome());
            stmt.setInt(2, personagem.getVida());
            stmt.setInt(3, personagem.getEscudo());
            stmt.setInt(4, personagem.getPoderFisico());
            stmt.setInt(5, personagem.getPoderHabilidade());
            stmt.setInt(6, personagem.getPersonagem1RacaId());
            stmt.setInt(7, personagem.getPersonagem1ArquetipoId());
            stmt.executeUpdate();

            System.out.println("Personagem salvo: " + personagem.getNome() );
            
            
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public Personagem buscarPersonagemPorId(int id) {
	    
        String sql = " SELECT * FROM personagens WHERE id = ?";
        Personagem personagem = null;

    
        try (Connection conexao = DatabaseConnection.conectar();
             PreparedStatement stmt = conexao.prepareStatement(sql)) {

    
            stmt.setInt(1, id);
    
            try (ResultSet rs = stmt.executeQuery()) {
    
                if (rs.next()) {
                	personagem = new Personagem(rs.getString("nome"),rs.getInt("racaId"),rs.getInt("arquetipoId"));
            
                	personagem.setVida(rs.getInt("vida"));
                	personagem.setEscudo(rs.getInt("escudo"));
                	personagem.setPoderFisico(rs.getInt("poderFisico"));
                	personagem.setPoderHabilidade(rs.getInt("poderHabilidade"));
                }
            }

        } catch (SQLException e) {
    
            e.printStackTrace();
        }

    
        return personagem;
    }
}
