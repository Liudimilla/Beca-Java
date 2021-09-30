package br.com.alura.Collections;

import java.util.HashSet;
import java.util.Set;

public class TestaAlunos {

    public static void main(String[] args) {

        Set<String> alunos = new HashSet<>();
        alunos.add("Rodrigo Turini");
        alunos.add("Alberto Souza");
        alunos.add("Nico Steppat");
        alunos.add("Sergio Lopes");
        alunos.add("Renan Saggio");
        alunos.add("Mauricio Aniche");
        
        for (String aluno : alunos) {// imprimir o nome dos alunos, fora os repetidos.
            System.out.println(aluno);
        }
        boolean liudimillaEstaMatriculado = alunos.contains("Liudimilla");
        System.out.println(" Statu do Aluno: "+liudimillaEstaMatriculado);
        
        boolean rodrigoEstaMatriculado = alunos.contains("Rodrigo Turini");
        System.out.println(" Statu do Aluno: "+ rodrigoEstaMatriculado);
        
        System.out.println(alunos);

    }
}