package br.com.bytebank.banco.contas;
public class ContaPoupanca extends Conta {

        public ContaPoupanca(int agencia, int numero) {
            super(agencia, numero);
       
        }

		@Override
		public void deposita(double valor) {
			super.saldo += valor;
			
		}
		@Override // para declarar o nome na saida
		public String toString() {
		    return "ContaPoupanca, " + super.toString();
		}
}