package modelo.basico.muitosparamuitos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "atores")
public class Ator {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	
	@ManyToMany(mappedBy = "atores")
	private List<Filme> filmes = new ArrayList<>();

	public Ator(String nome) {
		super();
		this.nome = nome;
	}
	public Ator() {
		
	}
	public final String getNome() {
		return nome;
	}
	public final void setNome(String nome) {
		this.nome = nome;
	}
	public final List<Filme> getFilmes() {
		return filmes;
	}
	public final void setFilmes(List<Filme> filmes) {
		this.filmes = filmes;
	}
	
	
	
	

}
