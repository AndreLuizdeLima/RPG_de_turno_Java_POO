package entities;

import repository.RepositoryArquetipo;

public class PopulandoArquetipo {

	public void PopulandoArquetipo() {
		
		Arquetipo arquetipo = new Arquetipo();
		RepositoryArquetipo repositoryArquetipo = new RepositoryArquetipo();
		
		arquetipo.setNome("Guerreiro");
    	arquetipo.setBonusVida(1000);
    	arquetipo.setBonusEscudo(50);
    	arquetipo.setBonusPoderFisico(50);
    	arquetipo.setBonusPoderHabilidade(50);
    	
    	repositoryArquetipo.salvarArquetipo(arquetipo);
		
	}
	
}
