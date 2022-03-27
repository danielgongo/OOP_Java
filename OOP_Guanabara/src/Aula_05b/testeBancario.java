package Aula_05b;

public class testeBancario {

	public static void main(String[] args) {
		ContaBancaria c1 = new ContaBancaria ();
		
		c1.setDono("Jubileu"); //Aqui é o set e não o get
		c1.setNumConta(7777);
		c1.abrirConta("CC");
		
		ContaBancaria c2 = new ContaBancaria();
		
		c2.setDono("Creuza"); //Aqui é o set e não o get
		c2.setNumConta(6666);
		c2.abrirConta("CP");
		
		c1.depositar(100);
		c2.depositar(500);
		c2.sacar(100);
		c1.fecharConta();
		
		c1.estadoAtual();
		c2.estadoAtual();
		
		

	}

}
