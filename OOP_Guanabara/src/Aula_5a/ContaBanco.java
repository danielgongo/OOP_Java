package Aula_5a;

public class ContaBanco {

	//atributos
	public int numConta;
	protected String tipo;//se é corrente ou poupança
	private String dono;
	private double saldo;
	private boolean status; //se a conta está ativa ou encerrada
	
	//Métodos
	
	public ContaBanco() {//Método constructor
		saldo = 0;
		status = false;
		tipo = "";
		
	}
	
	
	
	public int getNumConta() {
		return numConta;
	}



	public void setNumConta(int n) {
		this.numConta = n;
	}



	public String getTipo() {
		return tipo;
	}



	public void setTipo(String t) {
		this.tipo = t;
	}



	public String getDono() {
		return dono;
	}



	public void setDono(String d) {
		this.dono = d;
	}



	public double getSaldo() {
		return saldo;
	}



	public void setSaldo(double s) {
		this.saldo = s;
	}



	public boolean getStatus() {
		return status;
	}



	public void setStatus(boolean st) {
		this.status = st;
	}



	public void abrirConta(String t) {
		this.setTipo(t);
		this.setStatus(true);
		if (t.equals("CC")) {
			this.setSaldo(50);
		}else if (t.equals("CP")) {
			this.setSaldo(150);
		}
		
	}
	
	public void fecharConta() {
		if (saldo > 0) {
			System.out.println("Conta ainda com saldo");
		}else if (saldo < 0) {
			System.out.println("Conta com saldo negativo");
		}else {
			setStatus(false);
		}
		
	}
	public void depositar(double v) {
		if (status = true) {
			setSaldo(getSaldo() + v);
		}else {
			System.out.println("Não pode ser depositada");
		}
	}
	public void sacar(double sa) {
		if ((saldo > sa) && (status == true)) {
			setSaldo(getSaldo() - sa);
		}else {
			System.out.println("Não há dinheiro para sacar");
		}
		
	}
	public void pagarMensal() {
		double taxa = 0;
		if (tipo == "CC") {
			taxa = 12;
		}else {
			taxa = 20;
		}
		if ((status = true) && saldo > taxa) {
			saldo -= taxa;
		}else {
			System.out.println("Conta sem saldo para pagar taxa de menutenção");
		}

		}
	}

