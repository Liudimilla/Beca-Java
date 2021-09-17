
public class TestaValores { 
    public static void main(String[] args) { 
    	// int total = 0; //varialvel Local, sempre se iniciara com ZERO
        Conta conta = new Conta(1337,24226);
        //conta.setAgencia(-50); apois a criaçao do construtor tem que passar o ARGUMENTO por paramentro
        //conta.setNumero(-330);
       
        System.out.println(conta.getAgencia());
        conta.setAgencia(1232123);
        
        Conta conta2 = new Conta(1337, 16549);
        Conta conta3 = new Conta(2112, 14660);
        
        System.out.println(Conta.getTotal());//Testando o getter em seu método main
        
        
    }
} 