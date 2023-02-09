package infra;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class DAO <E>{

	private static EntityManagerFactory emf ;
	private EntityManager em;
	private Class<E> classe;

	static {//iniciando apartir de um bloco statico iniciando e chamando uma unica vez
		try {
			
			emf = Persistence.createEntityManagerFactory("Exercicios-jpa");
			
		} catch (Exception e) {

		}
		
	}

	public DAO(Class<E> classe) {
		this.classe = classe;
		em =emf.createEntityManager();
	}
	
	public DAO() {
		this(null);
	}
	
	public DAO<E> abrirTransaction(){//metodo que vai abrir transação
		em.getTransaction().begin();
		return this;
	}
	
	public DAO<E> fecharTransaction(){//metodo que vai fechar transação
		em.getTransaction().commit();
		return this;
	}
	
	public DAO<E> incluirTransaction(E entidade){//metodo que vai fechar transação
		em.persist(entidade);
		return this;
	}
	
	//metodo que faz todos os metodos a cima de uma só vez, inclui persiste e commita
	public DAO<E> abriFechaIncluiTransaction(E entidade){//metodo que vai fechar transação
		
		return this.abrirTransaction().incluirTransaction(entidade).fecharTransaction();
	}
	
	
	public List<E>obterTodos(){
		return this.obterTodos(10,0);
		
	}
	public List<E>obterTodos(int quatidadeDeRegistro, int deslocamento){//no bando o camando é ex: limit 4 para obter valor diferente dos 4 primeiro usa limit 4 offset 3 tras a posisao 3 com 4 elementos
		
		if(classe ==null) {
			throw new UnsupportedOperationException("classe nula");
		}
		String jpql = "select e from " + classe.getName() + " e";
		TypedQuery<E> query = em.createQuery(jpql,classe);
		query.setMaxResults(quatidadeDeRegistro);
		query.setFirstResult(deslocamento);
		
		
		return query.getResultList();
		
		
	}
	
	public void fechar() {
		em.close();
	}
	
}


