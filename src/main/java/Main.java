import java.sql.SQLException;

import entities.Batalha;
import entities.Personagem;
import repository.RepositoryArquetipo;
import repository.RepositoryPersonagem;
import repository.RepositoryRaca;
import utilities.IniciandoBanco;


public class Main {

	public static void main(String[] args) throws SQLException {

		
		IniciandoBanco iniciandoBanco = new IniciandoBanco();
		iniciandoBanco.IniciandoBanco();
		
	
		RepositoryRaca repositoryRaca = new RepositoryRaca();
		RepositoryArquetipo repositoryArquetipo = new RepositoryArquetipo();
		RepositoryPersonagem repositoryPersonagem = new RepositoryPersonagem();
		
		Personagem personagem = new Personagem("Andre", repositoryRaca.buscarRacaPorNome("Humanos")  , repositoryArquetipo.buscarArquetipoPorNome("Mago"));
		
		repositoryPersonagem.salvarPersonagem(personagem);
		
		System.out.println(personagem);
		
		
		Personagem personagem2 = new Personagem("Eduar", repositoryRaca.buscarRacaPorNome("Elfos")  , repositoryArquetipo.buscarArquetipoPorNome("Bardo") );
		repositoryPersonagem.salvarPersonagem(personagem2);
		
		Batalha batalha = new Batalha();
		
		batalha.iniciaBatalha();

		
		//System.out.println(repositoryPersonagem.buscarPersonagemPorId(1));
		
		
		
		
		
		

		
	}

}
