package Ex_01;

public class Lampada {

	String marca;
	String tipo;
	int watts;
	double volts;
	double valor;
	boolean ligada;
	
	void ligar () {
		
		ligada = true;
		
		
	}
	
	void desligar() {
		ligada = false;
		
	}
	
	void mostrarEstado() {
		if (ligada) {
			System.out.println("A l�mpada est� ligada");
		}else {
			System.out.println("A l�mpada est� desligada");
		}
	}
	
	void mudarEstado() {
		if (ligada) {
			desligar();
			System.out.println("favor desligar");
		}else {
			ligar();
			System.out.println("favor ligar");
		}
	}
}
