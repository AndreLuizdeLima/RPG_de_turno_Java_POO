package entities;

import repository.RepositoryPersonagem;
import utilities.Aleatoridade;

public class Batalha {

	public void iniciaBatalha() {
		
		Aleatoridade aleatoriedade = new Aleatoridade();
		
		int quemJoga = aleatoriedade.quemJoga();
		
		RepositoryPersonagem repositoryPersonagem = new RepositoryPersonagem();
		Personagem personagem1 = repositoryPersonagem.buscarPersonagemPorId(1);
		Personagem personagem2 = repositoryPersonagem.buscarPersonagemPorId(2);
		
		if (quemJoga == 1) {	
			
			System.out.println("metodo: iniciaBatalha " + personagem1.getNome() + "  Ataca primeiro o  " + personagem2.getNome() );
			batalha( personagem1, personagem2);
		}else {
			System.out.println("metodo: iniciaBatalha" + personagem2.getNome() + " Ataca primeiro o " + personagem1.getNome() );
			batalha(personagem2 ,personagem1);
		}
		
		
	}
	
	private String batalha(Personagem jogador1, Personagem jogador2) {
		
		Aleatoridade aleatoriedade = new Aleatoridade();
	
		
		String ganhador = null;
		int contador = 0; 
		int parada = 1;
		
		
		
		
		return ganhador;
		
	}
	
}
