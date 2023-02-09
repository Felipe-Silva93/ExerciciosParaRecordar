package modelo.basico;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "produtos")//pode estar adicionando schema ="cuso_java e asi ele vai trabalhad direto com essa tabela
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "prod_nome", length = 200, nullable = false)//mudando o nome da coluna
	private String nome;
	
	@Column(name = "prod_preco", nullable = false, precision = 11, scale = 2)//precision explicamque vai ter 11 digito no maximo// scale siguinifica que antes da virgula terá 2 casas decimas
	private Double preco;
	
	public Produto() {
		
	}
	
	

	public Produto( String nome, Double preco) {
		super();
		this.nome = nome;
		this.preco = preco;
	}



	public final String getNome() {
		return nome;
	}

	public final void setNome(String nome) {
		this.nome = nome;
	}

	public final Double getPreco() {
		return preco;
	}

	public final void setPreco(Double preco) {
		this.preco = preco;
	}

	public final Long getId() {
		return id;
	}



	public final void setId(Long id) {
		this.id = id;
	}

	
	
}
