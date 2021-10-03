package br.com.alura.loja.dao;


import javax.persistence.EntityManager;

import br.com.alura.loja.modelo.Categoria;

public class CategoriaDao {
	
	private EntityManager em;

	public CategoriaDao(EntityManager em) {
		this.em = em;
	}
	
	public void cadastrar(Categoria categoria) {
		this.em.persist(categoria);
	}
	public void atualizar(Categoria categoria) {
		this.em.merge(categoria);

}
	public void remover(Categoria categoria) {// precisa esta na categoria merge
		categoria = em.merge(categoria);//para força o merge.
		this.em.remove(categoria);

}
}