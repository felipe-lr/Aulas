package modulo2;

public class Calculadora {

	//metodo para somar dois doubles
	void soma (double x, double y){
		double resultado = x+y;//somando
		System.out.println("resultado da soma" + resultado);
	}
	
	/*
	 * Metodo para subtrair numeros
	 * recebe dois doubles
	 * imprime resultado
	 */
	void subtracao (double x, double y){
		double resultado = x-y;
		System.out.println("resutado da soma" + resultado);//imprime resultado
	}
	 
	void multiplicacao (double x, double y){
		double resultado = x*y;
		System.out.println("resultado da soma" + resultado);
	}
	 
	void divisao (double x, double y){
		double resultado = x/y;
		System.out.println("resultado da soma" + resultado);
	}
	 
}
