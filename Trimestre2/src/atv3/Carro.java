package atv3;

public class Carro {
	private String Modelo;
	private int Ano;
	private double Preco;
	
	
	public Carro(String Modelo , int Ano , double Preco) {
		this.Modelo = Modelo;
		this.Ano = Ano;
		this.Preco = Preco;
	}
	
	
	public void ExibeCarro() {
		System.out.println("Modelo: " + this.Modelo);
		System.out.println("Ano: " + this.Ano);
		System.out.println("Preço : " + this.Preco);
	}
}
