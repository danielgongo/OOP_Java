package Aula_05b;

public class ContaBancaria {

	//Atributos
	public int numConta;
	protected String tipo;
	private String dono;
	private double saldo;
	private boolean status;
	public int mensal = 0;
	
	//Métodos personalizados
	
	public void estadoAtual() {
		System.out.println("____________________________\n");
		System.out.println("Conta: " + this.getNumConta());
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Dono da conta é o(a) " + this.getDono());
		System.out.println("Saldo atual R$: " + this.getSaldo());
		
	}
	
	public void abrirConta(String t) {
		this.setTipo(t);
		this.setStatus(true);
		if (t.equals("CC")) {
			this.setSaldo(50);
		} else if (t.equals("CP")) {
			this.setSaldo(150);
		}
		
		System.out.println("Conta aberta com sucesso!");
	}
	public void fecharConta() {
		if (this.getSaldo() > 0) {
			System.out.println("Ainda há valores para retirar");
		}else if (this.getSaldo() < 0) {
			System.out.println("Conta com saldo negativo");
		}else {
			this.setStatus(false);
			System.out.println("Conta fechada com sucesso");
		}
	}
	public void depositar(double deposit) {
		
		if (this.getStatus()) {
			this.setSaldo(this.getSaldo() + deposit);
			System.out.println("Deposito realizado na conta de " + this.getDono());
		}else {
			System.out.println("Impossível depositar");
		}
	}
	public void sacar(double saque) {
		if (this.getStatus()) {
			if (this.saldo > 0) {//17:10
				this.setSaldo(getSaldo() - saque);
				System.out.println("Saque realizado na conta de " + this.getDono());
			}else {
				System.out.println("Saldo insuficiente");
			}
		}else {
			System.out.println("Impossível sacar de uma conta fechada");
		}
	}
	public void pagarMensal() {
		
		if (this.getTipo() == "CC") {
			mensal = 12;
		}else if (this.getTipo() == "CP") {
			mensal = 20;
		}
		
		if (this.getStatus()) {
			this.setSaldo(getSaldo() - mensal);
			System.out.println("Mensalidade paga com sucesso"); //19:00
		}
		
		if (this.getSaldo() < mensal) {
			System.out.println("Saldo insuficiente para pagar taxa de manutenção");
		}
	}
	
	//Métodos especiais
	
	public ContaBancaria() {
		this.setSaldo(0);
		this.setStatus(true);
	}
	
	public void setNumConta(int c) {
		this.numConta = c;
	}
	public int getNumConta() {
		
		return  this.numConta;
	}
	
	public void setTipo(String t) {
		this.tipo = t;
	}
	public String getTipo() {
		
		return this.tipo;
	}
	
	public void setDono(String d) {
		this.dono = d;
	}
	public String getDono () {
		
		return this.dono;
	}
	
	public void setSaldo(double s) { //NO SET É VOID,NESSES CASOS
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
