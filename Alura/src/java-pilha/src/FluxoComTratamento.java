
public class FluxoComTratamento {

	public static void main(String[] args) {
	    System.out.println("Ini do main");
	    try { // tenta imprimir.
	    	
//	    	Para evitar que a exceção caia na nossa pilha, 
//	    	vamos utilizar o bloco try e catch:
	    	
	    	metodo1();
	    } catch(ArithmeticException | NullPointerException | MinhaExcecao ex) { // ( Sig.: | OU ) esse erro imprimi a msg
	        String msg = ex.getMessage();//fazer um referncia para chamar um metodo, no caso ex.getMess..
	        System.out.println("Exception " + msg);
	        ex.printStackTrace();//imprima o seu rastro...
	    }
	
	        System.out.println("NullPointerException " );//Para tirar bomba da pinha .:
	    
	    System.out.println("Fim do main");
	}

    private static void metodo1() {  // so funciona (com o STATIC)a partir de uma referencia.:
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");
        //ArithmeticException exception = new ArithmeticException();
        //A referência exception aponta para a 
        //ArithmeticException, que está no HEAP (memória de objetos)
        throw new MinhaExcecao("Deu muito errado") ; //transformar em uma exceção e "jogar" na pilha
        }
//    O Java reconhece que, quando jogamos uma exceção, saímos abruptamente 
//    do código. Se isso acontece, jamais será possível executar a linha que
//    mostra "Fim do metodo2".
        // System.out.println("Fim do metodo2");
    }
