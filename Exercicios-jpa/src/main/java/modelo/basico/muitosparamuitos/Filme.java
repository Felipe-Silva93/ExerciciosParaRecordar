package modelo.basico.muitosparamuitos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "filmes")
public class Filme {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	
	private Double nota;
	
	@ManyToMany(cascade = CascadeType.PERSIST)
	
	/*nomeclaturar a baixo para definir nome da tabelas aonde vai ser feita a junção de tabela A e tabela B*/
	@JoinTable(name = "Atores_Filmes",
			joinColumns = @JoinColumn(name="filme_id",/*nome da colina de junção*/referencedColumnName ="id"/*acoluna que ela se referencia*/),
			inverseJoinColumns = @JoinColumn(name="ator_id",referencedColumnName = "id")//tua tabelas diferente indo para uma tabela ntermediaria
			
			)//nome da tabela
	private List<Ator>atores ;

	public Filme(String nome,Double nota) {
		super();
		this.nome = nome;
		this.nota = nota;
	}
	
	public Filme() {
		
	}

	public final String getNome() {
		return nome;
	}

	public final void setNome(String nome) {
		this.nome = nome;
	}

	public final Double getNota() {
		return nota;
	}

	public final void setNota(Double nota) {
		this.nota = nota;
	}

	public final List<Ator> getAtores() {
		
		if(atores == null) {
			atores = new ArrayList<>();
		}
		return atores;
	}

	public final void setAtores(List<Ator> atores) {
		this.atores = atores;
	}
	public void adicionarAtor(Ator ator) {
		if(ator != null && !getAtores().contains(ator)) {
		
			getAtores().add(ator);
			
			if(!atores.contains(this)) {
				ator.getFilmes().add(this);
			}
			
			
		}
		
	}
	
	
	
	
}
