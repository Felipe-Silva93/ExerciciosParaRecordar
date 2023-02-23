package modelo.basico.heranca;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
//@DiscriminatorValue("AB")depois tem que inserir essa anotação no aluno bolsista com AB ou qualque ourto nome

public class AlunoBolsista extends Aluno{

	private double valorBolsa;

	public AlunoBolsista(Long matricula, String nome, double valorBolsa) {
		super(matricula, nome);
		this.valorBolsa = valorBolsa;
	}
	
	public AlunoBolsista() {
		
	}

	public final double getValorBolsa() {
		return valorBolsa;
	}

	public final void setValorBolsa(double valorBolsa) {
		this.valorBolsa = valorBolsa;
	}
	
	
	
	
}
