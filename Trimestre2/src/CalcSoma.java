import java.io.IOException;

public class CalcSoma {
		static LeTel LeTeclado;
		static Soma MSoma;
		static Grupo NomesDoGrupo;
				
		public static void main(String[] args) throws NumberFormatException, IOException {
			System.out.println("Calculadora Soma");
			System.out.println("1-Soma N.Inteiro: ");
			System.out.println("2-Soma N.Reais: ");
			System.out.println("3-Soma ou Concatena Strings: ");
			System.out.println("4-Sair");
			System.out.println("\nQual opção? : ");
			int op = Integer.parseInt(LeTel.LeTeclado());
			
			switch(op) {
			case 1: {
				int num1, num2;
				System.out.println("Digite um numero inteiro qualquer: ");
				num1 = Integer.parseInt(LeTel.LeTeclado());
				System.out.println("Digite outro numero inteiro qualquer: ");
				num2 = Integer.parseInt(LeTel.LeTeclado());
				System.out.println("A soma dos N inteiros = " + Soma.MSomaInt(num1 , num2));
				break;
				}
			case 2: {
				float num1, num2;
				System.out.println("Digite um numero real qualquer: ");
				num1 = Float.parseFloat(LeTel.LeTeclado());
				System.out.println("Digite outro numero real qualquer: ");
				num2 = Float.parseFloat(LeTel.LeTeclado());
				System.out.println("A soma dos N Reais = " + Soma.MSomaFloat(num1 , num2));
				break;
				}
			case 3: {
				String num1, num2;
				System.out.println("Digite uma palavra qualquer: ");
				num1 = LeTel.LeTeclado();
				System.out.println("Digite outra uma palavra qualquer: ");
				num2 = LeTel.LeTeclado();
				System.out.println("A Concatenação = " + Soma.MSomaConcat(num1 , num2));
				break;
				}
			case 4: {
				System.out.println("\nSaindo...");	
				Grupo.NomesDoGrupo();
				break;
			}
				default: {
					System.out.println("\nOpção Invalida!!");
				}
			}
		}
	}
