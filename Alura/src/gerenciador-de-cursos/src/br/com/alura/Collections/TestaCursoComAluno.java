package br.com.alura.Collections;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

public class TestaCursoComAluno {

    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Dominando as coleções do Java",
                "Paulo Silveira");

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 24));

        Aluno a1 = new Aluno("Rodrigo Turini", 34672);
        Aluno a2 = new Aluno("Guilherme Silveira", 5617);
        Aluno a3 = new Aluno("Mauricio Aniche", 17645);
        
        Aluno turini = new Aluno("Rodrigo Turini", 34672);
        System.out.println("E esse Turini, está matriculado?");
        System.out.println(javaColecoes.estaMatriculado(turini));
        
        Aluno aluno = new Aluno("Douglas Quintanilha", 11824763);
        Aluno alunoQueVeioDoFormulario = new Aluno("Douglas Quintanilha", 11824763);

        System.out.println("O aluno e igual ao aluno que veio do formulario?");
        System.out.println(aluno == alunoQueVeioDoFormulario);
        
        Aluno a5 = new Aluno("Guilherme Silveira", 5617);
        Aluno a4 = new Aluno("Paulo Silveira", 5617);

        javaColecoes.matricula(a2);
        javaColecoes.matricula(a4);

        System.out.println("Quem é o aluno com matricula 5617?");
        //Aluno aluno = javaColecoes.buscaMatriculado(5617);
        System.out.println("Aluno: " + aluno);
        
        Set<Aluno> alunos = javaColecoes.getAlunos(); // Todos alunos matriculados.
      Iterator<Aluno> iterador = alunos.iterator();
  
      while (iterador.hasNext()) {
          System.out.println(iterador.next());
      }
      
//        Curso c1 = new Curso("Ciencias da Computaçao");
//        Curso c2 = new Curso("Engenharia da Computaçao");
//        Curso c3 = new Curso("Analise de Sistema");
        
//        javaColecoes.matricula(c1);
//        javaColecoes.matricula(c2);
//        javaColecoes.matricula(c3);
        
        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);
        
        System.out.println("Todos os alunos matriculados: ");
        javaColecoes.getAlunos().forEach(a -> {
            System.out.println(a);
        });
        
        //Set<Aluno> alunos = javaColecoes.getAlunos();
        //Set<Aluno> alunosSincronizados = Collections.synchronizedSet(alunos);
        System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");     
        System.out.println("O aluno " + a1.getNome() + " está matriculado?");
        System.out.println(javaColecoes.estaMatriculado(a1));
        System.out.println("\n O a1 é equals ao Turini?");
        System.out.println(a1.equals(turini));
        System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");  
        System.out.println("Quem é o aluno com matricula 5617?");
        
    }
    
    
}
