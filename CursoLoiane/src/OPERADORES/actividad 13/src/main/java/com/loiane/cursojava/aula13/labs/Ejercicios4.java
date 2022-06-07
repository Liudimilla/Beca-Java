package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;
/* Exercicio Convertor
Questao 13.4;Faça um programa que converta metros para centimetros.
 */
public class Ejercicios4 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        System.out.println("Digite o kilometro");
        float kilometro = x.nextFloat();
        System.out.println("Digite o metro");
        double metro = x.nextInt();


        double conv = kilometro * 1000;
        double conv1 = metro * 100;


        System.out.println("O valor em metro:" + conv);
        System.out.println("O valor em centimento:" + conv1);

        //OPÇAO 2 || System.out.println("metro + m é igual a" + cm "Cm");
    }
}


