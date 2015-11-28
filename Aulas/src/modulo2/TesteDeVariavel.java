package modulo2;

public class TesteDeVariavel {

	
	public static void main(String[] args) {
		Felipe verdana;
		Person pessoa = new Person();
		
		pessoa.nome = "David";
		pessoa.idade = 31;
		pessoa.sobrenome = "Barros";
		
		System.out.println(pessoa.nome);
		
		Carro car = new Carro();
		car.anoDeFabricao = 2015;
		car.roda = 4;

		car.ligar();
		car.ligar();
		car.ligar();
		
		
		car.desligar();
		car.desligar();
		car.desligar();
		car.desligar();
		
		
		
		
		int x= 0 ;
		
		if (x == 10) {
			String a = "teste";
			System.out.println(a);
			
			if (x == 90) {
				System.out.println(a);
			}
		}
		
	}
}
