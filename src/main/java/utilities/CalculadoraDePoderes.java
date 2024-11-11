package utilities;

import entities.Arquetipo;
import entities.Raca;
import repository.RepositoryArquetipo;
import repository.RepositoryRaca;

public class CalculadoraDePoderes {

	

	public int calculaVida (int racaId, int arquetipoId) {
		int vida = 1000;
			
		RepositoryArquetipo repositoryArquetipo = new RepositoryArquetipo();
		RepositoryRaca repositoryRaca = new RepositoryRaca();
		
		Raca raca = repositoryRaca.buscarRacaPorObjetoId(racaId);
		Arquetipo arquetipo = repositoryArquetipo.buscarArquetipoPorId(arquetipoId);
		
		int racaBonusVida = raca.getBonusVida();
		int arquetipoBonusVida = arquetipo.getBonusVida();
		
		vida += racaBonusVida + arquetipoBonusVida;
		
		return vida;
	}
	
	public int calculaEscudo(int racaId, int arquetipoId) {
		int escudo = 1000;
		
		RepositoryArquetipo repositoryArquetipo = new RepositoryArquetipo();
		RepositoryRaca repositoryRaca = new RepositoryRaca();
		
		Raca raca = repositoryRaca.buscarRacaPorObjetoId(racaId);
		Arquetipo arquetipo = repositoryArquetipo.buscarArquetipoPorId(arquetipoId);
		
		int racaBonusEscudo = raca.getBonusEscudo();
		int arquetipoBonusEscudo = arquetipo.getBonusEscudo();
		
		escudo += racaBonusEscudo + arquetipoBonusEscudo;
		
		return escudo;
	}
	
	public int calculaPoderFisico(int racaId, int arquetipoId) {
		int poderFisico = 200;
		
		RepositoryArquetipo repositoryArquetipo = new RepositoryArquetipo();
		RepositoryRaca repositoryRaca = new RepositoryRaca();
		
		Raca raca = repositoryRaca.buscarRacaPorObjetoId(racaId);
		Arquetipo arquetipo = repositoryArquetipo.buscarArquetipoPorId(arquetipoId);
		
		int racaPoderFisico = raca.getBonusPoderFisico();
		int arquetipoPoderFisico = arquetipo.getBonusPoderFisico();
		
		poderFisico += racaPoderFisico + arquetipoPoderFisico;
		
		return poderFisico;
	}
	
	public int calculaPoderHabilidade(int racaId, int arquetipoId) {
		int poderHabilidade = 200;
		
		RepositoryRaca repositoryRaca = new RepositoryRaca();
		RepositoryArquetipo repositoryArquetipo = new RepositoryArquetipo();

		Raca raca = repositoryRaca.buscarRacaPorObjetoId(racaId);
		Arquetipo arquetipo = repositoryArquetipo.buscarArquetipoPorId(arquetipoId);
		
		int racaPoderHabilidade = raca.getBonusPoderHabilidade();
		int arquetipoPoderHabilidade = arquetipo.getBonusPoderHabilidade();
		
		poderHabilidade += racaPoderHabilidade + arquetipoPoderHabilidade;
		
		
		return poderHabilidade;
	}
	
}
