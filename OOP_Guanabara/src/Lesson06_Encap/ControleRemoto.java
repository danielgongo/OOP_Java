package Lesson06_Encap;

public class ControleRemoto implements Controlador {//implements traz a interface para o objeto

	//atributos
	private int volume;
	private boolean ligado;
	private boolean tocando;
	
	//M�todos especiais
	public ControleRemoto() {
		this.volume = 50;
		this.ligado = false;
		this.tocando = false;
	}

	private int getVolume() {
		return volume;
	}

	private void setVolume(int volume) {
		this.volume = volume;
	}

	private boolean getLigado() {
		return ligado;
	}

	private void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	private boolean getTocando() {
		return tocando;
	}

	private void setTocando(boolean tocando) {
		this.tocando = tocando;
	}
	
	//M�todos abstratos (Do encapsulamento)

	@Override
	public void ligar() {
		this.setLigado(true);
	}

	@Override
	public void desligar() {
		this.setLigado(false);
	}

	@Override
	public void abrirMenu() {
		if (this.getTocando()) {
			System.out.println("-----MENU-----");
			System.out.println("Est� ligado? " + this.getLigado());
			System.out.println("Est� tocando? " + this.getTocando());
			System.out.print("Volume: " + this.getVolume());
			for (int i=0; i<=this.getVolume() - 1; i+=10) {
				System.out.print("|");
			}
		}else {
			System.out.println("Tu sabe que s� d� pra abrir o menu com a TV ligada, n�?");
		}
		
		System.out.println();
	}
	

	@Override
	public void fecharMenu() {
		System.out.println("Fechando menu...");
	}

	@Override
	public void maisVolume() {
		if (this.getLigado()) {
			this.setVolume(this.getVolume() + 5);
		}else {
			System.out.println("Imposs�vel aumentar volume.");
		}
	}

	@Override
	public void menosVolume() {
		if (this.getLigado()) {
			this.setVolume(this.getVolume() - 5);
		}else {
			System.out.println("Imposs�vel diminuir volume");
		}
	}

	@Override
	public void ligarMudo() {
		if(this.getLigado() && this.getVolume() > 0) {
			this.setVolume(0);
		}
	}

	@Override
	public void desligarMudo() {
		if (this.getLigado() && this.getVolume() == 0) {
			this.setVolume(50);
		}
	}

	@Override
	public void play() {
		if(this.getLigado() && (!this.getTocando())) {
			this.setTocando(true);
		}
	}

	@Override
	public void pause() {
		if(this.getLigado() && (this.getTocando())) {
			this.setTocando(false);
		}
	}
	
	
	
	
	
	
	
	
	
}
