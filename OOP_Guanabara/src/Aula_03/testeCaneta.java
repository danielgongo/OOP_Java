package Aula_03;

public class testeCaneta {

	public static void main(String[] args) {

		Caneta c1 = new Caneta(); //Isto aqui se chama instanciar!
		
		c1.modelo = "Bic Cristal";
		c1.cor = "Blue";
		//c1.ponta = 2.0;
		c1.carga = 80; //Mesmo sendo protegida, aceitou porque c1, que chamou carga faz parte do main, que é o objeto carro
		//c1.tampada = false;
		c1.tampar();
		c1.status();
		c1.rabiscar();
	}

}
