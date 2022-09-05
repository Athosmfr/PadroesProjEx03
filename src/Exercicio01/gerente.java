package Exercicio01;

public class gerente extends funcionario {
//	@Override
//	public double getBonificacao() {
//		return this.salario*0.2;
//	}
	
	
	
	protected double adicional;
	
	//@Override
	//public double getBonificacao() {
	//	return super.getBonificacao()+this.adicional;
	//}
	
	@Override
	public double getBonificacao() {
		return this.salario * 0.15 + this.adicional;
	}
}
