package utilities;

import entities.Arquetipo;
import repository.RepositoryArquetipo;

public class PopulandoArquetipo {

	public void PopulandoArquetipo() {
		
		Arquetipo arquetipo = new Arquetipo();
		RepositoryArquetipo repositoryArquetipo = new RepositoryArquetipo();
		
		arquetipo.setNome("Mago");
    	arquetipo.setBonusVida(50);
    	arquetipo.setBonusEscudo(20);
    	arquetipo.setBonusPoderFisico(30);
    	arquetipo.setBonusPoderHabilidade(150);
    	repositoryArquetipo.salvarArquetipo(arquetipo);
    	
    	arquetipo.setNome("Guerreiro");
    	arquetipo.setBonusVida(150);
    	arquetipo.setBonusEscudo(100);
    	arquetipo.setBonusPoderFisico(120);
    	arquetipo.setBonusPoderHabilidade(30);
    	repositoryArquetipo.salvarArquetipo(arquetipo);
    	
    	arquetipo.setNome("Paladino");
    	arquetipo.setBonusVida(120);
    	arquetipo.setBonusEscudo(80);
    	arquetipo.setBonusPoderFisico(100);
    	arquetipo.setBonusPoderHabilidade(50);
    	repositoryArquetipo.salvarArquetipo(arquetipo);
    	
    	arquetipo.setNome("Clérigo");
    	arquetipo.setBonusVida(100);
    	arquetipo.setBonusEscudo(60);
    	arquetipo.setBonusPoderFisico(40);
    	arquetipo.setBonusPoderHabilidade(100);
    	repositoryArquetipo.salvarArquetipo(arquetipo);
    	
    	arquetipo.setNome("Bardo");
    	arquetipo.setBonusVida(80);
    	arquetipo.setBonusEscudo(40);
    	arquetipo.setBonusPoderFisico(50);
    	arquetipo.setBonusPoderHabilidade(90);
    	repositoryArquetipo.salvarArquetipo(arquetipo);
    	
    	arquetipo.setNome("Arqueiro");
    	arquetipo.setBonusVida(90);
    	arquetipo.setBonusEscudo(30);
    	arquetipo.setBonusPoderFisico(80);
    	arquetipo.setBonusPoderHabilidade(80);
    	repositoryArquetipo.salvarArquetipo(arquetipo);
    	
    	arquetipo.setNome("Ferreiro");
    	arquetipo.setBonusVida(140);
    	arquetipo.setBonusEscudo(120);
    	arquetipo.setBonusPoderFisico(100);
    	arquetipo.setBonusPoderHabilidade(20);
    	repositoryArquetipo.salvarArquetipo(arquetipo);
    	
    	arquetipo.setNome("Ladrão");
    	arquetipo.setBonusVida(70);
    	arquetipo.setBonusEscudo(30);
    	arquetipo.setBonusPoderFisico(70);
    	arquetipo.setBonusPoderHabilidade(100);
    	repositoryArquetipo.salvarArquetipo(arquetipo);
    	
    	arquetipo.setNome("Monge");
    	arquetipo.setBonusVida(100);
    	arquetipo.setBonusEscudo(70);
    	arquetipo.setBonusPoderFisico(90);
    	arquetipo.setBonusPoderHabilidade(120);
    	repositoryArquetipo.salvarArquetipo(arquetipo);
    	
    	arquetipo.setNome("Druida");
    	arquetipo.setBonusVida(80);
    	arquetipo.setBonusEscudo(50);
    	arquetipo.setBonusPoderFisico(40);
    	arquetipo.setBonusPoderHabilidade(120);
    	repositoryArquetipo.salvarArquetipo(arquetipo);
    	
		
	}
	
}
