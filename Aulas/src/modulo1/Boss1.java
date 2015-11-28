package modulo1;

public class Boss1 {

	public static void main(String[] args) {
		int x=10;
		int idade=25;
		boolean terminado=false;
		double valor=10.2;
		float valor2=10.2f;
		String kirito="estou vencendo o boss";
		String letra="a";
		char letrab= 'b';
		long anos=idade;
		double valor3=valor2;
		
		if (idade>30){
			System.out.println(idade);
		}else if (idade<18){
			System.out.println("menor de idade" );
		}
		
		if (idade>18)
			System.out.println("maior de idade");
		
		while(valor<20.4){
			System.out.println(valor);
		}
		
		do{
			System.out.println(valor);
		}while (valor<20.4);
			
			
		for(int indice=20;indice>100;indice++){
			System.out.println(indice);
		}
		
			
	}
	
		
}
