
public class Caneta {

	
	String modelo;
	String cor;
	double ponta;
	int carga;
	boolean tampada;
	
	void status() {
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Uma caneta " + this.cor); //this � auto refer�ncia
		System.out.println("Ponta: " + this.ponta);
		System.out.println("Carga: " + this.carga);
		System.out.println("Est� tampada? " + this.tampada);
	}
	
	void rabiscar() { //M�TODO � A��O DA CLASSE!
		if (this.tampada == true) {
			System.out.println("ERRO! N�o posso rabiscar");
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
