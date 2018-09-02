package com.exemplo.comportamento.strategy;

public class CalculadoraImpostos {

	public void realizaCalculo(Orcamento orcamento, Imposto imposto) {
		System.out.println(imposto.calcula(orcamento));
	}
}
