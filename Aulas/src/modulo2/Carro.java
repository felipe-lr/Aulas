package modulo2;

public class Carro {
	int roda;
	String cor;
	String modelo;
	String placa;
	int anoDeFabricao;
	boolean ligado;
	
	
	void ligar() {	
		if (!ligado) {
			ligado = true;
			System.out.println("ligando");
		}
	}
	
	void desligar() {
		if (ligado) {
			ligado = false;
			System.out.println("Desligando");
		}
	}
	
	
}
