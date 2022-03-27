package Aula_03;

public class Caneta {

	
	public String modelo; //public, qualquer um pode mexer
	public String cor;
	private double ponta; //privado s� se o respons�vel permitir
	protected int carga;
	private boolean tampada; //protected ele ainda vai falar
	
	public void status() {
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Uma caneta " + this.cor); //this � auto refer�ncia
		System.out.println("Ponta: " + this.ponta);
		System.out.println("Carga: " + this.carga);
		System.out.println("Est� tampada? " + this.tampada);
	}
	
	public void rabiscar() { //M�TODO � A��O DA CLASSE!
		if (this.tampada == true) {
			System.out.println("ERRO! N�o posso rabiscar");
		}else {
			System.out.println("Posso rabiscar");
		}
	}
	
	public void tampar() {
		this.tampada = true;
	}
	
	public void destampar() {
		this.tampada = false; 
	}
	
		
}
