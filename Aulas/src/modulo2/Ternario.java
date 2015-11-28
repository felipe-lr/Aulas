package modulo2;

public class Ternario {

	public static void main(String[] args) {
		int x=0;
		String saudacao;
		
		if (x>10){
			saudacao="oi";
		}else{
			saudacao="tchau";
		}

		System.out.println(saudacao);
		
		saudacao = x>10 ? "oi" : "tchau";
		
		//condicao ? verdadeiro : false;
		
		System.out.println(saudacao);
	}

}
