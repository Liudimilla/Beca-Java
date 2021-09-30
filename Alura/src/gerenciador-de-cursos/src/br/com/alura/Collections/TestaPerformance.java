package br.com.alura.Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestaPerformance {
	public static void main(String[] args) {

       // Collection<Integer> numeros = new ArrayList<Integer>();// Tempo de resposta gasto: 1199
		Collection<Integer> numeros = new HashSet<>(); // Tempo de resposta gasto: 29
        long inicio = System.currentTimeMillis();//cronometrar o tempo gasto com a adição e pesquisa dos elementos:

        for (int i = 1; i <= 50000; i++) {
            numeros.add(i);
        }

        for (Integer numero : numeros) {
            numeros.contains(numero);
        }

        long fim = System.currentTimeMillis();

        long tempoDeExecucao = fim - inicio;

        System.out.println("Tempo gasto: " + tempoDeExecucao);

	}
}
