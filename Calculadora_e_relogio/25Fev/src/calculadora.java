import javax.swing.JOptionPane;

public class calculadora{
	
	public static void main(String[] args) {
		//Declara��o de vari�veis
		double numero1 = 0;
		double numero2 = 0;
		
		//Ler n�meros
		numero1 = Double.parseDouble(JOptionPane.showInputDialog("Introduza o n�mero 1"));
		numero2 = Double.parseDouble(JOptionPane.showInputDialog("Introduza o n�mero 2"));
		
		//OUTPUTS
	
		// Resultado da Soma
		System.out.println("--------------- Soma ---------------");
		System.out.println();
		Imprimir(numero1, numero2, Soma(numero1, numero2), "+" );
		System.out.println();
		
		// Resultado da Subtra��o
		System.out.println("--------------- Subtra��o ---------------");
		System.out.println();
		Imprimir(numero1, numero2, Subtracao(numero1, numero2), "-" );
		System.out.println();
		
		// Resultado da Divis�o
		System.out.println("--------------- Divis�o ---------------");
		System.out.println();
		Imprimir( numero1, numero2, Divisao(numero1, numero2), "/" );
		System.out.println();
		
		// Resultado da Multiplica��o
		System.out.println("--------------- Multiplica��o ---------------");
		System.out.println();
		Imprimir(numero1, numero2, Multiplicacao(numero1, numero2), "*" );
		System.out.println();
	}
	
	public static double Soma(double n1, double n2) {
		
		return n1 + n2;
	}
	
	public static double Divisao(double n1, double n2) {
		
		return n1 / n2;
	}
	
	public static double Multiplicacao(double n1, double n2) {
		
		return n1 * n2;
	}
	
	public static double Subtracao(double n1, double n2) {
		
		return n1 - n2;
	}
	
	public static void Imprimir( double numero1, double numero2, double resultado, String operador) {
		
		System.out.printf("%.2f " + operador + " %.2f = %.2f %n", numero1, numero2, resultado);
	}
	
}