package atv2;

public class TestaContaCorrente {
	static ContaCorrente Teste;
	
	public static void main(String[] args) {
		ContaCorrente testaCC = new ContaCorrente();
		
		testaCC.setNomeCliente("Matheus");
		testaCC.setContaCorrente(1111);
		testaCC.setSaldo(150);
		
		System.out.println("Método Exibir sendo executado...\n");
		
		testaCC.Exibe();
		
	}
}
