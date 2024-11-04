package entities;

public class Raca {

	private String nome;
	private int vida;
	private int bonusVida;
	private int bonusEscudo;
	private int bonusPoderFisico;
	private int bonusPoderHabilidade;
	
	


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getBonusVida() {
		return bonusVida;
	}

	public void setBonusVida(int bonusVida) {
		this.bonusVida = bonusVida;
	}

	public int getBonusEscudo() {
		return bonusEscudo;
	}

	public void setBonusEscudo(int bonusEscudo) {
		this.bonusEscudo = bonusEscudo;
	}

	public int getBonusPoderFisico() {
		return bonusPoderFisico;
	}

	public void setBonusPoderFisico(int bonusPoderFisico) {
		this.bonusPoderFisico = bonusPoderFisico;
	}

	public int getBonusPoderHabilidade() {
		return bonusPoderHabilidade;
	}

	public void setBonusPoderHabilidade(int bonusPoderHabilidade) {
		this.bonusPoderHabilidade = bonusPoderHabilidade;
	}

	@Override
	public String toString() {
		return "Raca [nome=" + nome + ", vida=" + vida + ", bonusVida=" + bonusVida + ", bonusEscudo=" + bonusEscudo
				+ ", bonusPoderFisico=" + bonusPoderFisico + ", bonusPoderHabilidade=" + bonusPoderHabilidade + "]";
	}


	
	
	
	
	
	
	
	
	
	
}
