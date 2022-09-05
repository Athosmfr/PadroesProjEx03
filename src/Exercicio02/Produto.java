package Exercicio02;

public class Produto extends baseProduto {

	@Override
	public void calculaFrete() {
		this.Preco += (this.Peso/1000) * 0.8  + (this.Volume/1000000) + (this.Preco * 0);
	}
	
}
