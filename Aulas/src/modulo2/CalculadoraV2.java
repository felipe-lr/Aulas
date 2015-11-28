package modulo2;

public class CalculadoraV2 {

	//metodo para somar dois doubles
	void soma (double x, double y){
		double resultado = x+y;//somando
		imprimirResultado(resultado, "soma");
	}
	
	/*
	 * Metodo para subtrair numeros
	 * recebe dois doubles
	 * imprime resultado
	 */
	void subtracao (double x, double y){
		double resultado = x-y;
		imprimirResultado(resultado, "subtracao");
	}
	 
	void multiplicacao (double x, double y){
		double resultado = x*y;
		imprimirResultado(resultado, "mutiplicacao");
	}
	 
	void divisao (double x, double y){
		double resultado = x/y;
		imprimirResultado(resultado, "divisao");	}
	 
	void imprimirResultado(double resultado, String operacao) {
		System.out.println("resultado da " + operacao + " é: " + resultado);
	}
}
