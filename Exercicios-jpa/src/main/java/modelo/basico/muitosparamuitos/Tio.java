package modelo.basico.muitosparamuitos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Tio {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	private String nome;
	
	@ManyToMany
	private List<Sobrinho>sobrinhos = new ArrayList<>();

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

	public final List<Sobrinho> getSobrinhos() {
		return sobrinhos;
	}

	public final void setSobrinhos(List<Sobrinho> sobrinhos) {
		this.sobrinhos = sobrinhos;
	}

	public Tio(String nome) {
		this.nome = nome;
	}
	public Tio() {
		
	}
	
	
	
	
}
