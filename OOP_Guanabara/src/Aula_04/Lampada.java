package Aula_04;

public class Lampada {

	public String marca;
	public String modelo;
	protected String tipo;
	int  watts;
	private double preco;
	public boolean ligada;
	


	public Lampada (String m, String mo, int w, double p) {
		
		this.marca = m;
		this.modelo = mo;
		this.watts = w;
		this.preco = p;
		
	}
	
	public void  setMarca (String m) { //o set não retorna, por isso o void 
		this.marca = m;
	}
	
	public String getMarca() { //Como o get retorna, colocar o tipo de variável
		
		return this.marca;
	}
	
	public void setModelo (String mo) {
		this.modelo = mo;
	}
	
	public String getModelo() {
		
		return this.modelo;
	}
	
	public void setPreco (double p) {
		this.preco = p;
	}
	
	public double getPreco () {
		
		return this.preco;
	}
	
	public void ligar() {
		ligada = true;
	}
	
	public void desligar () {
		ligada = false;
	}
	
	public void status () {
		System.out.println("Marca: " + this.getMarca());
		System.out.println("Modelo: " + this.getModelo());
		System.out.println("Preço R$: " + this.getPreco());
		System.out.println("Ligada? " + this.ligada);
	}
	
	
	

	
	
}
