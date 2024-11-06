import java.sql.SQLException;

import entities.Personagem;
import repository.RepositoryArquetipo;
import repository.RepositoryPersonagem;
import repository.RepositoryRaca;


public class Main {

	public static void main(String[] args) throws SQLException {
	
		//IniciandoBanco iniciandoBanco = new IniciandoBanco();
		//iniciandoBanco.IniciandoBanco();
		
		RepositoryRaca repositoryRaca = new RepositoryRaca();
		RepositoryArquetipo repositoryArquetipo = new RepositoryArquetipo();
		RepositoryPersonagem repositoryPersonagem = new RepositoryPersonagem();
		
		Personagem personagem = new Personagem("Andre", repositoryRaca.buscarRacaPorNome("Humanos")  , repositoryArquetipo.buscarArquetipoPorNome("Mago") );
		repositoryPersonagem.salvarPersonagem(personagem);
		
		
	}

}
