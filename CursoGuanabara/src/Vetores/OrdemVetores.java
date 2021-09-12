package Vetores;

import java.util.Arrays;

public class OrdemVetores {
	public static void main(String[] args) {
	double v[] = {3.5, 2.75, 9, -4.5};
	Arrays.sort(v); // coloca o vetro em ordem
     for (double valor: v) { 
    	 System.out.print(valor + " ");
     }
}
}
