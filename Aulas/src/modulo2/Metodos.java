package modulo2;

public class Metodos {
	
	public static void main(String[] args) {
		Metodos myClass = new Metodos();
		
		myClass.exercicio10();
		myClass.exercicio19();
	}
	
	void exercicio1(){
		int x=2;
		
		if (x==2) {
			System.out.println("a");
		}
	}
	
	void exercicio2() {
		int x=0;
		
		if (x==2){
			System.out.println("a");
		} else if (x==3){
			System.out.println("b");
		}
	}
	
	void exercicio4() {
		int x=0;
		
		if (x==2){
			System.out.println("a");
		}else {
			System.out.println("b");		 			
		}
	}
	
	void exercicio7() {
		int x=5;
		
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
	
	void exercicio8() {
		int x=0;

		while(x<10){
			System.out.println(x);
			x=x+1;
		}
	}
	
	void exercicio10() {
		int x=0;
			
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
	
	void exercicio19(){
		int x=0;
			
		while (x<15){
			System.out.println(x);
			x = x + 3;
		}
	}
	 
	void exercicio21() {
		int x=0;
			
		do{
			System.out.println(x);
				x = x + 1;
		}while (x<10);		
	}
	 
	 
	void exercicio22(){
		for(int x=0; x<10; x=x+1){
			System.out.println("y");
		}
	}
}



	
	

	
	




	
 

