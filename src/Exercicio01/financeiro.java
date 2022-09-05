package Exercicio01;

public class financeiro {

	protected double totalBonus = 0;
	
	public void registraFuncionario(funcionario f) { // "Setter"
		this.totalBonus += f.getBonificacao();
	}
	
	
}
