package Lesson05;

public class testeConta1 {

	public static void main(String[] args) {
		
		ContaBancaria1 c1 = new ContaBancaria1();
			
		c1.setDono("Jubileu");
		c1.abrirConta("CC");
		c1.setNumConta(77);
		c1.depositar(100);
		c1.sacar(150);
		
		c1.fecharConta();
		
		
		System.out.println("\n");
		
		ContaBancaria1 c2 = new ContaBancaria1();
		
		c2.setDono("Prisciele");
		c2.abrirConta("CP");
		c2.setNumConta(999);
		c2.depositar(500);
		c2.sacar(150);
		
		
		c1.estadoAtual();
		c2.estadoAtual();
		
				
		
}
	
}
