package com.exemplo.comportamento.strategy;

public class ImpostoICMS implements Imposto{

	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.1;
	}
}
