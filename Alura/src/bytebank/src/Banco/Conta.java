package Banco;


public class Conta { 
    double saldo;
    int agencia;
    int numero;
    String titular;
    String cpf;
    String profissao;
    
    public void deposito(double valor) {
    	this.saldo = this.saldo + valor;
    }
    //Metodos .:
    public boolean transfere(double valor, Conta destino) { 
        if(this.saldo >= valor) { 
            this.saldo -= valor;
            destino.deposito(valor);
            return true;
        } else {
            return false;
        }
    }
    
    public boolean ted(double valor, Conta destino) {
    	if(this.saldo >= valor) {
    		this.saldo -= valor;
    		destino.deposito(valor);
    		return true;
    	} else {
    		return false;
    	}
    }

    	public boolean saca(double valor) { // Metodo 2.:
    	    if(this.saldo >= valor) { 
    	    	this.saldo -= valor;//tira valor dele menos 
    	   
    	        return true;
    	
    	    } else {
    	    	 return true;
    	    }
    	    
    	} 
    	    }
    