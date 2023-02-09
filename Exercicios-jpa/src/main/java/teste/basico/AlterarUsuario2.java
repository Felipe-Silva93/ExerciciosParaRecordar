package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario2 {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Exercicios-jpa") ;
		EntityManager em = emf.createEntityManager();
		
		
		em.getTransaction().begin();
		Usuario usuario = em.find(Usuario.class,2L);
		System.out.println(usuario.getEmail());
		usuario.setNome("lulu2");
		usuario.setEmail("birulei@leilei2.com");
		//em.merge(usuario);//merge é responsavel por fazer alteração no banco,faz a atualização
		em.getTransaction().commit();
		emf.close();
		em.close();
		

	}

}
