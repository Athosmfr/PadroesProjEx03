package Exercicio03;

public class DisciplinaEspecializacao extends Disciplina {

	@Override
	public boolean gerarResultado() {
		// TODO Auto-generated method stub
		if(verificaCategoria() != "D") {
			return true;
		}
		return false;
	}
	
	public String verificaCategoria() {
		if(calculoMedia() >= 8) {
			return "A";
		} else if (calculoMedia() >= 6) {
			return "B";
		} else if (calculoMedia() >= 4) {
			return "C";
		} else {
			return "D";
		}
	}
}
