import javax.swing.JOptionPane;

public class calculadora2{
	
	public static void main(String[] args) {

		//Declara��o de vari�veis
		double numero1 = 0;
		double numero2 = 0;
		double resultado = 0;
		
		//Ler n�meros
		numero1 = Double.parseDouble(JOptionPane.showInputDialog("Introduza o n�mero 1"));
		numero2 = Double.parseDouble(JOptionPane.showInputDialog("Introduza o n�mero 2"));
		
		//OUTPUTS
		
		// Resultado da Soma
		System.out.println("--------------- Soma ---------------");
		System.out.println();
		Imprimir(Soma(numero1, numero2), numero1, numero2, " + ");
		System.out.println();
		
		// Resultado da Subtra��o
		System.out.println("--------------- Subtra��o ---------------");
		System.out.println();
		Imprimir(Subtracao(numero1, numero2), numero1, numero2, " - ");
		System.out.println();
		
		// Resultado da Divis�o
		System.out.println("--------------- Divis�o ---------------");
		System.out.println();
		Imprimir(Divisao(numero1, numero2), numero1, numero2, " / ");
		System.out.println();
		
		// Resultado da Multiplica��o
		System.out.println("--------------- Multiplica��o ---------------");
		System.out.println();
		Imprimir(Multiplicacao(numero1, numero2), numero1, numero2, " * ");
		System.out.println();
	}
	
	public static double[] Soma(double n1, double n2) {
		//Declara��o do vetor
		double v[] = {n1 + n2, Math.round(n1 + n2)};
		
		
		//Return do vetor
		return v;
	}
	
	public static double[] Divisao(double n1, double n2) {
		//Declara��o do vetor
		double v[] = {n1 / n2, Math.round(n1 / n2)};
	
		//Return do vetor
		return v;
	}
	
	public static double[] Multiplicacao(double n1, double n2) {
		//Declara��o do vetor
		double v[] = {n1 * n2, Math.round(n1 * n2)};
	
		//Return do vetor
		return v;
	}
	
	public static double[] Subtracao(double n1, double n2) {
		
		//Declara��o do vetor
		double v[] = {n1 - n2, Math.round(n1 - n2)};
		
		
		//Return do vetor
		return v;
	}
	
	public static void Imprimir(double[] v, double n1, double n2, String operador) {
		for (int i = 0; i < v.length; i++) {
			System.out.printf("%.2f " + operador + " %.2f = %.2f %n", n1, n2, v[i]);
		}
	}
	
}