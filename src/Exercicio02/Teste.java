package Exercicio02;

public class Teste {

	public static void main(String[] args) {
		
		Produto miniPc = new Produto();
		
		miniPc.Nome = "MiniPC";
		miniPc.Peso = 500;
		miniPc.Volume = 200;
		miniPc.Preco = 5000;
		miniPc.calculaFrete();
		
		System.out.println(miniPc.Preco);
		
		Produto soundBar = new Produto();
		
		soundBar.Nome = "MiniPC";
		soundBar.Preco = 5000;
		soundBar.Peso = 670;
		soundBar.Volume = 8000;
		soundBar.calculaFrete();
		
		System.out.println(soundBar.Preco);
		
		ProdutoPremium superServidor = new ProdutoPremium();
		
		superServidor.Nome = "SuperServidor";
		superServidor.Preco = 30000;
		superServidor.Peso = 3800;
		superServidor.Volume = 120000;
		superServidor.calculaFrete();
		
		System.out.println(superServidor.Preco);
		
		// TEM QUE ADICIONAR PESO E VOLUME AINDA NO EX!
		
	}
	
}
