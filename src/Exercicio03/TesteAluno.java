package Exercicio03;

public class TesteAluno {
 
	public static void main(String[] args) {
		
		// Criando um aluno
		Aluno a01 = new Aluno();
		a01.nome = "Athos Mantovani Feres Rodrigues";
		a01.cpf = "126.699.889-62";
		
		// Criando e Atribuindo uma disciplina
		DisciplinaGraduacao dataScience = new DisciplinaGraduacao();
		dataScience.nome = "Data Science";
		dataScience.codigo = 5;
		dataScience.cargaHoraDisciplina = 80;
		a01.disciplina = dataScience;
		
		// Recebendo valores das notas
		double[] notaDataScience = {7, 8, 10, 7};
		
		// Atribuindo as notas
		a01.disciplina.notas = notaDataScience;
		
		// Saida
		System.out.println("Aluno: " + a01.nome);
		System.out.println("Business Intelligence - Media: " + (a01.disciplina.calculoMedia()));
		System.out.println("Situação: " + a01.Aprovacao() + "\n");
		
		// ---------------------------------------------------------------------------------------------------------------------
	
		// Criando outro aluno
		Aluno a02 = new Aluno();
		a02.nome = "Arnaldo Schuarzeneger";
		a02.cpf = "126.699.889-60";
		
		// Criando e Atribuindo uma disciplina
		DisciplinaEspecializacao bI = new DisciplinaEspecializacao();
		dataScience.nome = "Business Intelligence";
		dataScience.codigo = 3;
		dataScience.cargaHoraDisciplina = 60;
		a02.disciplina = bI;
				
		//Recebendo valores das notas
		double[] notabI = {4, 3};
			
		// Atribuindo as notas
		a02.disciplina.notas = notabI;
				
		// Saida
		System.out.println("Aluno: " + a02.nome);
		System.out.println("Business Intelligence - Media: " + ((DisciplinaEspecializacao) a02.disciplina).verificaCategoria());
		System.out.println("Situação: " + a02.Aprovacao());
				
				
				
	}
	
}

// Criando um aluno
//Aluno a01 = new Aluno();
//a01.nome = "Athos Mantovani Feres Rodrigues";
//a01.cpf = "126.699.889-62";

// Criando e Atribuindo uma disciplina
//DisciplinaGraduacao dataScience = new DisciplinaGraduacao();
//dataScience.nome = "Data Science";
//dataScience.codigo = 5;
//dataScience.cargaHoraDisciplina = 80;
//a01.disciplinas.add(dataScience);

//DisciplinaEspecializacao bi = new DisciplinaEspecializacao();
//bi.codigo = 3;
//bi.nome = "Business Intelligence";
//bi.cargaHoraDisciplina = 60;
///a01.disciplinas.add(bi);

// Recebendo valores das notas
//double[] notaDataScience = {7, 8, 10, 7};
//double[] notaBI = {8, 10};

// Atribuindo as notas
//a01.disciplinas.get(0).notas = notaDataScience;
//a01.disciplinas.get(1).notas = notaBI;



// Calculando a Media
//System.out.println("Data Science - Media: " + a01.disciplinas.get(0).calculoMedia());
//System.out.println("Business Intelligence - Media: " + a01.disciplinas.get(1).calculoMedia());