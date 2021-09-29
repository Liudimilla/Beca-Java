package br.com.bytebank.banco.test.util;

import br.com.bytebank.banco.base.Cliente;
import br.com.bytebank.banco.contas.Conta;
import br.com.bytebank.banco.contas.ContaCorrente;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TesteArrayList {

        public static void main(String[] args) {

        	List<Conta> lista = new ArrayList<Conta>();
        	

                Conta cc = new ContaCorrente(44, 14);
                lista.add(cc);

                Conta cc2 = new ContaCorrente(12, 12);
                lista.add(cc2);
                

//                System.out.println("Tamanho: " lista.size());
//                Object ref =lista.get(0);
//                System.out.println(ref.getNumero());
                 
                lista.remove(0);
              

                System.out.println("Tamanho: " + lista.size());
                Conta ref = (Conta) lista.get(0);
                System.out.println(ref.getNumero());
                
               
                
                System.out.println(lista.size());// Qtas referencias foram guardadas aqui

//                Conta ref = (Conta) lista.get(0);
//                System.out.println(ref.getNumero());
                
                for(int i = 0; i < lista.size(); i++) {
                    Object oRef = (Object) lista.get(i);
                    System.out.println(oRef);
                }

                System.out.println("-------");

                for(Conta conta : lista) {
                    System.out.println(conta);
            }

        }
}