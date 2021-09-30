package br.com.alura.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {

    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Dominando as colecoes do Java",
                "Paulo Silveira");

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com colecoes", 24));
        
        List<Aula> aulasImutaveis = javaColecoes.getAulas();
        System.out.println(aulasImutaveis);

        //List<Aula> aulas = new ArrayList<>(aulasImutaveis);
        
//        Collections.sort(aulas);
//        System.out.println(aulas);
//        Collections.reverse(aulas);//serve para inverter a ordem de uma lista
//        Collections.shuffle(aulas);//serve para embaralhar a ordem de uma lista.
        
   //     Collections.singletonList(aulas);
        
        List<Aula> aulas = new ArrayList<Aula>(Collections.nCopies(1000, (Aula)null));//retorna uma lista imutável com a quantidade escolhida de um determinado elemento.
        
        System.out.println(javaColecoes.getTempoTotal());// para somar o tempo total do curso

    }
}