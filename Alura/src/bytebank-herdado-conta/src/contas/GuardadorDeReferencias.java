package br.com.bytebank.banco.contas;

import java.util.Iterator;

public class GuardadorDeReferencias implements Iterable {

        private Object[] referencias;
        private int posicaoLivre;

        public GuardadorDeReferencias() {
                this.referencias = new Object[10];
                this.posicaoLivre = 0; //Inicializaremos a vari�vel posicaoLivre dentro do m�todo GuardadorDeContas(), com o valor 0
        }

        public void adiciona(Object ref) {
        	this.referencias[this.posicaoLivre] = ref;////sera poss�vel armazenarmos a refer�ncia na primeira posi��o dispon�vel
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