
public class testeCaneta {

	public static void main(String[] args) {

		Caneta c1 = new Caneta(); //Isto aqui se chama instanciar!
		
		c1.cor = "Azul"; //Isto são os atribulos da classe
		c1.ponta = 0.5;
		c1.tampar();
		c1.rabiscar();
		c1.status();
		System.out.println("\n");
		
		Caneta c2 = new Caneta();
		System.out.println("Caneta 2 \n");
		c2.modelo = "Mont Blanc";
		c2.cor = "Preta";
		c2.destampar();
		c2.rabiscar();
		c2.status();
		
	}

}
