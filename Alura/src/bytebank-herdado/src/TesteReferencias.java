public class TesteReferencias {

        public static void main(String[] args) {

                Gerente g1 = new Gerente();
                g1.setNome("Marcos");
                g1.setSalario(5000.0);
                
//                Funcionario f = new Funcionario(); {apois colocar ABSTRAT em funcionario essa linha de comando nao funcionara mais pois nao mais concreto}
//                f.setNome("Liudimilla");
//                f.setSalario(2000.00);
                
                EditorVideo ev = new EditorVideo();
                ev.setNome("Marta");
                ev.setSalario(2500.0);
                
                Designer d = new Designer();
                d.setNome("Joao");
                d.setSalario(2000.0);
                
                Analista a = new Analista();
                a.setNome("Lucas");
                a.setSalario(8000.0);
                
                Programador p = new Programador();
                p.setNome("Mariana");
                p.setSalario(2100.0);
                
                
                ControleBonificacao controle = new ControleBonificacao();
                controle.registra(g1);
                //controle.registra(f); {apois colocar ABSTRAT em funcionario essa linha de comando nao
                controle.registra(ev);
                controle.registra(d);
                controle.registra(a);
                controle.registra(p);
                
                System.out.println(controle.getSoma());

        }
}