package Agencia;

public class TesteSacaNegativo { 
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.deposito(100);
        //conta.saca(200);
        //System.out.println(conta.saldo);
        System.out.println(conta.saca(101));
        //System.out.println(conta.saldo);[por esta private nao pode ser acessado o saldo, tera que fazer o metodo PEGASALDO]

      //Proibido:: a manipulação direta de atributos seja proibida.
       // conta.saldo = conta.saldo - 101;//apois colocar como PRIVATE, mudar para => conta.saca(101); 
        //System.out.println("Saldo menos apois 101 "+ conta.saldo);
        //System.out.println("Saldo da conta "+ conta.saldo);
    
        conta.saca(101);

        System.out.println("Pega saldo salvado como atributo PRIVATE "+conta.getSaldo());
    }
}