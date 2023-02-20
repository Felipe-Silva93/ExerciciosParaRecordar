package modelo.basico.umpramuitos;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Pedidos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private Date data;

	@OneToMany(mappedBy = "pedido",fetch = FetchType.LAZY)
	private List<ItemPedido>itens;
	
	
	public Pedidos(Date data) {
		super();
		this.data = data;
	}
	
	public Pedidos() {
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

	public  List<ItemPedido> getItens() {
		return itens;
	}

	
	
}
