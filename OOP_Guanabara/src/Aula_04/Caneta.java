package Aula_04;


public class Caneta {

	private String modelo;
	private double ponta;
	private boolean tampada;
	private String cor;
	
	
public Caneta(String m, double p, String c) {
	this.modelo = m;
	this.ponta = p;
	this.cor = c;
	}


public String getModelo() {
	return modelo;
}


public void setModelo(String modelo) {
	this.modelo = modelo;
}


public double getPonta() {
	return ponta;
}


public void setPonta(double ponta) {
	this.ponta = ponta;
}


public String getCor() {
	return cor;
}


public void setCor(String cor) {
	this.cor = cor;
}

	
}
