package Exercicio01;

public class teste {

	public static void main(String[] args) {

		//funcionario f = new funcionario();
		porteiro p = new porteiro();
		gerente g = new gerente();
		//funcionario p = new porteiro();
		//funcionario g = new gerente();
		
		p.salario = 1000;
		g.salario = 5000;
		g.adicional = 1000;
		
		//System.out.println(f.getBonificacao());
		//System.out.println(g.getBonificacao(500));
		
		financeiro fin = new financeiro();
		fin.registraFuncionario(g);
		
		System.out.println(fin.totalBonus);
	}

}
