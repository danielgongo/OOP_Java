package lesson07_Rela_classes;

import java.util.Random;

public class Luta implements InterLutador { //Aula 8 - Agregação entre Objetos 
	//Atributos
	
	private Lutador desafiado; //Na agregação, estou colocando a classe que foi feita anteriormente
	private Lutador desafiante;
	private int rounds;
	private boolean aprovada;
	
	//Métodos
	
	public void marcarLuta(Lutador l1, Lutador l2) {
		if (l1.getCategoria().equals(l2.getCategoria()) && (l1 != l2)) {
			this.aprovada = true;
			this.desafiado = l1;
			this.desafiante = l2;
		}else {
			this.aprovada = false;
			this.desafiado = null;
			this.desafiante = null;
		}
	}
	
	public void lutar() {
		
		if (this.aprovada) {
			System.out.println("### DESAFIADO ###");
			this.desafiado.apresentar();
			System.out.println("### DESAFIANTE ###");
			this.desafiante.apresentar();
			
			Random aleatorio = new Random();
			int vencedor = aleatorio.nextInt(3);
			
			System.out.println("++++ RESULTADO DA LUTA ++++");
			switch(vencedor) {
				
				case 0: //empate
					System.out.println("EMPATE");
					this.desafiado.empatarLuta();
					this.desafiante.empatarLuta();
					break;
				case 1: //Vitória l1 - desafiado
					System.out.println("Venceu " + this.desafiado.getNome());
					this.desafiado.ganharLuta();
					this.desafiante.perderLuta();
					break;
				case 2: //Vitória l2 - desafiante
					System.out.println("Venceu " + this.desafiante.getNome());
					this.desafiante.ganharLuta();
					this.desafiado.perderLuta();
					break;
			}
			System.out.println("=======================================");
			
		}else {
			System.out.println("A luta não pode acontecer.");
		}
		
		
	}

	public Lutador getDesafiado() {
		return desafiado;
	}

	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}

	public Lutador getDesafiante() {
		return desafiante;
	}

	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}

	public int getRounds() {
		return rounds;
	}

	public void setRounds(int rounds) {
		this.rounds = rounds;
	}

	public boolean isAprovada() {
		return aprovada;
	}

	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}

	@Override
	public void apresentar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void status() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ganharLuta() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void perderLuta() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void empatarLuta() {
		// TODO Auto-generated method stub
		
	}
	
	//Métodos especiais
	
	

}
