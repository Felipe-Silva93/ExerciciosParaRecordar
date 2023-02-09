package teste.basico;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import modelo.basico.Usuario;

public class ObterUsuarios {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Exercicios-jpa") ;
		EntityManager em = emf.createEntityManager();
		
		//String jpql = "select u from Usuario u";
		//TypedQuery<Usuario>query = em.createQuery(jpql,Usuario.class);//consulta com tipo
		//query.setMaxResults(2);//no maximo 5 resultado a parttir dessa consulta
		//List<Usuario> usuarios = query.getResultList();
		
		//OU
		
		List<Usuario> usuarios = em
				.createQuery("select u from Usuario u",Usuario.class)
				.setMaxResults(2)
				.getResultList();
		
		for(Usuario usuario:usuarios) {
			System.out.println("ID:"+ usuario.getId()
			+"email: "+usuario.getEmail());
			
		}
		
		em.close();
		emf.close();
	}

}
