public class ControleBonificacao {

        private double soma;//ser� um resultado da soma atual mais a bonifica��o

        public void registra(Gerente g) { //METODOS PARA registrar a soma
            double boni = g.getBonificacao();
            this.soma = this.soma + boni;

        }
        public void registra(Funcionario f) {
            double boni = f.getBonificacao();
            this.soma = this.soma + boni;

        }
        
        public void registra(EditorVideo ev) {
            double boni = ev.getBonificacao();
            this.soma = this.soma + boni;
        }
        
        public void registra(Programador p) {
            double boni = p.getBonificacao();
            this.soma = this.soma + boni;
        }
        public void registra(Analista a) {
            double boni = a.getBonificacao();
            this.soma = this.soma + boni;
        }
        
        
        public double getSoma() {
            return soma;
        }
}