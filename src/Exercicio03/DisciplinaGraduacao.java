package Exercicio03;

public class DisciplinaGraduacao extends Disciplina {

	@Override
	public boolean gerarResultado() {
		// TODO Auto-generated method stub
		if(calculoMedia() >= 7) {
			return true;
		}
		return false;
	}

}
