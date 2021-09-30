package br.com.alura.Collections;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {
	
	public static void main(String[] args) {
		String aula1 = "Conhecendo mais de listas";
        String aula2 = "Modelando a classe Aula";
        String aula3 = "Trabalhando com Cursos e Sets";

        ArrayList<String> aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);        

        System.out.println(aulas);
        
        aulas.remove(0);
        System.out.println(aulas);
        
        for (String aula : aulas) {
        	System.out.println("Aula: "+aula);// para ordenar uma debaixo da outra.
        	
        	String primeiraAula = aulas.get(0);
        	System.out.println("A primeira aula é " + primeiraAula);// devolvera primeira aula.
        	
        	for(int i = 0; i < aulas.size(); i++) {
        		System.out.println("\n *Aulas :"+aulas.get(i));// devolvera a proximas aula
        	}
			System.out.println(aulas.size());//Qtos elementos tem em nossa lista.
			
//			aulas.forEach(aula -> {
//		    System.out.println("Percorrendo:");
//		    System.out.println("Aula " + aula);
//		});
			
			aulas.add("Aumentnado nosso conhecimento");
			System.out.println(aulas);
			Collections.sort(aulas);//ordenar
			System.out.println(aulas);
			
			
			
		}
	}

}
