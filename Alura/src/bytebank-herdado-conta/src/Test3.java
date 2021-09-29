package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

public class Test3 {

        public static void main(String[] args) {
        	
//        	public static Integer valueOf(int i) {
//                if(i >= IntegerCache.low && i <= IntegerCache.high)
//                    return IntegerCache.cache[i + (-IntegerCache.low)];
//                return new ~Integer~(i);
//        }

        	int idade = 29;
            Integer idadeRef = Integer.valueOf(29); //autoboxing
            System.out.println(idadeRef.doubleValue());

            System.out.println("Esse e valor maximo que o INTEGER pode guardar: " + Integer.MAX_VALUE);
            System.out.println("Esse e valor minimo que o INTEGER pode guardar: " +Integer.MIN_VALUE);

            System.out.println("O Numero em Pits: "+Integer.SIZE);
            System.out.println("O Numero em bytes: "+Integer.BYTES);

            int valor = idadeRef.intValue(); //unboxing
            String s = args[0];//"10"
            //Integer numero = Integer.valueOf(s);
            int numero = Integer.parseInt(s);
            System.out.println("O nosso Parametro "+numero);

            List<Integer> numeros = new ArrayList<Integer>();
            numeros.add(29); //Autoboxing
        }
}