public class TestaGetESet { 
    public static void main(String[] args) { 
    	Conta conta = new Conta(1337,24226);

        //conta.setAgencia(-50); //adicionar ifs nos métodos setAgencia e setNumero, afirmando que caso seja postulado um valor menor ou igual a zero
       // conta.setNumero(-330);
        
       // conta.setNumero(1337);
        System.out.println(conta.getNumero()); 
        
        Cliente paulo = new Cliente();
        //conta.setTitular(paulo); { Aqui nao ira compilar pq o TITULAR esta como privado
        paulo.setNome("paulo silveira"); // Alterar o nome do cliente
 

        conta.setTitular(paulo);
        
        System.out.println(conta.getTitular().getNome()); //ira aparecer o nome

        conta.getTitular().setProfissao("programador"); 
        //agora em duas linhas: 
        Cliente titularDaConta = conta.getTitular();
        titularDaConta.setProfissao("programador");
        
        System.out.println(titularDaConta); 
        System.out.println(paulo);
        System.out.println(conta.getTitular());
        
        
        
        
    }
}