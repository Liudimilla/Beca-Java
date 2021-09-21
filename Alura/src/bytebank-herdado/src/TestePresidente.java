
public class TestePresidente {

	    public static void main(String[] args) {
    	Presidente p1 = new Presidente();{
        p1.setNome("Liudimilla");
        p1.setCpf("235568413");
        p1.setSalario(5000.0);

        System.out.println(p1.getNome());
        System.out.println(p1.getCpf());
        System.out.println(p1.getSalario());

        p1.setSenha(2222);
        p1.setAcesso("gloria@");
        boolean autenticou = p1.autentica(2222);
        boolean longado = p1.login("gloria@");

        System.out.println(autenticou);
        System.out.println(longado);
        
        System.out.println(p1.getBonificacao());
        System.out.println(p1.getPromoçao());
}
}
}
