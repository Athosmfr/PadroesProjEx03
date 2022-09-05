package Exercicio03;

//import java.util.ArrayList;

public class Aluno {

	public String nome;
	public String cpf;
	public Disciplina disciplina;
	//public ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();
	  
	  public String Aprovacao() {
		  if(disciplina.gerarResultado() == true) {
			  return "Aprovado";
		  } 
		  return "Reprovado";
	  }
	  
	  
//	public String Aprovacao() {
//		for (Disciplina aprov: disciplinas) {			
//			if(aprov.gerarResultado() == true) {				
//			return System.out.println("Aprovado");
//			}
//		}	
//			return System.out.println("Reprovado");
//		}
	  
	  
}
