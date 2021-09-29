package br.com.bytebank.banco.contas;

import br.com.bytebank.banco.base.Tributavel;

//modelo.CalculadorDeImposto => FQN
public class CalculadorDeImposto {
	
	private double totalImposto;
	
	public void registra(Tributavel t) {
		double valor = t.getValorImposto(); 
			this.totalImposto += valor;
		}
		public double getTotalImposto() {
			return totalImposto;
		}
	}

