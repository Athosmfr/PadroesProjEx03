package Exercicio01;

import java.util.ArrayList;

public class diretor extends funcionario {

	//ArrayList funcionario
	
	ArrayList<funcionario> funcionarios = new ArrayList<funcionario>();
	
	@Override
	public double getBonificacao() {
		return this.salario * 0.015 * funcionarios.size(); 
	}
	
	
	//dif classe abstrata e concreta
}
