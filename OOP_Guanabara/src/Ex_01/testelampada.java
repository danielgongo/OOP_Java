package Ex_01;

public class testelampada {

	public static void main(String[] args) {

		Lampada l1 = new Lampada();
		
		l1.marca = "TASCHIBRA";
		l1.tipo = "Eletrônica";
		l1.watts = 15;
		l1.volts = 127;
		l1.valor = 10.89;
		
		l1.ligar();
		l1.mostrarEstado();
		l1.mudarEstado();
		
		
		
		
	}

}
