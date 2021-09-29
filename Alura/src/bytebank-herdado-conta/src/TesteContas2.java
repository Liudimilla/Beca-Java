package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.contas.ContaCorrente;
import br.com.bytebank.banco.contas.ContaInvestimento;
import br.com.bytebank.banco.contas.ContaPoupanca;
import br.com.bytebank.banco.contas.ContaVirtual;

public class TesteContas2 {

        public static void main(String[] args) {

        	ContaCorrente cc = new ContaCorrente(111, 111);
            cc.deposita(100.0);

            ContaPoupanca cp = new ContaPoupanca(222, 222);
            cp.deposita(200.0);
            
            ContaVirtual cv = new ContaVirtual(333, 33, 3);
            cv.deposita(500.0);
            
            ContaInvestimento ci = new ContaInvestimento(444, 44, 4);
            ci.deposita(10000.00);
            
            //cc.transfere(10.0, cp); //cp e a CONTA destino.:
            //ci.transfere(800.00, cv);
           
            
            System.out.println("CC: " + cc.getSaldo());
            System.out.println("CP: " + cp.getSaldo());
            System.out.println("CV: " + cv.getSaldo());
            System.out.println("CI: " + ci.getSaldo());
        }
}
