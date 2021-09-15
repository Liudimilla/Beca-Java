package AulaJdkJre;

public class TestaCondicional2 {
    public static void main(String[] args) {
        System.out.println("testando condicionais");
        int idade = 16;
        int quantidadePessoas = 3;
        boolean acompanhado = quantidadePessoas >= 2;
        
        
        if (idade >= 18 || quantidadePessoas >= 2) { // OR
        	//if (idade >= 18 && acompanhado) { // AND
            System.out.println("seja bem vindo");
        } else {
            System.out.println("infelizmente você não pode entrar");
            System.out.println("valor de acompanhado = " + acompanhado);
        }
    }
}