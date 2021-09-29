package br.com.bytebank.banco.contas;


public class ContaVirtual extends Conta {
	public ContaVirtual(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;	
	}
	
	@Override
	public String toString() {
		return "ContaVirtual, " + super.toString();
	}

}
