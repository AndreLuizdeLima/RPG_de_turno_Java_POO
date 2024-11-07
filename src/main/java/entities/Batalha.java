package entities;

import repository.RepositoryPersonagem;
import utilities.Aleatoridade;

public class Batalha {

	public void iniciaBatalha() {
		
		Aleatoridade aleatoriedade = new Aleatoridade();
		
		int quemJoga = aleatoriedade.quemJoga();
		
		RepositoryPersonagem repositoryPersonagem = new RepositoryPersonagem();
		
		if (quemJoga == 1) {
			
			batalha(repositoryPersonagem.buscarPersonagemPorId(1) ,repositoryPersonagem.buscarPersonagemPorId(2));
		}else {
			
			batalha(repositoryPersonagem.buscarPersonagemPorId(2) ,repositoryPersonagem.buscarPersonagemPorId(1));
		}
		
		
	}
	
	private String batalha(Personagem jogador1, Personagem jogador2) {
		
		Aleatoridade aleatoriedade = new Aleatoridade();
	
		
		String ganhador = null;
		int contador = 0; 
		int parada = 1;
		
		while (parada == 1){
			
			int vidaJogador1 = jogador1.getVida();
			int escudoJogador1 = jogador1.getEscudo();
			int poderFisico1 = jogador1.getPoderFisico();
			int poderHabilidade1 = jogador1.getPoderHabilidade();
			
			
			int vidaJogador2 = jogador2.getVida();
			int escudoJogador2 = jogador2.getEscudo();
			int poderFisico2 = jogador2.getPoderFisico();
			int poderHabilidade2 = jogador2.getPoderHabilidade();
			
			
			
			if (contador % 2 == 0 ) {
				
				//Calculando Dano a ser aplicado ao jogador 2
				
				int ataque = ((poderFisico1 + poderHabilidade1)* (aleatoriedade.rolaDados() * 10));
				
				if (ataque < escudoJogador2) {
					
					escudoJogador2 = ataque - escudoJogador2;
					
					jogador2.setEscudo(escudoJogador2);
					
					
					
				} else { // ataque > escudoJogador2
					// ataque for 500 e o escudo for 200
					
					int diferencaAtaque = ataque - escudoJogador2;
					
					escudoJogador2 = ataque - escudoJogador2;
					vidaJogador2 = diferencaAtaque - vidaJogador2;
					
					jogador2.setVida(vidaJogador2);
					
					System.out.println("Jogador 2 sendo atacado");
				}
				
				
				
			}else {
				
				//Calculando Dano a ser aplicado ao jogador 1
				
				int ataque = ((poderFisico2 + poderHabilidade2)* (aleatoriedade.rolaDados() * 10));
				
				if (ataque < escudoJogador1) {
					
					escudoJogador1 = ataque - escudoJogador1;
					
					jogador1.setEscudo(escudoJogador1);
					
				} else { // ataque > escudoJogador1
					// ataque for 500 e o escudo for 200
					
					int diferencaAtaque = ataque - escudoJogador1;
					
					escudoJogador1 = ataque - escudoJogador1;
					vidaJogador1 = diferencaAtaque - vidaJogador1;
					
					jogador1.setVida(vidaJogador1);
				
					System.out.println("Jogador 2 sendo atacado");
					
				}
				
				
				
				
			}
			
			if (jogador1.getVida() <= 0) {
				
				parada += 1;
				
				System.out.println("Jogador2 ganhou");
				
			} 
			
			if (jogador2.getVida() <= 0 ) {
				
				parada += 1;
				
				System.out.println("Jogador 1 ganhou");
				
			}
				
			
		
			contador += 1;
		}
		
		return ganhador;
		
	}
	
}
