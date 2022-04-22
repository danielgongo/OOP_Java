package Ex_02;

public class testeConta {

	public static void main(String[] args) {
		
		ContaCorrente c1 = new ContaCorrente();
		
		c1.numero = "777";
		c1.agencia = "123L";
		c1.especial = true;
		c1.limiteEspecial = 500;
		c1.valorEspecialUsado = 0;
		c1.saldo = -10;
		
		
		boolean saqueEfetuado = c1.realizarSaque(10);
		
		if (saqueEfetuado) {
			System.out.println("Saque efetuado com sucesso. ");
			c1.consultarSaldo();
		}else {
			System.out.println("Saldo insuficiente para realizar saque.");
		}
		
		saqueEfetuado = c1.realizarSaque(500);
		System.out.println("Tentativa de saque de 500");
		if (saqueEfetuado) {
			System.out.println("Saque efetuado com sucesso");
			c1.consultarSaldo();
		}else {
			System.out.println("Saldo insuficiente para realizar saque.");
		}
		
		System.out.println("Depósito de 500 reais");
		c1.depositar(500);
		c1.consultarSaldo();
		
		if (c1.verificarUsoChequeEspecial()) {
			System.out.println("Está usando cheque especial");
		}else {
			System.out.println("Não está usando cheque especial. ");
		}
		
		c1.realizarSaque(600);
		c1.consultarSaldo();
		if (c1.verificarUsoChequeEspecial()) {
			System.out.println("Está usando cheque especial");
		}else {
			System.out.println("Não está usando cheque especial");
		}
		
	}
}
