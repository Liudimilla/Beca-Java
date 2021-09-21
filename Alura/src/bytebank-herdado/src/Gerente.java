public class Gerente extends Funcionario implements Autenticavel {

	private AutenticacaoUtil autenticador;

    public Gerente() {
        this.autenticador = new AutenticacaoUtil();
    }


    public double getBonificacao(){
    	System.out.println("Chamando o metodo de bonificacao do GERENTE");
        return super.getSalario();
        // Implements da bonifica��o do gerente omitida
    }

    @Override
    public void setSenha(int senha){
    	this.autenticador.setSenha(senha);
    }


	@Override
	public boolean autontica(int senha) {
		return this.autenticador.autentica(senha);
	}

}


    /*  ###  Parte 1.::            ####
      
      //Gerente � um Funcion�rio, Gerente herda da classe Funcion�rio
      public class Gerente extends Funcionario
     private int senha;

    public void setSenha(int senha) {
        this.senha = senha;
    }
    
    public boolean autentica(int senha) {
        if(this.senha == senha) {
            return true;
        } else {
            return false;
        }
    }
    //public boolean autentica(String login, int senha) {
    	
    //}
//    o valor correto da bonifica��o, ou seja, 10% do sal�rio, R$ 500,00, mais um sal�rio integral, 
//    R$ 5.000,00. Isso significa que nosso m�todo funcionou.
   public double getBonificacao() {// Reescrita , com obj de usar a mesma assinatura./apois a class FUNCIONARIO virar a ABSTRATA essa linha de comando e isenta
    	// return (this.salario * 0.1) + super.salario; //Sig. que nao pertece a essa classe e sim a super CLASSE
    	
    	System.out.println("Chamando o m�todo bonificacao do GERENTE");
   	//return super.getBonificacao() + super.getSalario();//nao sera mais necessario usar PROTECTED no atributo,
    


}
*/
