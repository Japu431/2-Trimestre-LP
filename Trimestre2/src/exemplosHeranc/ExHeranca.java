package exemplosHeranc;

public class ExHeranca {
	public static void main(String[] args) {
		Programador Prog= new Programador();
		Prog.setLing("C#" , "Windows");
		Prog.setDados("Matheus", "matheus8203@fito.br" , "Prog.Estágiario" , 1.045);
	
		System.out.println("Nome Programador: " + Prog.getNome());
		System.out.println("Cargo: " + Prog.getCargo());
		System.out.println("Linguagem: " + Prog.GetLing());
		System.out.println("Salario: " + Prog.getSalario());
		System.out.println("Email: " + Prog.getEmail());
	}
}
