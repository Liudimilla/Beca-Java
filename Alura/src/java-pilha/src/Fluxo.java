
public class Fluxo {

	public static void main(String[] args) {
	    System.out.println("Ini do main");
	    try { // tenta imprimir.
	    	
//	    	Para evitar que a exce??o caia na nossa pilha, 
//	    	vamos utilizar o bloco try e catch:
	    	
	    	metodo1();
	    } catch(Exception ex) { // ( Sig.: | OU ) esse erro imprimi a msg
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

    private static void metodo2()throws MinhaExcecao {
        System.out.println("Ini do metodo2");
        throw new MinhaExcecao("deu muito errado");
//        for(int i = 1; i <= 5; i++) { //retornar uma ArithmeticException!
//            System.out.println(i);
            //int a = i / 0;
            //Conta c = null;
            //c.deposita();
        
        //System.out.println("Fim do metodo2");
    }
}