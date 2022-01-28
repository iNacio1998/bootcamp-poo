package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{

	private int cargaHoraria;
	
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	@Override
	public String toString() {
		return "Carga Horaria:  \ndata:" + cargaHoraria 
				+ "\nTitulo: " + getTitulo() 
				+ "\nDescrição: " + getDescricao();
	}
	
	@Override
	public double CalcularXp() {
		// TODO Auto-generated method stub
		return XP + 10;
	}
	
	
	
}
