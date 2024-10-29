package entities;

public class Raca {

	private int id;
	private String nome;
	private int vida;
	private int bonusVida;
	private int bonusEscudo;
	private int bonusPoderFisico;
	private int bonusPoderHabilidade;
	
	
	

	public Raca(int id, String nome, int vida, int bonusVida, int bonusEscudo, int bonusPoderFisico,
			int bonusPoderHabilidade) {
		this.id = id;
		this.nome = nome;
		this.vida = vida;
		this.bonusVida = bonusVida;
		this.bonusEscudo = bonusEscudo;
		this.bonusPoderFisico = bonusPoderFisico;
		this.bonusPoderHabilidade = bonusPoderHabilidade;
	}

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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	
	
	
	
	
	
	
	
	
}
