package Exercicio03;

public abstract class Disciplina {

	public String nome;
	public int codigo;
	public int cargaHoraDisciplina;
	public double[] notas;
	public double media;
	
	public abstract boolean gerarResultado(); 
	
	public double calculoMedia() {
		double soma = 0;
		for(double nota: notas) {
			soma+=nota;
			media = soma/notas.length;
		}
		return media;
	}
	
	
	
}
