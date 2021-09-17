public class Conta {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total;// estancia este atributo para esta classe
     
  //construtor a requisi��o da vari�vel
    public Conta( int agencia, int numero) { 
    	Conta.total ++;
    	System.out.println("O total de contas e "+ total);
        this.agencia = agencia;
        this.numero = numero;
        System.out.println("estou criando uma conta " + this.numero);
    }
    
    
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

    public int getNumero() { 
        return this.numero;
    }

    public void setNumero(int numero) { 
    	if (numero <= 0) {
            System.out.println("n�o pode valor <= 0");
            return;
        }
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }
    
    public void setAgencia(int agencia) { 
        if (agencia <= 0) { 
            System.out.println("nao pode valor menor igual a 0");
            return;
        }
        this.agencia = agencia;            
    }
    public void setTitular(Cliente titular) { 
        this.titular = titular; 

    }

    public Cliente getTitular() {
        return titular;
    }


	public static int getTotal() { //m�todo est�tico gette
		return Conta.total;
	}
    
    
}