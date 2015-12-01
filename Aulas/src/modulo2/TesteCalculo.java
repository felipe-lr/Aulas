package modulo2;

public class TesteCalculo {
	
	public static void main(String[] args) {
		double valor = 134.9;
		
		testeCalculadora(valor, 12);
		testeCalculadoraV2(2.8, valor);
		testeCalculadoraV3();
	}
	
	static void testeCalculadora(double valor1, double valor2) {
		System.out.println("Calculando com a vers�o 1. N�meros:" + valor1  + " e " + valor2);
		
		Calculadora calculadora = new Calculadora();
		
		calculadora.soma(valor1, valor2);
		calculadora.subtracao(valor1, valor2);
		calculadora.divisao(valor1, valor2);
		calculadora.multiplicacao(valor1, valor2);
	}

	static void testeCalculadoraV2(double valor1, double valor2) {
		System.out.println("\nCalculando com a vers�o 2. N�meros:" + valor1  + " e " + valor2);
		
		CalculadoraV2 calculadora = new CalculadoraV2();
		
		calculadora.soma(valor1, valor2);
		calculadora.subtracao(valor1, valor2);
		calculadora.divisao(valor1, valor2);
		calculadora.multiplicacao(valor1, valor2);
	}

	static void testeCalculadoraV3() {
		System.out.println("\nCalculando com a vers�o 3");
		
		CalculadoraV3 calculadora = new CalculadoraV3();
		
		/*
		 * O uso desta calculadora pode ser feito de duas maneiras.
		 * 1� maneira � fazendo as contas e guardando os resultados
		 */
		double resultadoDivisao = calculadora.divisao(10, 3.7);
		
		double resultadoSubtracao = calculadora.subtracao(34.6, resultadoDivisao);
		
		double resultadoMultiplicacao = calculadora.multiplicacao(resultadoSubtracao, 2);
		
		double resultadoFinal = calculadora.soma(45.897, resultadoMultiplicacao);
		
		System.out.println("\nO resultado das contas pela forma longa �: " + resultadoFinal + "\n");
		
		
		/*
		 * Outra forma de fazer e que � mais elegante e requer menos linhas e menos vari�veis.
		 * Lembrando que no caso da programa��o, na maioria das vezes, menos � mais(ou seja, melhor)
		 * Ver� que o resultado final � o mesmo, mas esta jeito de usar requer mais aten��o;
		 */
		
		resultadoFinal = calculadora.soma(45.897, calculadora.multiplicacao(calculadora.subtracao(34.6, calculadora.divisao(10, 3.7)), 2));
		
		System.out.println("\nO resultado das contas pela forma curta �: " + resultadoFinal);
	}
}
