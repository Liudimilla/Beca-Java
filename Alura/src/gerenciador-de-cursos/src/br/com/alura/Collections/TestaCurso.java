package br.com.alura.Collections;

import java.util.List;

public class TestaCurso {

    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Dominando as coleções do Java",
                "Paulo Silveira");

        List<Aula> aulas = javaColecoes.getAulas();        
        System.out.println(aulas);

        javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList", 21));
        System.out.println(aulas);        
         

//       javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
//        javaColecoes.adiciona(new Aula("Modelando com coleções", 24));

          javaColecoes.getAulas().add(new Aula("Trabalhando com Collections", 23));
          javaColecoes.getAulas().add(new Aula("Trabalhando com Util", 21));
      
      System.out.println(javaColecoes.getAulas());
    }   
}