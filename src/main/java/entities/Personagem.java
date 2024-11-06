package entities;

import repository.RepositoryArquetipo;

public class Personagem extends Lutador{

	protected int personagemRacaId;
	protected int personagemArquetipoId;
	
	
	public int getPersonagem1RacaId() {
		return personagemRacaId;
	}



	public void setPersonagem1RacaId(int personagem1RacaId) {
		this.personagemRacaId = personagem1RacaId;
	}



	public int getPersonagem1ArquetipoId() {
		return personagemArquetipoId;
	}



	public void setPersonagem1ArquetipoId(int personagem1ArquetipoId) {
		this.personagemArquetipoId = personagem1ArquetipoId;
	}

	

	


	
	

	@Override
	public String toString() {
		return "Personagem [personagemRacaId=" + personagemRacaId + ", personagemArquetipoId=" + personagemArquetipoId
				+ ", nome=" + nome + ", vida=" + vida + ", escudo=" + escudo + ", poderFisico=" + poderFisico
				+ ", poderHabilidade=" + poderHabilidade + ", getPersonagem1RacaId()=" + getPersonagem1RacaId()
				+ ", getPersonagem1ArquetipoId()=" + getPersonagem1ArquetipoId() + ", toString()=" + super.toString()
				+ ", getNome()=" + getNome() + ", getVida()=" + getVida() + ", getEscudo()=" + getEscudo()
				+ ", getPoderFisico()=" + getPoderFisico() + ", getPoderHabilidade()=" + getPoderHabilidade()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}



	public Personagem(String nome,int personagemRacaId, int personagemArquetipoId) {
		
		this.nome = nome;
		this.personagemRacaId = personagemRacaId;
		this.personagemArquetipoId = personagemArquetipoId;
	}


	public void setandoVida() {
		
		Raca raca = new Raca();
		Arquetipo arquetipo = new Arquetipo();
		RepositoryArquetipo repositoryArquetipo = new RepositoryArquetipo();
		repositoryArquetipo.buscarArquetipoPorNome("Magos");
		int bonusVidaRaca = raca.getBonusVida();
		int bonusVidaArquetipo = arquetipo.getBonusVida();
		
		System.out.println("Bonus de vida: " + nome + "=" +  bonusVidaArquetipo);
		
		
	}
	
	
	
}
