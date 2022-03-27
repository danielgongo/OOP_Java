package Aula_03;

public class Caneta {

	
	public String modelo; //public, qualquer um pode mexer
	public String cor;
	private double ponta; //privado só se o responsável permitir
	protected int carga;
	private boolean tampada; //protected ele ainda vai falar
	
	public void status() {
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Uma caneta " + this.cor); //this é auto referência
		System.out.println("Ponta: " + this.ponta);
		System.out.println("Carga: " + this.carga);
		System.out.println("Está tampada? " + this.tampada);
	}
	
	public void rabiscar() { //MÉTODO É AÇÃO DA CLASSE!
		if (this.tampada == true) {
			System.out.println("ERRO! Não posso rabiscar");
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
