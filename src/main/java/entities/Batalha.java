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
		
		System.out.println();
		
		System.out.println("===================================");
		
		System.out.println();
		
		if (quemJoga == 1) {	
			System.out.println("Iniciando batalha " + personagem1.getNome() + " Ataca primeiro o  " + personagem2.getNome() );
			batalha( personagem1, personagem2);
		}else {
			System.out.println("Iniciando batalha " + personagem2.getNome() + " Ataca primeiro o " + personagem1.getNome() );
			batalha(personagem2 ,personagem1);
		}
		
		System.out.println();
		
		System.out.println("===================================");
		
		System.out.println();
	}
	
	private String batalha(Personagem jogador1, Personagem jogador2) {
		
		Aleatoridade aleatoriedade = new Aleatoridade();
	
		
		String ganhador = null;
		int contador = 0; 
		
		
		
		while (true) {
			
			if (jogador2.getVida() <= 0) {
				System.out.println();
				System.out.println("Jogador 1: " + jogador1.getNome() + " Venceu o Jogador 2: "+ jogador2.getNome());
				System.out.println();
				
				break;
			}
			
			if (jogador1.getVida() <= 0) {
				System.out.println();
				System.out.println("Jogador 2: " + jogador2.getNome() + " Venceu o Jogador 1: "+ jogador1.getNome());
				System.out.println();
				break;
			}
			
			
			
			if(contador % 2 == 0 ) {
				
				
				int ataqueJogador1 = jogador1.getPoderFisico() + jogador1.getPoderHabilidade()  + aleatoriedade.rolaDados();
				System.out.println();
				System.out.println("Ataque do " + jogador1.getNome() + " no jogador "+ jogador2.getNome() + ". ATAQUE:"+ ataqueJogador1);
				
				if(ataqueJogador1 < jogador2.getEscudo()) {
					jogador2.setEscudo(jogador2.getEscudo() - ataqueJogador1);
					System.out.println(ataqueJogador1 + " Descontado do escudo do " + jogador2.getNome() );
					System.out.println();
				}else {
					
					int ataque = ataqueJogador1 - jogador2.getEscudo();
					
					jogador2.setVida(jogador2.getVida() - ataque);
					jogador2.setEscudo(0);
					
					System.out.println(ataque + " Dano sofrido pelo jogador " + jogador2.getNome());
					System.out.println();
					
				}
								
				
				
				contador += 1;
			}else{
				
				int ataqueJogador2 =  jogador2.getPoderFisico() + jogador2.getPoderHabilidade()  + aleatoriedade.rolaDados();
				
				System.out.println("Ataque do " + jogador2.getNome() + " no jogador "+ jogador1.getNome() + ". ATAQUE:"+ ataqueJogador2);
				 
				if(ataqueJogador2 < jogador1.getEscudo()) {
					
					
					jogador1.setEscudo(jogador1.getEscudo() - ataqueJogador2);
					
					
					System.out.println(ataqueJogador2 + " Descontado do escudo do " + jogador1.getNome() );
					
				}else {
					
					int ataque = ataqueJogador2 - jogador1.getEscudo();
					
					jogador1.setVida(jogador1.getVida() - ataque);
					jogador1.setEscudo(0);
					
					System.out.println(ataque + " Dano sofrido pelo jogador" + jogador1.getNome());
					System.out.println();
					
					
				}
				
				
				
				contador += 1;
			}
			
			
			
			
			
		}
		
		
		
		
		return ganhador;
		
	}
	
}
