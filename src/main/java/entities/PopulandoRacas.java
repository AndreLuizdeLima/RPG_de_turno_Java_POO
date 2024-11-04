package entities;

import repository.RepositoryRaca;

public class PopulandoRacas {

	public void PopulandoRacas() {
		
		Raca raca = new Raca();
		RepositoryRaca repositoryRaca = new RepositoryRaca();
		
		raca.setNome("Orc");
		raca.setVida(1000);
		raca.setBonusVida(50);
		raca.setBonusEscudo(50);
		raca.setBonusPoderFisico(50);
		raca.setBonusPoderHabilidade(0);
		repositoryRaca.salvarRaca(raca);
		
		raca.setNome("Elfo");
		raca.setVida(1000);
		raca.setBonusVida(25);
		raca.setBonusEscudo(25);
		raca.setBonusPoderFisico(25);
		raca.setBonusPoderHabilidade(50);
		repositoryRaca.salvarRaca(raca);
		
		
		
	}
	
	
	
}
