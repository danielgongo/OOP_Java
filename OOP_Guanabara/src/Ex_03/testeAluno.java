	
package Ex_03;

import java.util.*;


public class testeAluno {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);

		Aluno a1 = new Aluno();
		
		
		
		//Informa��es od aluno
		System.out.println("Nome do aluno: ");
		a1.nome = scan.next();
		
		System.out.println("Matricula: ");
		a1.matricula = scan.nextInt();
		
		System.out.println("Curso que est� matriculado: ");
		a1.cursoMatriculado = scan.next();
		
		
		
		//Escolhendo s� uma mat�ria, a disciplina 1 para fazer o exerc�ocio
		a1.disciplina1();
		System.out.println("Notas de " + a1.disciplina1());
		System.out.println("Digite a primeira nota do aluno: ");
		a1.nota1 = scan.nextDouble();
		
		a1.disciplina1();
		System.out.println("Digite a segunda nota: ");
		a1.nota2 = scan.nextDouble();
		
		a1.disciplina1();
		System.out.println("Digite a terceira nota: ");
		a1.nota3 = scan.nextDouble();
		
		
		
		//Processamento das notas
		double derradeira = a1.notaFinal(0);
		derradeira = (a1.nota1 + a1.nota2 + a1.nota3) / 3;
		
		
		//Output do resultado
		a1.aprovado(true);
		if (derradeira >= 7) {
			
			a1.aprovado(true);
			System.out.println("Parab�ns, voc� foi aprovado! Nota =  " + derradeira);
		}else {
			System.out.println("Voc� foi reprovado. Nota =  " + derradeira);
		}
		
		
		
		

	}

}
