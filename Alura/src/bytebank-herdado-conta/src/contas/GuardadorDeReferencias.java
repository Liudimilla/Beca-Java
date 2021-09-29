package br.com.bytebank.banco.contas;

import java.util.Iterator;

public class GuardadorDeReferencias implements Iterable {

        private Object[] referencias;
        private int posicaoLivre;

        public GuardadorDeReferencias() {
                this.referencias = new Object[10];
                this.posicaoLivre = 0; //Inicializaremos a variável posicaoLivre dentro do método GuardadorDeContas(), com o valor 0
        }

        public void adiciona(Object ref) {
        	this.referencias[this.posicaoLivre] = ref;////sera possível armazenarmos a referência na primeira posição disponível
            this.posicaoLivre++;
        	   }
        public int getQuantidadeDeElementos() {
        	return this.posicaoLivre;
}
        public Object getReferencia(int pos) {
            return this.referencias[pos];
        }

		@Override
		public Iterator iterator() {
			// TODO Auto-generated method stub
			return null;
		}
}