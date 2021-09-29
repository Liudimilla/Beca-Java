package br.com.bytebank.banco.contas;

public class GuardadorDeContas {

        private Conta[] referencias;
        private int posicaoLivre;

        public GuardadorDeContas() {
                this.referencias = new Conta[10];
                this.posicaoLivre = 0; //Inicializaremos a variável posicaoLivre dentro do método GuardadorDeContas(), com o valor 0
        }

        public void adiciona(Conta ref) {
        	this.referencias[this.posicaoLivre] = ref;////sera possível armazenarmos a referência na primeira posição disponível
            this.posicaoLivre++;
        	   }
        public int getQuantidadeDeElementos() {
        	return this.posicaoLivre;
}
        public Conta getReferencia(int pos) {
            return this.referencias[pos];
        }
}