package Vetores;

import java.util.Arrays;

public class BuscaVetores {
	
		public static void main(String[] args) {
		int vet [] = {3,7,6,7,1,2,7};
		for(int v:vet) {
	    	System.out.print(v + " ");
		}
		System.out.println(" ");
		int p = Arrays.binarySearch(vet, 1); // para buscar a posiçao do vetor
	 
		System.out.print("Encontrei o valor na posiçao "+ p );
	     }
	}
	


