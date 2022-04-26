package lesson07_Rela_classes;

public class Lutador implements InterLutador {

	//Atributos
	private String nome;
	private String nacionalidade;
	private int idade;
	private double altura, peso;
	private String categoria;
	private int vitorias, derrotas, empates;
	
	//Métodos do encapsulamento
	@Override
	public void apresentar() {
		System.out.println("---------------------------------------------------------");
		System.out.println("CHEGOU A HORA!! Aprensentamos o lutador: " + this.getNome());
		System.out.println("Diretamente de: " + this.getNacionalidade());
		System.out.println("Com " + this.getIdade() + " anos");
		System.out.println(this.getAltura() + " m de altura");
		System.out.println("E pesando "+this.getPeso() + " kg");
		System.out.println(this.getVitorias() + " vitórias");
		System.out.println(this.getDerrotas()+" derrotas e ");
		System.out.println(this.getEmpates() + " empates");
		
		System.out.println("\n");
	}
	@Override
	public void status() {
		System.out.println(this.getNome());
		System.out.println(this.getCategoria());
		System.out.println(this.getPeso() + " kg");
		System.out.println("Vitórias: " + this.getVitorias());
		System.out.println("Derrotas: " + this.getDerrotas());
		System.out.println("Empates: " + this.getEmpates());
	}
	@Override
	public void ganharLuta() {
		this.setVitorias(this.getVitorias() + 1);
	}
	@Override
	public void perderLuta() {
		this.setDerrotas(this.getDerrotas() + 1);
	}
	@Override
	public void empatarLuta() {
		this.setEmpates(this.getEmpates() + 1);
	}
	
	public Lutador(String no, String na, int id, double al, double pe, int vi, int de, int em) {
	
		this.nome = no;
		this.nacionalidade = na;
		this.idade = id;
		this.altura = al;
		this.setPeso(pe);
		this.vitorias = vi;
		this.derrotas = de;
		this.empates = em;
	}
	
	//Métodos especiais
	public String getNome() {
		return nome;
	}
	public void setNome(String no) {
		this.nome = no;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double pe) {
		this.peso = pe;
		this.setCategoria();
	}
	public String getCategoria() {
		return categoria;
	}
	private void setCategoria() {
		if(peso<52.2) {
			this.categoria = "Inválido";
		}else if (peso<=70.3) {
			this.categoria = "Leve";
		}else if (peso<=83.9) {
			this.categoria = "Médio";
			
		}else if (peso<=120.2) {
			this.categoria = "Pesado";
		}else {
			this.categoria = "inválido";
		}
		
		
	}
	public int getVitorias() {
		return vitorias;
	}
	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}
	public int getDerrotas() {
		return derrotas;
	}
	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}
	public int getEmpates() {
		return empates;
	}
	public void setEmpates(int empates) {
		this.empates = empates;
	}
	
	
	
	
}
