package br.com.calculo;

import br.com.calculo.interno.OperacaoAritimetica;

//essa classe será visivel para fora do modulo
public class Calculadora {
	private OperacaoAritimetica operacoes = new OperacaoAritimetica();

	public double soma(double... nums) {
		return operacoes.soma(nums);
	}
	
	
}
