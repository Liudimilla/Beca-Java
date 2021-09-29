package br.com.bytebank.banco.test;


import br.com.bytebank.banco.contas.Conta;
import br.com.bytebank.banco.contas.ContaCorrente;
import br.com.bytebank.banco.contas.ContaPoupanca;

public class TestArrayReferencias {

        public static void main(String[] args) {

                //int[] idades = new int[5];
        	    //Object; para guardar qualquer obj nao conta.
        	    Object[] referencias = new Object[5];
                ContaCorrente cc1 = new ContaCorrente(22, 11);//Instancie duas contas e guarde-as nas duas primeiras posições do array
                referencias[0] = cc1;

                ContaCorrente cc2 = new ContaCorrente(22, 22);
                referencias[1] = cc2;
                
                ContaPoupanca cc3 = new ContaPoupanca(99, 19);
                Object[] contas;
				referencias[2] =
                		
                	
                		
//              Cliente cliente = new Cliente();//Com um cast, ou seja, se transformarmos uma referência genérica em uma específica
//              referencias[2] = cliente;		

                System.out.println(cc2.getNumero()); //acessar o nº da cona

                //Através do array, acesse a conta da primeira posição e imprima seu número:
                System.out.println(Conta[0].getNumero());   // acessar o valor desta posiçao{1}

                
               System.out.println( ((Conta) contas[1]).getNumero() );
//
                ContaPoupanca ref = (ContaPoupanca) referencias[2];
                Object ref1 = contas[1];
                System.out.println(cc2.getNumero());// o valor da ref do objeto(new)
                System.out.println(((Conta) ref1).getNumero());
        }

}
