package br.com.alura.loja.dao;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.alura.loja.modelo.Categoria;
import br.com.alura.loja.modelo.Produto;

public class ProdutoDao {

    private EntityManager em;

    public ProdutoDao(EntityManager em) {
        this.em = em;
    }

    public void cadastrar(Produto produto) {
        this.em.persist(produto);
    }
    
    public void atualizar(Categoria categoria) {
		this.em.merge(categoria);

}
	public void remover(Categoria categoria) {		categoria = em.merge(categoria);
		this.em.remove(categoria);
	}
    public Produto buscarPorId(Long id) { //para busca 1 PRODUTO
    	return em.find(Produto.class, id);// primeiro o parametro da Entidade, segundo a ID.
    
    }
    public List<Produto> buscarTodos() {
        String jpql = "SELECT p FROM Produto p";
            return em.createQuery(jpql).getResultList();
    }
//    public List<Produto> buscarPorNome(String nome) { // Realizar busca por nome
//    	String jpql = "SELECT p FROM Produto p WHERE p.categoria.nome = :nome";// WHERE + O NOME DO ATRIBUTO+O PARAMETRO
//    	return em.createQuery(jpql, Produto.class)
//    			.setParameter("nome", nome)
//            		.getResultList();
 //   } 1º Opçao para passar um parametro
    public List<Produto> buscarPorNome(String nome) { // Realizar busca por nome
    	String jpql = "SELECT p FROM Produto p WHERE p.categoria.nome = :?1";// WHERE + O NOME DO ATRIBUTO+O PARAMETRO
    	return em.createQuery(jpql, Produto.class)
    			.setParameter(1, nome)
            		.getResultList();
}
    public List<Produto> buscarPorNomeDaCategoria(String nome) { // Realizar busca por nome
    	String jpql = "SELECT p FROM Produto p WHERE p.categoria.nome = :nome";// WHERE + O NOME DO ATRIBUTO+O PARAMETRO
    	return em.createQuery(jpql, Produto.class)
    			.setParameter("nome", nome)
            		.getResultList();
}
    public BigDecimal buscarPrecoDoProdutoComNome(String nome) { // Limitando dados de uma consulta
    	String jpql = "SELECT p.preco FROM Produto p WHERE p.categoria.nome = :nome";// WHERE + O NOME DO ATRIBUTO+O PARAMETRO
    	return em.createQuery(jpql, BigDecimal.class) // metodo para trazer somente o preço.
    			.setParameter("nome", nome)
            		.getSingleResult();//Para trazer um unico resultado
}
}