package br.com.bytebank.banco.teste;


public class TesteString { 

    public static void main(String[] args) { 

        String nome = "Alura"; // INVES de String outro = new String("Alura")
      /**  //String outra = nome.replace("A", "a");
        // (Opçao 1)String outra = nome.replace("A", "a"); //(Opçao 1)

        String outra =nome.toLowerCase(); // (Opçao 2)
        char c = nome.charAt(2); // Sig. segunda posiçao do nome, ira ler a terceira letra.
        System.out.println(c);   //(Opçao 3)
        System.out.println(nome);
        System.out.println(outra);
        */
        /*
        char c = 'A';
        char d = 'a';
        
        String outra = nome.replace("A", "a"); // (Opçao 4)
        */
       
        /**  int pos = nome.indexOf("ur"); // Ira devolver a posicao
        System.out.println(pos); //(Opçao 5)
        */
        
//        String sub = nome.substring(1); // excluir a primeira letra e mostra o resto
//        System.out.println(sub); 
       
       /** System.out.println(nome.length()); // para saber quantos caracteres tem
        
        for(int i = 0; i < nome.length(); i++) {
        	System.out.println("**"+ nome.charAt(i)); // ira imprimir carater por carater.
        }  //(Exemplo 6)
        */
        
        String vazio = " Alura "; // ira perguntar se esta vazio (Exemplo 7)
//        
      String outroVazio = vazio.trim();
//     System.out.println(outroVazio.isEmpty());
//        
//        System.out.println(vazio.isEmpty());
        
        System.out.println(vazio.contains("Alu")); //pergunta se tem um ALU dentro dessa String
        System.out.println(outroVazio);
   
        

        
    }
}