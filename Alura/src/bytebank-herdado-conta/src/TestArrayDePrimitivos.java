package br.com.bytebank.banco.test;

public class TestArrayDePrimitivos {
	public static void main(String[] args) {
        int[] idades = new int[5];
        
//        idades[0] = 29;
//        idades[1] = 39;
//        idades[2] = 49;
//        idades[3] = 59;
//        idades[4] = 69;
        
//        System.out.println(idade4);
//        System.out.println(idades.length); //5º Imprima o tamanho do array, acessando o seu atributo length:

      //  inicializar o array dentro de um laço

    for(int i = 0; i < idades.length; i++) {
        idades[i] = i * i;
    }
    for(int i = 0; i < idades.length; i++) {
        idades[i] = i * i;
    }
}
}

