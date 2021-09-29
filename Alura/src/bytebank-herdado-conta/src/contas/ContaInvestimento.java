package br.com.bytebank.banco.contas;

public class ContaInvestimento extends Conta {
	
	public ContaInvestimento(int agencia, int numero, int digito) {
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