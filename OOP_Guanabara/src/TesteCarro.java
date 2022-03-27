
public class TesteCarro {

	public static void main(String[] args) {
		
		Carro van = new Carro();
		
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPassageiros = 10;
		van.capCombustivel = 100;
		van.conCombustivel = 0.20;
		
		System.out.println(van.marca);
		System.out.print(van.modelo);
		System.out.println("\n\n");
		
		Carro fusca = new Carro();
		
		fusca.marca = "Volkswagem";
		fusca.modelo = "Fusca";
		fusca.numPassageiros = 4;
		fusca.capCombustivel = 30;
		fusca.conCombustivel = 0.15;
		
		System.out.println(fusca.marca);
		System.out.print(fusca.modelo);
		
	}

}
