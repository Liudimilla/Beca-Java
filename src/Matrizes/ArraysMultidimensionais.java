// Faça um programa que leia a nota de 5 alunos.
package Matrizes;

public class ArraysMultidimensionais {
	
	public static void main(String[] args) {
		 double[][]notasAlunos = new double[5][4];
		 
		 notasAlunos[0][0] = 10;
		 notasAlunos[0][1] = 7;
		 notasAlunos[0][2] = 9;
		 notasAlunos[0][3] = 9.5;
	
		 notasAlunos[1][0] = 9;
		 notasAlunos[1][1] = 7;
		 notasAlunos[1][2] = 10;
		 notasAlunos[1][3] = 8.5;
		 
		 notasAlunos[2][0] = 10;
		 notasAlunos[2][1] = 6;
		 notasAlunos[2][2] = 7;
		 notasAlunos[2][3] = 9;
		 
		 notasAlunos[3][0] = 7;
		 notasAlunos[3][1] = 8;
		 notasAlunos[3][2] = 6;
		 notasAlunos[3][3] = 6;
		 
		 notasAlunos[4][0] = 9;
		 notasAlunos[4][1] = 7;
		 notasAlunos[4][2] = 10;
		 notasAlunos[4][3] = 7;
		 
		 for (int i=0; i<notasAlunos.length; i++) {// { Faz interaçao do vetor que ler a nota de um determinado aluno>}
			 //System.out.print(notasAlunos[i]+" "); {{Para imprimir o endereço de memoria}}
			 for (int j=0; j<notasAlunos[i].length; j++){
				 System.out.print(notasAlunos[i][j] + " ");
		 }
		 System.out.println();
	}
// Fazer mudança do aluno.:
		 notasAlunos[1][3] = 0;
		 
		 System.out.println();
		 
		 for (int i=0; i<notasAlunos.length; i++) {
			 for (int j=0; j<notasAlunos[i].length; j++){
				 System.out.print(notasAlunos[i][j] + " - ");
}
			 System.out.println();
}
		 System.out.println("\n Caculando a Media");
		 
		 double soma;
		 for (int i=0; i<notasAlunos.length; i++) {
			 soma = 0;
		 
			 for (int j=0; j<notasAlunos[i].length; j++){
				 soma += notasAlunos[i][j];
			 }
			System.out.println("Media do aluno " + i + " é = " +(soma/4));
		 }
		 
		 double[] notasAlunos1 = {7, 8, 9, 10};
		 double[][] notasAlunos2 = {{7, 7, 9, 10}, {7, 8, 9, 10}};
		 
		 System.out.println("\n Output da matriz notasAlunos2 ");
		 
		 for (int i=0; i<notasAlunos.length; i++) {
			 for (int j=0; j<notasAlunos[i].length; j++){
		 System.out.print(notasAlunos[i][j]+ " - ");
	}
}
}
}