package br.com.bytebank.banco.contas;



import br.com.bytebank.banco.base.Cliente;

public abstract class Conta2 {

    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    static int total = 0;
    
    public Conta2() {

    }

    
    public Conta2(int agencia, int numero){
        Conta2.total++;
        //System.out.println("O total de contas é " + Conta.total);
        this.agencia = agencia;
        this.numero = numero;
        //this.saldo = 100; para que a conta inicio com valor 100.
        //System.out.println("Estou criando uma conta " + this.numero);
    }
     
    public abstract void deposita(double valor); //{
        //this.saldo = this.saldo + valor;
    //}

    public boolean saca(double valor) {
        if(this.saldo < valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfere(double valor, Conta2 destino) {
        if(this.saca(valor)) {
                destino.deposita(valor);
                return true;
        } else {
                return false;
        }
    }

    public double getSaldo(){
        return this.saldo;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int numero){
        if(numero <= 0) {
            System.out.println("Nao pode valor menor igual a 0");
            return;
        }
        this.numero = numero;
    }

    public int getAgencia(){
        return this.agencia;
    }

    public void setAgencia(int agencia){
       if(agencia <= 0) {
           System.out.println("Nao pode valor menor igual a 0");
           return;
       }
       this.agencia = agencia;
    }

    public void setTitular(Cliente titular){
        this.titular = titular;
    }

    public Cliente getTitular(){
        return this.titular;
    }

    public static int getTotal(){
        return Conta2.total;
    }

}