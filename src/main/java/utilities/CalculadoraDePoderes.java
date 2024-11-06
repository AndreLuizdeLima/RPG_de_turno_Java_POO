package utilities;

import entities.Arquetipo;
import entities.Raca;
import repository.RepositoryArquetipo;
import repository.RepositoryRaca;

public class CalculadoraDePoderes {

	RepositoryArquetipo repositoryArquetipo = new RepositoryArquetipo();
	RepositoryRaca repositoryRaca = new RepositoryRaca();
	
	
	public int calculaVida (int racaId, int arquetipoId) {
		int vida = 0;
			
		Raca raca = repositoryRaca.buscarRacaPorObjetoId(racaId);
		//Arquetipo arquetipo2 = repositoryArquetipo.buscarArquetipoPorId(arquetipoId);
		
		int racaBonusVida = raca.getBonusVida();
		//int arquetipoBonusVida = arquetipo2.getBonusVida();
		
		vida = racaBonusVida;
		
		return vida;
	}
	
	public int calculaEscudo(int racaId, int arquetipoId) {
		int escudo = 0;
		
		return escudo;
	}
	
	public int calculaPoderFisico(int racaId, int arquetipoId) {
		int poderFisico = 0;
		
		
		return poderFisico;
	}
	
	public int calculaPoderHabilidade(int racaId, int arquetipoId) {
		int poderHabilidade = 0;
		
		
		return poderHabilidade;
	}
	
}
