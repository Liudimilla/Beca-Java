package AulaJdkJre;

public class TestaCaracteres {
	 public static void main(String[] args) {
	char valor = 66;
	char alfabeto = 'a';
	
	valor = (char) (valor + 1);
	System.out.println(valor);

	
	String palavra = "alura cursos online de tecnologia ";
	palavra = palavra + 2021;
	System.out.println(palavra);
	
	System.out.println("******************************");
	
	String saudacao = "Ol�, meu nome � ";
	String nome = "R�mulo ";
	String continuacao = "e minha idade � ";
	int idade = 100;
	System.out.println(saudacao+nome+continuacao+idade);

}
}