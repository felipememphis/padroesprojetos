package com.exemplo.comportamento.strategy;

public class ImpostoISS implements Imposto {

	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
	}
}
