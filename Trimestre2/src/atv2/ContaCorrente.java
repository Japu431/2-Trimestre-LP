package atv2;

public class ContaCorrente {
	private int _Conta;
	private String _NomeCliente;
	private float _Saldo;
	
	
	public void setSaldo(float saldo) {
		if(saldo > 0) {
			this._Saldo = saldo;
			return;
		} else {	
			System.out.println("ERRO ao setar / passar o saldo!");
		}		
	}
	
	public void setNomeCliente(String nome) {
		if(nome != "") {
			this._NomeCliente = nome;
		} else {			
			System.out.println("ERRO ao setar o nome!!");
		}
	}
	
	public void setContaCorrente(int CC) {
		if(CC != 0) {
			this._Conta = CC;
		} else {
			System.out.println("ERRO ao setar a Conta Corrente!");
		}
	}
	
	public void Exibe() {
		System.out.println("Nome Cliente: " + this._NomeCliente);
		System.out.println("Conta Corrente: " + this._Conta);
		System.out.println("Saldo: " + this._Saldo);
	}
	
}
