package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario3NaoGerenciado {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Exercicios-jpa") ;
		EntityManager em = emf.createEntityManager();
		
		
		Usuario usuario = em.find(Usuario.class, 2L);
		if(usuario != null) {
			em.getTransaction().begin();
			em.remove(usuario);
			em.getTransaction().commit();
		}else {
			System.out.println("não foi possivel excluir");
		
		}
		emf.close();
		em.close();
		

	}

}
