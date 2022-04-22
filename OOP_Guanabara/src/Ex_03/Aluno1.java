package Ex_03;

public class Aluno1 {
	String nome;
	String matricula;
	String nomeCurso;
	String [] disciplinas = new String[3];
	double [][] notasDisciplinas = new double [3][4];
	
	
	void mostrarInfo () {
		System.out.println("Nome: " + nome);
		System.out.println("Matricula: " + matricula);
		System.out.println("Nome do curso: " + nomeCurso);
		
		for (int i=0; i<notasDisciplinas.length; i++) {
			System.out.println("Notas da disciplina " + disciplinas[i]);
			for (int j=0; j<notasDisciplinas[i].length; j++) {
				System.out.println(notasDisciplinas[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	boolean verificarAprovado(int indice) {
		
	
		if (obterMedia(indice) >=7) {
			return true;
		}
			return false;
		
	}
	
	double obterMedia(int indice) {
		
		double soma = 0;
		for (int i=0; i<notasDisciplinas[indice].length; i++) {
			soma += notasDisciplinas[indice][i];
		}
		double media = soma/4;
		
		return media;
	}
}
