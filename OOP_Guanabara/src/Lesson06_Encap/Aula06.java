package Lesson06_Encap;

public class Aula06 {//ENCAPSULAMENTO

	public static void main(String[] args) {
		//No encapsulamento, aqui s� poder� ser usado os mn�todos da interface!!!
		ControleRemoto c = new ControleRemoto();
		
		c.ligar();    
		c.maisVolume();
		c.play();
		c.abrirMenu();
		//c.fecharMenu();
	}

}
