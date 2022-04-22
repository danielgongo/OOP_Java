package Lesson05;

public class ContaBancaria1 {

	public int numConta;
	protected String tipo;
	private String dono;
	private double saldo;
	private boolean status;
	
	public void estadoAtual() {
		System.out.println("----------------------------------");
		System.out.println("Conta: " + this.getNumConta());
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Dono: " + this.getDono());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Status: " + this.getStatus());
		
	}
	
	public void abrirConta(String t) {
		
		this.setTipo(t);
		this.setStatus(true);
		
		if(t.equals("CC")) {
			setSaldo(50);
		}else if(t.equals("CP")) {
			setSaldo(150);
		}
		
		System.out.println("Conta aberta com sucesso");
		
	}
	
	public void fecharConta() {
		if(this.getSaldo() > 0) {
			System.out.println("Conta ainda com fundos");
		}else if(this.getSaldo() < 0){
			System.out.println("Conta em débito!");
		}else {
			this.setStatus(false);
			System.out.println("Conta encerrada");
		}
		
	}
	
	public void depositar (double deposit) {
		if (this.getStatus()) {
			this.setSaldo(this.getSaldo() + deposit);
			System.out.println("Depósito realizado com sucesso");
		}else {
			System.out.println("Conta fechada. Não tem como depositar");
		}
		
	}
	
	public void sacar(double s) {
		if ((this.getStatus()) && (saldo >= s)) {
			this.setSaldo(this.getSaldo() - s);
			System.out.println("Saque realizado na conta de " + this.getDono());
		}else {
			System.out.println("Saldo insuficiente");
		}
		
	
	}
	
	public void pagarMensal() {
		double m = 0;
		if (tipo.equals("CC")) {
			m = 12;
		}else if (tipo.equals("CC")) {
			m = 20;
		}
		if(status = true) {
			if(saldo > m) {
				setSaldo(getSaldo() - m);
				System.out.println("Mensalidade paga por " + this.getDono());
					
			}else {
				System.out.println("Saldo insuficiente");
			}
		
			}
		}
	
	public ContaBancaria1() {
		this.setSaldo(0);
		this.setStatus(false);
	}
	
	public void setNumConta (int c) {
		this.numConta = c;
	}
	
	public int getNumConta () {
		return this.numConta;
	}
	
	public void setTipo(String tp) {
		this.tipo = tp;
	}
	
	public String getTipo () {
		
		return tipo;
	}
	
	public void setDono (String d) {
		this.dono = d;
	}
	
	public String getDono() {
		
		return this.dono;
	}
	
	public void setSaldo(double s) {
		this.saldo = s;
	}
	
	public double getSaldo() {
		
		return this.saldo;
	}
	
	public void setStatus (boolean st) {
		this.status = st;
	}
	
	public boolean getStatus() {
		
		return this.status;
	}
}
