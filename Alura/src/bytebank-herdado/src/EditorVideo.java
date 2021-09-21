public class EditorVideo extends Funcionario {

        public double getBonificacao() {
        	System.out.println("Chamando o método de bonificacao do Editor de Video");
                //return super.getBonificacao() + 100; [apois funcionario mudar para RETURN a saida
        	 return 100;
        }
}