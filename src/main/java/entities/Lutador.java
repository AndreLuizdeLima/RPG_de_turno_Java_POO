package entities;

public abstract class Lutador {

	protected String nome;
	protected int vida;
	protected int escudo;
	protected int poderFisico;
	protected int poderHabilidade;

	@Override
	public String toString() {
		return "Lutador [nome=" + nome + ", vida=" + vida + ", escudo=" + escudo + ", poderFisico=" + poderFisico
				+ ", poderHabilidade=" + poderHabilidade + ", getNome()=" + getNome() + ", getVida()=" + getVida()
				+ ", getEscudo()=" + getEscudo() + ", getPoderFisico()=" + getPoderFisico() + ", getPoderHabilidade()="
				+ getPoderHabilidade() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
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

	public int getEscudo() {
		return escudo;
	}

	public void setEscudo(int escudo) {
		this.escudo = escudo;
	}

	public int getPoderFisico() {
		return poderFisico;
	}

	public void setPoderFisico(int poderFisico) {
		this.poderFisico = poderFisico;
	}

	public int getPoderHabilidade() {
		return poderHabilidade;
	}

	public void setPoderHabilidade(int poderHabilidade) {
		this.poderHabilidade = poderHabilidade;
	}

}
