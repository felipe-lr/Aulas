package modulo2;

public class CalculadoraV3 {

	double soma (double x, double y){
		double resultado = x+y;//somando
		imprimirResultado(resultado, "soma");
		return resultado;
	}
	
	double subtracao (double x, double y){
		double resultado = x-y;
		imprimirResultado(resultado, "subtracao");
		return resultado;
	}
	 
	double multiplicacao (double x, double y){
		double resultado = x*y;
		imprimirResultado(resultado, "mutiplicacao");
		return resultado;
	}
	 
	double divisao (double x, double y){
		double resultado = x/y;
		imprimirResultado(resultado, "divisao");	
		return resultado;
	}
	
	void imprimirResultado(double resultado, String operacao) {
		System.out.println("resultado da " + operacao + " é: " + resultado);
	}
}
