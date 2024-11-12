package entities;

import repository.RepositoryPersonagem;
import utilities.Aleatoridade;

public class Batalha {
	
	private String vencedor;
	private String lutador1;
	private String lutador2;
	

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
			
			lutador1 = personagem1.getNome();
			lutador2 = personagem2.getNome();
			
		}else {
			System.out.println("Iniciando batalha " + personagem2.getNome() + " Ataca primeiro o " + personagem1.getNome() );
			batalha(personagem2 ,personagem1);
			
			lutador1 = personagem2.getNome();
			lutador2 = personagem1.getNome();
		}
		
		System.out.println();
		
		System.out.println("===================================");
		
		System.out.println();
	}
	
	private void batalha(Personagem jogador1, Personagem jogador2) {
		
		Aleatoridade aleatoriedade = new Aleatoridade();
	
		int contador = 0; 
		
		
		
		while (true) {
			
			if (jogador2.getVida() <= 0) {
				System.out.println();
				System.out.println("Jogador 1: " + jogador1.getNome() + " Venceu o Jogador 2: "+ jogador2.getNome());
				System.out.println();
				
				vencedor = jogador1.getNome();
				
				break;
			}
			
			if (jogador1.getVida() <= 0) {
				System.out.println();
				System.out.println("Jogador 2: " + jogador2.getNome() + " Venceu o Jogador 1: "+ jogador1.getNome());
				System.out.println();
				
				vencedor = jogador2.getNome();
				
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
	}

	public String getVencedor() {
		return vencedor;
	}

	public void setVencedor(String vencedor) {
		this.vencedor = vencedor;
	}

	public String getLutador1() {
		return lutador1;
	}

	public void setLutador1(String lutador1) {
		this.lutador1 = lutador1;
	}

	public String getLutador2() {
		return lutador2;
	}

	public void setLutador2(String lutador2) {
		this.lutador2 = lutador2;
	}
	
	
}
