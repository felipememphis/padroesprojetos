package com.exemplo.comportamento.strategy;

public class Main {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(400.0);
		CalculadoraImpostos calculadoraImpostos = new CalculadoraImpostos();
		calculadoraImpostos.realizaCalculo(orcamento, new ImpostoICMS());
		calculadoraImpostos.realizaCalculo(orcamento, new ImpostoISS());
	}
}
