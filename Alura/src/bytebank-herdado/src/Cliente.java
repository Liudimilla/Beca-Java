public class Cliente implements Autenticavel {
    
	private AutenticacaoUtil autenticador;

    public Cliente() {
        this.autenticador = new AutenticacaoUtil();
    }
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
		
	}

	@Override
	public boolean autontica(int senha) {
		return this.autenticador.autentica(senha);
	}
	
}