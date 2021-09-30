package br.com.alura.Collections;

import java.util.HashSet;
import java.util.Set;

public class ImprimindoAlunosSemAcentos {
	public static void main(String[] args) {

        Set<String> alunos = new HashSet<>();
        alunos.add("Paulo");
        alunos.add("Alberto");
        alunos.add("Pedro");    
        alunos.add("Nico");
        alunos.add("Pedro");
        
        for (String aluno : alunos) {
			System.out.println("Nossos alunos: "+alunos);
			
			boolean adicionou = alunos.add("Pedro");
			System.out.println("Pedro foi adicionado ao Set? " + adicionou);
			
			 //System.out.println(alunos.size());
		}

}
}
