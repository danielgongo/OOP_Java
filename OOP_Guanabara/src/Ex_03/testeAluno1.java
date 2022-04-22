package Ex_03;

import java.util.Scanner;

public class testeAluno1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		Aluno1 a1 = new Aluno1();
		
		System.out.println("Nome do Aluno ");
		a1.nome = scan.nextLine();
		
		System.out.println("Nome do curso ");
		a1.nomeCurso = scan.nextLine();
		
		System.out.println("Entre com a matricula ");
		a1.matricula = scan.next();
		
		for (int i=0; i<a1.disciplinas.length; i++) {
			System.out.println("Entre com o nome da disciplina " + (i+1));
			a1.disciplinas[i] = scan.next();
		}
		
		for (int i=0; i<a1.notasDisciplinas.length; i++) {
			System.out.println("Obtendo notas da disciplina " + a1.disciplinas[i]);
			for (int j=0; j<a1.notasDisciplinas[i].length; j++) {
				System.out.println("Entre com a nota " + (j+1));
				a1.notasDisciplinas[i][j] = scan.nextDouble();
			}
		}
		
		
		
		a1.mostrarInfo();
		
		for (int i=0; i<a1.disciplinas.length; i++) {
			if (a1.verificarAprovado(i)) {
				System.out.println("Disciplina " + a1.disciplinas[i] + " - foi aprovado.");
			}else {
				System.out.println("Disciplina " + a1.disciplinas[i] + " - foi reprovado.");
			}
		}
		

		scan.close();
	}

}
