package Vetores;

import java.util.Arrays;

public class PreencherVetor {
	public static void main(String[] args) {
		int num[] = new int [20];
		Arrays.fill(num, 8);   //Preenchendo o vetor
		for (int valor: num) {
			System.out.println(valor+ " ");
		}
		
	}
}
