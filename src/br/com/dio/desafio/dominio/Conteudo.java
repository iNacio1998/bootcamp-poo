package br.com.dio.desafio.dominio;

public abstract class Conteudo {

	private String titulo, descricao;
	protected static final double XP = 10;
	
	public abstract double CalcularXp();

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public static double getXp() {
		return XP;
	}
	
	
}
