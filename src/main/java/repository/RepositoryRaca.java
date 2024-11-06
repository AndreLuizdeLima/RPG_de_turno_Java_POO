package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import database.DatabaseConnection;
import entities.Raca;

public class RepositoryRaca {
	
    
    public void salvarRaca(Raca raca) {
    
        String sql = "INSERT INTO racas (nome, bonusVida, bonusEscudo, bonusPoderFisico, bonusPoderHabilidade) VALUES (?, ?, ?, ?, ?)";

    
        try (Connection conexao = DatabaseConnection.conectar();
    
             PreparedStatement stmt = conexao.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)) {

    
            stmt.setString(1, raca.getNome());
            stmt.setInt(2, raca.getBonusVida());
            stmt.setInt(3, raca.getBonusEscudo());
            stmt.setInt(4, raca.getBonusPoderFisico());
            stmt.setInt(5, raca.getBonusPoderHabilidade());
    
            stmt.executeUpdate();

            //System.out.println("Raça " + raca.getNome() + " salva com sucesso!!");
    
        } catch (SQLException e) {
    
            e.printStackTrace();
        }
    }

    
    public List<Raca> buscarTodasRacas() {
    
        List<Raca> racasArray = new ArrayList<>();
    
        String sql = "SELECT * FROM racas";

    
        try (Connection conexao = DatabaseConnection.conectar();
             PreparedStatement stmt = conexao.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

    
            while (rs.next()) {
                Raca raca = new Raca();
                raca.setNome(rs.getString("nome"));
                raca.setBonusVida(rs.getInt("bonusVida"));
                raca.setBonusEscudo(rs.getInt("bonusEscudo"));
                raca.setBonusPoderFisico(rs.getInt("bonusPoderFisico"));
                raca.setBonusPoderHabilidade(rs.getInt("bonusPoderHabilidade"));
    
                racasArray.add(raca);
                
                
            }

        } catch (SQLException e) {
    
            e.printStackTrace();
        }

    
        return racasArray;
    }

   
    
    
    public Raca buscarRacaPorNomeObjeto(String nome) {
    
        String sql = "SELECT * FROM racas WHERE nome = ?";
        Raca raca = null;

    
        try (Connection conexao = DatabaseConnection.conectar();
             PreparedStatement stmt = conexao.prepareStatement(sql)) {

    
            stmt.setString(1, nome);
    
            try (ResultSet rs = stmt.executeQuery()) {
    
                if (rs.next()) {
                    raca = new Raca();
                    raca.setNome(rs.getString("nome"));
                    raca.setBonusVida(rs.getInt("bonusVida"));
                    raca.setBonusEscudo(rs.getInt("bonusEscudo"));
                    raca.setBonusPoderFisico(rs.getInt("bonusPoderFisico"));
                    raca.setBonusPoderHabilidade(rs.getInt("bonusPoderHabilidade"));
                }
            }

        } catch (SQLException e) {
    
            e.printStackTrace();
        }

    
        return raca;
    }
    
    public int buscarRacaPorNome(String nome) {
        
        String sql = "SELECT id FROM racas WHERE nome = ?";
        int racaID = 0;

    
        try (Connection conexao = DatabaseConnection.conectar();
             PreparedStatement stmt = conexao.prepareStatement(sql)) {

    
            stmt.setString(1, nome);
    
            try (ResultSet rs = stmt.executeQuery()) {
    
                if (rs.next()) {
                	
                	racaID = rs.getInt("id");
                	
                }
            }

        } catch (SQLException e) {
    
            e.printStackTrace();
        }

    
        return racaID;
    }
}
