package Exercicio02;

public class baseProduto implements iProduto {

	public String Nome;
	public double Peso;
	public double Volume;
	public double Preco;
	public double txFrete;
	
	
	@Override
	public void calculaFrete() {
		this.Preco += (this.Peso/1000) * 0.8  + (this.Volume/1000000) + (this.Preco * (this.txFrete));
	}

	
	
}
