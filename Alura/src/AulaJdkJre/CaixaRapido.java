package AulaJdkJre;

public class CaixaRapido {
	    public static void main(String[] args) {
	        System.out.println("testando condicionais");

	        int itens = 10;
	        int idoso = 1;

	        // boolean acompanhado = quantidadePessoas >= 2;

	        boolean deficiente;

	        if (idoso >= 2) {
	            deficiente = true;
	        } else {
	            deficiente = false;
	        }

	        System.out.println("Caro Cliente = " + deficiente);

	        if (itens >= 10 && deficiente) {
	            System.out.println("pode entrar  na fila");
	        } else {
	            System.out.println("Por gentileza vá para outra fila");
	        }
	    }
	}


