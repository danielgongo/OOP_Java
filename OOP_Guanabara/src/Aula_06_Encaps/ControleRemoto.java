package Aula_06_Encaps;

public class ControleRemoto implements Controlador {
	//ATRIBUTOS
	private int volume;
	private boolean ligado;
	private boolean tocando;
	
	//MÉTODOS ESPECIAIS
	public ControleRemoto() { //Construtor
		this.volume = 50;
		this.ligado = false;
		this.tocando = false;
	}
	
	private int getVolume() {//NUNCA SE ESQUEÇA QUE O GET TEM QUE COLOCAR O TIPO DE VARIÁVEL E NO SET NÃO!!!!!
		
		return  this.volume;
	}
	private void setVolume (int volume) {
		this.volume = volume;
	}
	
	private boolean getLigado() {
		return this.ligado;
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
	
	
	//MÉTODOS ABASTRATOS
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
		if (this.getLigado()) {
			System.out.println("-------ABRIR MENU-------");
			System.out.println("Está ligado? " + this.getLigado());
			System.out.println("Está tocando? " + this.getTocando());
			System.out.print("Volume: " + this.getVolume());
			for (int i = 0; i < this.getVolume(); i+= 10) {
				System.out.print("|");
			}
			
			
		}else  {
			System.out.println("Você sabe que tem que ligar a TV para abrir o menu, não é??");
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
			System.out.println("Impossível aumentar volume");
		}
	}

	@Override
	public void menosVoluma() {
		if (this.getLigado()) {
			this.setVolume(getVolume() - 5);
		}else {
			System.out.println("Impossível diminuir volume");
		}
	}

	@Override
	public void ligarMudo() {
		if (this.getLigado() && this.getVolume() > 0){
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
		if (this.getLigado() && !(getTocando())) {
			this.setTocando(true);
		}else {
			System.out.println("Não consegui reproduzir!");
		}
	}

	@Override
	public void pause() {
		if (this.getLigado() && getTocando()) {
			this.setTocando(false);
		}else {
			System.out.println("Não consegui pausar");
		}
		
	}
	
	//Métodos abstratos - De onde são as informações das capsulas
	
}
