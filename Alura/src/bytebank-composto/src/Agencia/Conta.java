package Agencia;


public class Conta { 
    double saldo = 100; // default com valor 100;[[ existe a possibilidade de ocultarmos um atributo, deixá-lo privado
    int agencia;
    int numero;
    Cliente titular = new Cliente();// toda vez que abrir uma conta abrira um cliente
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
    	    // metodo Pega Saldo que esta em forma PRIVADA
    	    public double getSaldo() {
    	    	return this.saldo;
    	    }
    	} 
    	    
    