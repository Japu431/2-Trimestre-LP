package exemplosHeranc;

public class Programador extends Funcionario {
	private String _Linguagem , _SistemaOperacional;
	
	void setLing(String ling , String SO) {
		this._Linguagem = ling;
		this._SistemaOperacional = SO;
	}
	
	public String GetLing() {
		return this._Linguagem;
	}
	
	public String getSistemaOP() {
		return this._SistemaOperacional;
	}
	
}
