package Banco;

public class TestaMetodo {
	public static void main(String[] args) {
		
			    Conta contaDoPaulo = new Conta();
			  //invocar um metodo
			  
			    contaDoPaulo.saldo = 100; 
		        contaDoPaulo.deposito(50);
		        System.out.println(contaDoPaulo.saldo);
		        contaDoPaulo.saca(20); //invocaçao de metodo.:
		        contaDoPaulo.titular = "Paulo Silveira";
		        System.out.println(contaDoPaulo.saldo);
		        System.out.println("Titular da Conta " + contaDoPaulo.titular);
		        //contaDoPaulo.ted(78, contaDaMarcela);
		        
		        boolean conseguiuRetirar = contaDoPaulo.saca(20);
		        System.out.println("Saldo Paulo " +contaDoPaulo.saldo); //
		        System.out.println(conseguiuRetirar);
		        
		        Conta contaDaMarcela = new Conta();
		        contaDaMarcela.deposito(1000);
		        
		       
		        
		        
		        contaDoPaulo.ted(78, contaDaMarcela);
		        contaDaMarcela.transfere(300, contaDoPaulo); 
		        System.out.println("Marcela transfere para Paulo " + contaDaMarcela.saldo);
		        System.out.println("Saldo da conta de Paulo " + contaDoPaulo.saldo);//verificar saldo da conta do Paulo.
		        
		        if(contaDaMarcela.transfere(300, contaDoPaulo)) {
		            System.out.println("\n transferencia com sucesso");
		        } else {
		            System.out.println("\n faltou dinheiro");
		        }

		        if(contaDoPaulo.ted(7800, contaDaMarcela)) {
		            System.out.println("\n Marcela voce recebeu R$ 78");
		        } else {
		            System.out.println("\n faltou dinheiro");
		        }
		        System.out.println("Saldo conta Marcela " +contaDaMarcela.saldo);
		        //System.out.println(contaDoPaulo); 
		    }
	

	}



