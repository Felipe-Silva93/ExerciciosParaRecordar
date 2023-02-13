package modelo.umpraum;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name = "assentos")
public class Assento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@OneToOne(mappedBy = "assento")
	private Cliente cliente;
	
	private String nome;

	public Assento(String nome) {
		super();
		this.nome = nome;
	}
	public Assento() {
		
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
	public final Cliente getCliente() {
		return cliente;
	}
	public final void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
	
	
}


