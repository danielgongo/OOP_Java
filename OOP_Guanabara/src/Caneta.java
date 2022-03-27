
public class Caneta {

	
	String modelo;
	String cor;
	double ponta;
	int carga;
	boolean tampada;
	
	void status() {
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Uma caneta " + this.cor); //this é auto referência
		System.out.println("Ponta: " + this.ponta);
		System.out.println("Carga: " + this.carga);
		System.out.println("Está tampada? " + this.tampada);
	}
	
	void rabiscar() { //MÉTODO É AÇÃO DA CLASSE!
		if (this.tampada == true) {
			System.out.println("ERRO! Não posso rabiscar");
		}else {
			System.out.println("Posso rabiscar");
		}
	}
	
	void tampar() {
		this.tampada = true;
	}
	
	void destampar() {
		this.tampada = false; 
	}
	
		
}
