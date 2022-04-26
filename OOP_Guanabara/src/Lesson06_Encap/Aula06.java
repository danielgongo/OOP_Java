package Lesson06_Encap;

public class Aula06 {//ENCAPSULAMENTO

	public static void main(String[] args) {
		//No encapsulamento, aqui só poderá ser usado os mnétodos da interface!!!
		ControleRemoto c = new ControleRemoto();
		
		c.ligar();    
		c.maisVolume();
		c.play();
		c.abrirMenu();
		//c.fecharMenu();
	}

}
