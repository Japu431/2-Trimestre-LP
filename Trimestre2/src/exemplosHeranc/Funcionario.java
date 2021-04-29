package exemplosHeranc;

public class Funcionario {
	private String _Nome , _Email , _Cargo;
	private double _Salario;
	
	void setDados(String Nome , String Email , String Cargo , double Salario) {
		this._Nome = Nome;
		this._Email = Email;
		this._Cargo = Cargo;
		this._Salario = Salario;
	}
	
	public String getNome() {
		return this._Nome;
	}
	
	public String getEmail() {
		return this._Email;
	}

	public String getCargo() {
		return this._Cargo;
	}
	
	public double getSalario() {
		return this._Salario;
	}
}
