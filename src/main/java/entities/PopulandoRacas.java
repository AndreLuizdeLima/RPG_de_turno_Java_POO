package entities;

import repository.RepositoryRaca;

public class PopulandoRacas {

	public void PopulandoRacas() {
		
		Raca raca = new Raca();
		RepositoryRaca repositoryRaca = new RepositoryRaca();
		
		raca.setNome("Humanos");
		raca.setVida(1000);
		raca.setBonusVida(100);
		raca.setBonusEscudo(50);
		raca.setBonusPoderFisico(70);
		raca.setBonusPoderHabilidade(80);
		repositoryRaca.salvarRaca(raca);
		
		raca.setNome("Elfo");
		raca.setVida(800);
		raca.setBonusVida(50);
		raca.setBonusEscudo(30);
		raca.setBonusPoderFisico(50);
		raca.setBonusPoderHabilidade(120);
		repositoryRaca.salvarRaca(raca);
		
		raca.setNome("Anões");
		raca.setVida(900);
		raca.setBonusVida(100);
		raca.setBonusEscudo(100);
		raca.setBonusPoderFisico(100);
		raca.setBonusPoderHabilidade(40);
		repositoryRaca.salvarRaca(raca);
		
		raca.setNome("Goblins");
		raca.setVida(600);
		raca.setBonusVida(30);
		raca.setBonusEscudo(20);
		raca.setBonusPoderFisico(40);
		raca.setBonusPoderHabilidade(70);
		repositoryRaca.salvarRaca(raca);
		
		raca.setNome("Orcs");
		raca.setVida(1200);
		raca.setBonusVida(120);
		raca.setBonusEscudo(8);
		raca.setBonusPoderFisico(150);
		raca.setBonusPoderHabilidade(30);
		repositoryRaca.salvarRaca(raca);
		
	}


	
	
}
