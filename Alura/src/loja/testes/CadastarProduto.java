package br.com.alura.loja.testes;

import javax.persistence.EntityManager;

import br.com.alura.loja.modelo.Categoria;
import br.com.alura.loja.util.JPAUtil;

public class CadastarProduto {
	public static void main(String[] args) {
		Categoria celulares = new Categoria ("CELULARES");
		 
        
    EntityManager em = JPAUtil.getEntityManager();
    

    	    em.getTransaction().begin();
    	    
    	    em.persist(celulares);
    	    celulares.setNome("XPTA");
    	    
    	    em.flush();//atualizar
    	    em.clear();
    	    
//    	    em.merge(celulares);// ATUALIZA volta para o estado gereciavel
//    	    celulares.setNome("1234");
//    	    em.flush();
//    	    em.remove(celulares);
//    	    em.flush();//
    	    
    	    celulares = em.merge(celulares);
    	    celulares.setNome("1234");
    	    em.flush();
    	    em.remove(celulares);
   	        em.flush(); // ira desparar um DELETE no banco de dados
    	    
    	    
//    	    em.getTransaction().commit();
//    	    em.close();
//    	    
//    	    celulares.setNome("1234");
    	    
    	    
}


}
