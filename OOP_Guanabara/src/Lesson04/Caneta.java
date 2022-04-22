package Lesson04;

public class Caneta {
	
	public String modelo;
	private double ponta;
	private boolean tampada;
	private String cor;
	
	//M�TODO CONSTRUTOR
	public Caneta(String m, String c, double p) {//M�TODO CONSTRUTOR TEM O MESMO NOME DA CLASSE
		this.modelo = m;
		this.cor = c;
		this.ponta = p;
		this.destampar();
	}
	
	public String getModelo() {
		return this.modelo;
	}
	
	public void setModelo (String m) {
		this.modelo = m;
	}
	
	
	public double getPonta() {
		return this.ponta;
	}
	
	public void setPonta(double p) {
		this.ponta = p;
	}
	
	public void tampar() {
		this.tampada = true;
	}
	
	public void destampar() {
		this.tampada = false;
	}
	
	public void status() {
		System.out.println("Sobre a caneta: ");
		System.out.println("Modelo: " + this.getModelo());
		System.out.println("Ponta: " + this.getPonta());
		System.out.println("Cor: " + this.cor);
		System.out.println("Est� tampada? " + this.tampada);
	}
	
	
}
