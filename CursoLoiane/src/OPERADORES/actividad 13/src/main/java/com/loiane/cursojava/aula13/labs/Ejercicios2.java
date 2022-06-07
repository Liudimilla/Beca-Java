package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Ejercicios2 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int idade = scan.nextInt();
        String sexo = scan.next();
        String cidade = scan.next();
        System.out.println("A idade informada foi: "+idade);
        System.out.println("O Sexo informada foi: "+sexo);
        System.out.println("A cidade informada foi: "+cidade);
    }

}
