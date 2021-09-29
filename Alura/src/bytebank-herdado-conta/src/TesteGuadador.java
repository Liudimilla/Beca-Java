package br.com.bytebank.banco.test;

import br.com.bytebank.banco.contas.Conta;
import br.com.bytebank.banco.contas.ContaCorrente;
import br.com.bytebank.banco.contas.ContaPoupanca;
import br.com.bytebank.banco.contas.ContaVirtual;
import br.com.bytebank.banco.contas.GuardadorDeContas;

public class TesteGuadador {
	public static void main(String[] args) {

        GuardadorDeContas guardador = new GuardadorDeContas();

        Conta cc = new ContaCorrente(22, 11);
		guardador.adiciona(cc);

        Conta cc2 = new ContaCorrente(22, 22);
        guardador.adiciona(cc2);
        
        Conta cc3 = new ContaPoupanca(33, 13);
        guardador.adiciona(cc3);
        
        Conta cc4 = new ContaVirtual(44, 10);
        guardador.adiciona(cc4);
        
        int tamanho = guardador.getQuantidadeDeElementos();//guardador.getQuantidadeDeElementos(), para sabermos o número de itens inicializados:
        System.out.println(tamanho);

        Conta ref = guardador.getReferencia(1);
		System.out.println(ref.getNumero());
	}

}
