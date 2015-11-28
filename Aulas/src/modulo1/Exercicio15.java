package modulo1;

public class Exercicio15 {

	public static void main(String[] args) {
		
		/*
		 * codigo que da o retorno "a" enquanto o valor de x for menor que 10
		 * depois ele subtrai o valor por 9
		 * nesse caso deu loop infinito
		 */
		
		
		int x=9;
		
		while (x<10){
			System.out.println("a");
			x = x - 9;
		}
	}
}
