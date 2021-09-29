package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.Comparator;
//import java.util.Comparator;
import java.util.List;

import br.com.bytebank.banco.contas.Conta;
import br.com.bytebank.banco.contas.ContaCorrente;
//import br.com.bytebank.banco.contas.ContaPoupanca;

public class Test2 {

        	public static void main(String[] args) {

                Conta cc1 = new ContaCorrente(22, 33);
                cc1.deposita(333.0);

                Conta cc3 = new ContaCorrente(22, 11);
                cc3.deposita(111.0);

                List<Conta> lista = new ArrayList<>();
                lista.add(cc1);
                //lista.add(cc2);
                lista.add(cc3);
                //lista.add(cc4);
                
                 for (Conta conta : lista) {
					System.out.println(conta);
				}
                
                NumeroDaContaComparator comparator = new NumeroDaContaComparator();
                
                lista.sort(comparator);
                
                System.out.println("*****************");
                
                for (Conta conta : lista) {
					System.out.println(conta);
				}

       }
}
class NumeroDaContaComparator implements Comparator<Conta> {

    @Override
    public int compare(Conta c1, Conta c2) {

            if(c1.getNumero() < c2.getNumero()) {
                return -1;
            }

            if(c1.getNumero() > c2.getNumero()) {
                return 1;
            }

        return 0;
    }
}