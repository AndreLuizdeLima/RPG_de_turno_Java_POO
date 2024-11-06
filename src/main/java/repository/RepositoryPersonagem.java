package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import database.DatabaseConnection;
import entities.Personagem;

public class RepositoryPersonagem {

    public void salvarPersonagem(Personagem personagem) {
    	
    	
        // Comando SQL para inserir uma nova raça com os valores especificados
        String sql = "INSERT INTO personagens ( nome, vida, escudo, poderFisico, poderHabilidade, racaId, arquetipoId) "
        		+ "VALUES ( ?, ?, ?, ?, ?, ?, ?)";

        // Tenta conectar ao banco de dados e preparar a execução do comando SQL
        try (Connection conexao = DatabaseConnection.conectar();
             // Prepara a instrução SQL e especifica que as chaves geradas serão retornadas
             PreparedStatement stmt = conexao.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)) {
        	
        	
            // Define os valores dos parâmetros na instrução SQL
            stmt.setString(1, personagem.getNome());
            stmt.setInt(2, personagem.getVida());
            stmt.setInt(3, personagem.getEscudo());
            stmt.setInt(4, personagem.getPoderFisico());
            stmt.setInt(5, personagem.getPoderHabilidade());
            stmt.setInt(6, personagem.getPersonagem1RacaId());
            stmt.setInt(7, personagem.getPersonagem1ArquetipoId());
            stmt.executeUpdate();

            // Obtém as chaves geradas pelo banco (neste caso, o ID da raça inserida)
            //ResultSet generatedKeys = stmt.getGeneratedKeys();
            //if (generatedKeys.next()) {
                // Atribui o ID gerado à instância de Raca
              //  personagem.setId(generatedKeys.getInt(1));
            //}

            // Mensagem de confirmação de que a raça foi salva com sucesso
            //System.out.println("Personagem " + personagem.getNome() );
            
            
            
        } catch (SQLException e) {
            // Em caso de erro, imprime o stack trace para facilitar a identificação do problema
            e.printStackTrace();
        }
    }
}
