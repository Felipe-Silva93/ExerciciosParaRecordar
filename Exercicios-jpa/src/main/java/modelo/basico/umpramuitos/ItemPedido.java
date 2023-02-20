package modelo.basico.umpramuitos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import modelo.basico.Produto;

@Entity
public class ItemPedido {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	private Pedidos pedido;
	
	@ManyToOne(fetch = FetchType.EAGER)
	private Produto produto;
	
	@Column(nullable = false)
	private int quantidade;
	
	@Column(nullable = false)
	private Double preco;
	
	
	

	public ItemPedido() {

	}

	
	public ItemPedido(Pedidos pedido, Produto produto, int quantidade) {
		super();
		this.setPedido(pedido);
		this.setProduto(produto);
		this.setQuantidade(quantidade);

	}


	public final Long getId() {
		return id;
	}

	public final void setId(Long id) {
		this.id = id;
	}

	public final Pedidos getPedido() {
		return pedido;
	}

	public final void setPedido(Pedidos pedido) {
		this.pedido = pedido;
	}

	public final Produto getProduto() {
		return produto;
	}

	public final void setProduto(Produto produto) {
		this.produto = produto;
		
		if(produto != null && this.preco == null ) {
			this.setPreco(produto.getPreco());
		}
	}

	public final int getQuantidade() {
		return quantidade;
	}

	public final void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public final Double getPreco() {
		return preco;
	}

	public final void setPreco(Double preco) {
		this.preco = preco;
	}
	
	
	
}
