package modelo.basico.umpramuitosonetomany;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Pedidos2 {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private Date data;

	@OneToMany(mappedBy = "pedido" )
	private List<ItemPedido2>itens;
	
	
	public Pedidos2(Date data) {
		super();
		this.data = data;
	}
	
	public Pedidos2() {
		this(new Date());
	}

	public final Long getId() {
		return id;
	}

	public final void setId(Long id) {
		this.id = id;
	}

	public final Date getData() {
		return data;
	}

	public final void setData(Date data) {
		this.data = data;
	}

	public final List<ItemPedido2> getItens() {
		return itens;
	}

	
	
	
	
	
}
