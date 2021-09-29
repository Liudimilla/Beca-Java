package br.com.bytebank.banco.test.util;

import java.util.ArrayList;

import br.com.bytebank.banco.contas.Conta;
import br.com.bytebank.banco.contas.ContaCorrente;

public class TesteArrayListEquals {
	//Código omitido

    public static void main(String[] args) {

    	ArrayList<Conta> lista = new ArrayList<Conta>();

            Conta cc = new ContaCorrente(44, 14);
            lista.add(cc);

            Conta cc2 = new ContaCorrente(12, 12);
            lista.add(cc2);
            
            Conta cc3 = new ContaCorrente(12, 12);
            boolean existe = lista.contains(cc2);
            System.out.println("Ja existe? "+ existe);

//            for(Conta conta : lista) {
//            	if(conta == ehIgual(cc3)) {// ehIgual compara se as contas sao iuais.
//            		System.out.println("Ja tenho essa conta: ");
//            	}
   //         }
            	 for(Conta conta : lista) {
                System.out.println(conta);
        }
    }

}
