package modelo.basico.heranca;

import javax.persistence.AssociationOverrides;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance (strategy = InheritanceType.TABLE_PER_CLASS) /*TABLE_PER_CLASS) para cada classe concreta vou ter uma tabela
caso momente essa anotação, vai ser criado uma unica tabela juntando as sua  com se fosse SINGLE_TABLE */ //anotação p/mapear como herança
//@DiscriminatorColumn(name="tipo",length = 2, discriminatorType = DiscriminatorType.STRING)
//@DiscriminatorValue("AL")depois tem que inserir essa anotação no aluno bolsista com AB ou qualque ourto nome
/*@Inheritance (strategy = InheritanceType.SINGLE_TABLE) TABLE_PER_CLASS) para cada classe concreta vou ter uma tabela
caso momente essa anotação, vai ser criado uma unica tabela juntando as sua  com se fosse SINGLE_TABLE /anotação p/mapear como herança
@DiscriminatorColumn(name="tipo",length = 2, discriminatorType = DiscriminatorType.STRING)*/

public class Aluno {
	@Id
	private Long matricula;
	
	private String nome;

	public Aluno(Long matricula, String nome) {
		super();
		this.matricula = matricula;
		this.nome = nome;
	}
	public Aluno() {
		
	}
	public final Long getMatricula() {
		return matricula;
	}
	public final void setMatricula(Long matricula) {
		this.matricula = matricula;
	}
	public final String getNome() {
		return nome;
	}
	public final void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	
}
