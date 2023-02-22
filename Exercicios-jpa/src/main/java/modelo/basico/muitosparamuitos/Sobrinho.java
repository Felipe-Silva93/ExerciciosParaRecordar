package modelo.basico.muitosparamuitos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Sobrinho {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	private String nome;
	
	@ManyToMany(mappedBy = "sobrinhos")
	private List<Tio>tio = new ArrayList<>();
	
	


	public Sobrinho(String nome) {
		
		this.nome = nome;
	}
	public Sobrinho() {

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
	public final List<Tio> getTio() {
		return tio;
	}
	public final void setTio(List<Tio> tio) {
		this.tio = tio;
	}
	
	
	
}
