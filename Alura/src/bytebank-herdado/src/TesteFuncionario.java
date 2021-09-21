public class TesteFuncionario {

        public static void main(String[] args) {

            Gerente nico = new Gerente();
            nico.setNome("Nico Steppat");
            nico.setCpf("223355646-9");
            nico.setSalario(2600.00);

            System.out.print(nico.getNome());
            System.out.print(nico.getBonificacao());

        }
}