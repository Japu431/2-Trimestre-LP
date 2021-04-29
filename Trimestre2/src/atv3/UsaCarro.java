package atv3;

public class UsaCarro {
	public static void main(String[] args) {
		Carro C1 = new Carro("Civic" , 2000 , 25000.00);
		Carro C2 = new Carro("Corolla" , 2002 , 35000.00);
		Carro C3 = new Carro("Celta" , 2004 , 18000.00);
		
		System.out.println("Info dos Carros");
		
		C1.ExibeCarro();
		C2.ExibeCarro();
		C3.ExibeCarro();
	}
}
