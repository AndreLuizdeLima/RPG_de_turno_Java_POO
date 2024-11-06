import java.sql.SQLException;

import entities.Personagem;
import entities.PopulandoArquetipo;
import entities.PopulandoRacas;
import repository.RepositoryArquetipo;
import repository.RepositoryPersonagem;
import repository.RepositoryRaca;


public class Main {

	public static void main(String[] args) throws SQLException {
	
		PopulandoRacas popularRacas = new PopulandoRacas();
		PopulandoArquetipo popularArquetipos = new PopulandoArquetipo();
		popularArquetipos.PopulandoArquetipo();
		popularRacas.PopulandoRacas();
		RepositoryRaca repositoryRaca = new RepositoryRaca();
		RepositoryArquetipo repositoryArquetipo = new RepositoryArquetipo();
		RepositoryPersonagem repositoryPersonagem = new RepositoryPersonagem();
		// nome raca e arquetipo
		repositoryRaca.buscarRacaPorNomeObjeto("Elfo");
		Personagem personagem = new Personagem("Andre", repositoryRaca.buscarRacaPorNome("Elfo"), repositoryArquetipo.buscarArquetipoPorNome("Magos"));
		//repositoryPersonagem.salvarPersonagem(personagem);
		personagem.setandoVida();
		
	}

}
