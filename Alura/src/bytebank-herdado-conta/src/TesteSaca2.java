package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.contas.Object;
import br.com.bytebank.banco.contas.ContaCorrente;

public class TesteSaca2 {
    public static void main(String[] args) {
    	Object conta = new ContaCorrente(123, 321);

        conta.deposita(200.0);
        //conta.saca(200.0);

        System.out.println(conta.getSaldo());
    }
}
