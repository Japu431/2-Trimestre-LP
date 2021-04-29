package atv4;

public class Filha extends Pai{
	int ano = 4;
	String disciplina = "Linguagem de Programação";
	
	
	public void Mostra() {
		System.out.println("Classe Pai...");
		System.out.println("Pai ano : " + super.ano);
		System.out.println("Pai curso: " + super.curso);
		System.out.println("Classe Filha...");
		System.out.println("Filha ano: " + this.ano);
		System.out.println("Filha disciplina: " + this.disciplina);
	}
}
