package Lesson06_Encap;

public interface Controlador { //TUDO DENTRO DA INTERFACE S�O M�TODOS E N�O ATRIBUTOS

	//Nem sempre � void. Quando quer retornar infos, coloca-se outra coisa
	public abstract void ligar();
	public abstract void desligar();
	public abstract void abrirMenu();
	public abstract void fecharMenu();
	public abstract void maisVolume();
	public abstract void menosVolume();
	public abstract void ligarMudo();
	public abstract void desligarMudo();
	public abstract void play();
	public abstract void pause();
}
