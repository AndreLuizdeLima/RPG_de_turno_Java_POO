package utilities;

import entities.Arquetipo;
import entities.Raca;
import repository.RepositoryArquetipo;
import repository.RepositoryRaca;

public class CalculadoraDePoderes {

	
	
	
	private int racaId;
	private int arquetipoId;

	public int calculaVida (int racaId, int arquetipoId) {
		int vida = 0;
		this.racaId = racaId;
		this.arquetipoId = arquetipoId;
		
		
		RepositoryArquetipo repositoryArquetipo = new RepositoryArquetipo();
		RepositoryRaca repositoryRaca = new RepositoryRaca();
		
		Raca raca = repositoryRaca.buscarRacaPorObjetoId(racaId);
		Arquetipo arquetipo = repositoryArquetipo.buscarArquetipoPorId(arquetipoId);
		
		int racaBonusVida = raca.getBonusVida();
		int arquetipoBonusVida = arquetipo.getBonusVida();
		
		vida = racaBonusVida + arquetipoBonusVida;
		
		System.out.println("Bonus vida Arquetipo "+ arquetipoBonusVida);
		System.out.println("Bonus vida Raca " + racaBonusVida);
		
		System.out.println("Vida "+ vida);
		
		return vida;
	}
	
	public int calculaEscudo(int racaId, int arquetipoId) {
		int escudo = 0;
		
		RepositoryArquetipo repositoryArquetipo = new RepositoryArquetipo();
		RepositoryRaca repositoryRaca = new RepositoryRaca();
		
		Raca raca = repositoryRaca.buscarRacaPorObjetoId(racaId);
		Arquetipo arquetipo = repositoryArquetipo.buscarArquetipoPorId(arquetipoId);
		
		int racaBonusEscudo = raca.getBonusEscudo();
		int arquetipoBonusEscudo = arquetipo.getBonusEscudo();
		
		escudo = racaBonusEscudo + arquetipoBonusEscudo;
		
		return escudo;
	}
	
	public int calculaPoderFisico(int racaId, int arquetipoId) {
		int poderFisico = 0;
		
		RepositoryArquetipo repositoryArquetipo = new RepositoryArquetipo();
		RepositoryRaca repositoryRaca = new RepositoryRaca();
		
		Raca raca = repositoryRaca.buscarRacaPorObjetoId(racaId);
		Arquetipo arquetipo = repositoryArquetipo.buscarArquetipoPorId(arquetipoId);
		
		int racaPoderFisico = raca.getBonusPoderFisico();
		int arquetipoPoderFisico = arquetipo.getBonusPoderFisico();
		
		poderFisico = racaPoderFisico + arquetipoPoderFisico;
		
		return poderFisico;
	}
	
	public int calculaPoderHabilidade(int racaId, int arquetipoId) {
		int poderHabilidade = 0;
		
		RepositoryRaca repositoryRaca = new RepositoryRaca();
		RepositoryArquetipo repositoryArquetipo = new RepositoryArquetipo();

		Raca raca = repositoryRaca.buscarRacaPorObjetoId(racaId);
		Arquetipo arquetipo = repositoryArquetipo.buscarArquetipoPorId(arquetipoId);
		
		int racaPoderHabilidade = raca.getBonusPoderHabilidade();
		int arquetipoPoderHabilidade = arquetipo.getBonusPoderHabilidade();
		
		poderHabilidade = racaPoderHabilidade + arquetipoPoderHabilidade;
		
		
		return poderHabilidade;
	}
	
}
