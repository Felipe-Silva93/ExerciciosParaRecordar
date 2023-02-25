package br.com.calculo.interno;

import java.util.Arrays;

//essa classe será interna não sendo visivel fora do modulo

public class OperacaoAritimetica {

	public double soma(double... nums) {
		return Arrays.stream(nums).reduce(0.0,(total,atual)->total+atual);
	}
}
