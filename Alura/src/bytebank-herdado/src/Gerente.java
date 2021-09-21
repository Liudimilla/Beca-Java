public class Gerente extends Funcionario implements Autenticavel {

	private AutenticacaoUtil autenticador;

    public Gerente() {
        this.autenticador = new AutenticacaoUtil();
    }


    public double getBonificacao(){
    	System.out.println("Chamando o metodo de bonificacao do GERENTE");
        return super.getSalario();
        // Implements da bonificação do gerente omitida
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
      
      //Gerente é um Funcionário, Gerente herda da classe Funcionário
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
//    o valor correto da bonificação, ou seja, 10% do salário, R$ 500,00, mais um salário integral, 
//    R$ 5.000,00. Isso significa que nosso método funcionou.
   public double getBonificacao() {// Reescrita , com obj de usar a mesma assinatura./apois a class FUNCIONARIO virar a ABSTRATA essa linha de comando e isenta
    	// return (this.salario * 0.1) + super.salario; //Sig. que nao pertece a essa classe e sim a super CLASSE
    	
    	System.out.println("Chamando o método bonificacao do GERENTE");
   	//return super.getBonificacao() + super.getSalario();//nao sera mais necessario usar PROTECTED no atributo,
    


}
*/
