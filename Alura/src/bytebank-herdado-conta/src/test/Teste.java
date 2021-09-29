package br.com.bytebank.banco.test;

public class Teste {

        //Array []
        public static void main(String[] args) {

            int[]idades = new int[5]; //inicializa o array com os valores padroes

//            idades[0] = 29;
//            idades[1] = 39;
//            idades[2] = 49;
//            idades[3] = 59;
//            idades[4] = 69;
            
//            int idade4 = idades[4];
//            
//           System.out.println(idade4); // acessar o valor da posiçao 4.
//           System.out.println(idades.length); //para saber qtas posiçoes.

            // Em um laço.
            for(int i = 0; i < idades.length; i++) {
                idades[i] = i * i;
            }

            for(int i = 0; i < idades.length; i++) {
                System.out.println(idades[i]);
            }

        }
}