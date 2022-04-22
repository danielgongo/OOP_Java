package Ex_02;

public class ContaCorrente {
	
	String numero;
	String agencia;
	boolean especial;
	double limiteEspecial;
	double valorEspecialUsado;
	double saldo;
	double limite;
	
	
	boolean realizarSaque (double quantiaSacar) {
		
		//Se tem saldo na conta
		if (saldo >= quantiaSacar) {
			saldo -= quantiaSacar;
			return true;
		}else {//não tem saldo na conta
			if (especial) {
				//Verificar se o limite especial tem saldo
				limite = limiteEspecial + saldo;
				if (limite >= quantiaSacar) {
					saldo -= quantiaSacar;
					return true;
				}else {
					return false;
				}
			}else {
				return false;// não é especial e não tem saldo suficiente
			}
		}
	}
	
	void depositar(double valorDepositado) {
		saldo += valorDepositado;
	}
	
	void consultarSaldo () {
		System.out.println("Saldo atual R$ " + saldo);
	}
	
	boolean verificarUsoChequeEspecial () {
		return saldo < 0;
	}
	
}

