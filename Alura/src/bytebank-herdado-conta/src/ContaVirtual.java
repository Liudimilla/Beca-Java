public class ContaVirtual extends Conta {
	public ContaVirtual(int agencia, int numero, int digito) {
        super(agencia, numero);
    }

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
		
	}
}
