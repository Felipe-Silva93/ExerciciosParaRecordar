package modelo.basico;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	//@Column(name ="nome da coluna",nullable = false) nome da coluna e se aceita null ou não
	private String nome;
	
	//@Transient esse atributo não sera mapeado para o banco de dados
	private String email;

	public Usuario(String nome, String email) {
		
		this.nome = nome;
		this.email = email;
	}
	
	public Usuario() {
		
	}
	

	public final Long getId() {
		return id;
	}

	public final void setId(Long id) {
		this.id = id;
	}

	public final String getNome() {
		return nome;
	}

	public final void setNome(String nome) {
		this.nome = nome;
	}

	public final String getEmail() {
		return email;
	}

	public final void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
}
