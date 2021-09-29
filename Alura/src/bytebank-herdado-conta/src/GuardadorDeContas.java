package br.com.bytebank.banco.contas;

public class GuardadorDeContas {

        private Conta[] referencias;
        private int posicaoLivre;

        public GuardadorDeContas() {
                this.referencias = new Conta[10];
                this.posicaoLivre = 0; //Inicializaremos a vari�vel posicaoLivre dentro do m�todo GuardadorDeContas(), com o valor 0
        }

        public void adiciona(Conta ref) {
        	this.referencias[this.posicaoLivre] = ref;////sera poss�vel armazenarmos a refer�ncia na primeira posi��o dispon�vel
            this.posicaoLivre++;
        	   }
        public int getQuantidadeDeElementos() {
        	return this.posicaoLivre;
}
        public Conta getReferencia(int pos) {
            return this.referencias[pos];
        }
}