
public class FluxoComErro {

	public static void main(String[] args) {
	    System.out.println("Ini do main");
	    try { // tenta imprimir.
	    	
//	    	Para evitar que a exceção caia na nossa pilha, 
//	    	vamos utilizar o bloco try e catch:
	    	
	    	metodo1();
	    } catch(ArithmeticException | NullPointerException ex) { // ( Sig.: | OU ) esse erro imprimi a msg
	        String msg = ex.getMessage();//fazer um referncia para chamar um metodo, no caso ex.getMess..
	        //System.out.println("Exception " + msg);
	        //ex.printStackTrace();//imprima o seu rastro...
	    }
	
	        System.out.println("NullPointerException " );//Para tirar bomba da pinha .:
	    
	    System.out.println("Fim do main");
	}

    private static void metodo1() {  // so funciona (com o STATIC)a partir de uma referencia.:
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() { //ficara chamando o METODO2  e apilha cresce e nunca chega no fim
        System.out.println("Ini do metodo2");
        metodo2(); //Repare que método2() chama a si mesmo. Isso também é chamado de recursão.
            
        
        System.out.println("Fim do metodo2");
    }
}