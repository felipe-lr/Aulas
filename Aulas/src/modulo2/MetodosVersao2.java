package modulo2;

public class MetodosVersao2 {
	
	public static void main(String[] args) {
		MetodosVersao2 myClass = new MetodosVersao2();
		
		myClass.exercicio1(2);
		myClass.exercicio2(2);
		myClass.exercicio4(0);
		myClass.exercicio7(7);
		myClass.exercicio8(0);
		myClass.exercicio10(0);
		myClass.exercicio19(0);
		myClass.exercicio21(0);
		myClass.exercicio22(0,10);
	}
	
	void exercicio1(int x){
		if (x==2) {
			System.out.println("a");
		}
	}
	
	void exercicio2(int x) {
		if (x==2){
			System.out.println("a");
		} else if (x==3){
			System.out.println("b");
		}
	}
	
	void exercicio4(int x) {
		if (x==2){
			System.out.println("a");
		}else {
			System.out.println("b");		 			
		}
	}
	
	void exercicio7(int x) {
		if (x==1){
			System.out.println("first");
		}else if (x==5){
			System.out.println("quinto");
		}else if (x==10){
			System.out.println("Dez");
		}else{
			System.out.println("x");						
		}
	}
	
	void exercicio8(int x){
		while(x<10){
			System.out.println(x);
			x=x+1;
		}
	}
	
	void exercicio10(int x){
		switch (x){
		case 1:
			System.out.println("primeiro");
			break;
		case 5:
			System.out.println("quinto");
			break;
		case 10:
			System.out.println("10");
			break;
		default:
			System.out.println(x);
		}
	}
	
	void exercicio19(int x){
		while (x<15){
			System.out.println(x);
			x = x + 3;
		}
	}
	 
	void exercicio21(int x) {
		do{
			System.out.println(x);
				x = x + 1;
		}while (x<10);		
	}
	 
	 
	void exercicio22(int inicio, int fim){
		for(int x = inicio; x<fim; x++){
			System.out.println("y");
		}
	}
}



	
	

	
	




	
 

