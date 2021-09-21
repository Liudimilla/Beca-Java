

	public class Presidente extends Tercerizado {

	    private int senha;
	    private String acesso;

	    public void setSenha(int senha) {
	        this.senha = senha;
	    }
	    public void setAcesso(String acesso) {
	        this.acesso = acesso;
	    }
	    
	    public boolean autentica(int senha) {
	        if(this.senha == senha) {
	            return true;
	        } else {
	            return false;
	        }
	    }
	    public boolean login (String acesso) {
	        if(this.acesso == acesso) {
	            return true;
	        } else {
	            return false;
	        }
	    }
	    public double getBonificacao() {
	    	return super.getBonificacao() + super.getSalario();
	    }
	    public double getPromoçao() { //soma um salário à bonificação atual.
	        return super.getPromoçao() + super.getSalario();
	    }
	}

