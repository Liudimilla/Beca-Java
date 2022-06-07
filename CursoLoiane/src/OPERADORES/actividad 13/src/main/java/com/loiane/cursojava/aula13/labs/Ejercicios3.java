package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Ejercicios3 {
    //Questao 13.3; Faça um programa que peça as 4 notas bimestrais e mostre a media.

        public static void main(String[] args) {
            Scanner x = new Scanner(System.in);

            System.out.println("Digite a frequencia");
            float frequencia = x.nextFloat();

            System.out.println("Digite sua primenira nota");
            double av1 = x.nextDouble();

            System.out.println("Digite sua segunda nota");
            double av2 = x.nextDouble();

            System.out.println("Digite sua terceira nota");
            double av3 = x.nextDouble();

            System.out.println("Digite sua quarta nota");
            double av4 = x.nextDouble();

            double media;
            int nota;
            String situacao;
            media = (av1 + av2 + av3 + av4) / 4;
            frequencia = frequencia * 100;

            if (media >= 7) {
                System.out.println("Aluno aprovado!");
                System.out.printf("Frequencia: %.0f%%\n",frequencia,"%");
            }
            else if(media < 7) {
                System.out.println("Aluno reprovado!");
                System.out.printf("Frequencia: %.0f%%\n",frequencia,"%");
            }
            System.out.println("Sua nota final e: " +media);

        }

    }


