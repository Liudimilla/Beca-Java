package br.com.alura.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaDeAula {

    public static void main(String[] args) {

        Aula a1 = new Aula("Revistando as ArrayLists", 21);
        Aula a2 = new Aula("Listas de objetos", 20);
        Aula a3 = new Aula("Relacionamento de listas e objetos", 15);

        ArrayList<Aula> aulas = new ArrayList<>();
        aulas.add(a1);
        aulas.add(a2);
        aulas.add(a3);

        System.out.println(aulas);
        Collections.sort(aulas);
        
        Collections.sort(aulas, Comparator.comparing(Aula::getTempo)); //para organizar pelo tempo
        
        aulas.sort(Comparator.comparing(Aula::getTempo));//para organizar pelo tempo
        
//        String s1 = "Paulo";
//        String s2 = " Silveira";
//        s1 CompareTo(s2);
        
        		
        
        System.out.println(aulas);
    }
}
