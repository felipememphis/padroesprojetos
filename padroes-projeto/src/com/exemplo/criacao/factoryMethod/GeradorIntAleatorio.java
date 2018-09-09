package com.exemplo.criacao.factoryMethod;

public class GeradorIntAleatorio {

	public static final int VALOR_MINIMO = 0;
	
	private int min;
	private int max;
	
	private GeradorIntAleatorio(int min, int max) {
		this.min = Math.min(min, max);
		this.max = Math.max(min, max);
	}
	
	public static GeradorIntAleatorio entre(int min, int max) {
		return new GeradorIntAleatorio(min, max);
	}
	
	public static GeradorIntAleatorio maiorQue(int min) {
		return new GeradorIntAleatorio(min, Integer.MAX_VALUE);
	}
	
	public static GeradorIntAleatorio menorQue(int max) {
		return new GeradorIntAleatorio(VALOR_MINIMO, max);
	}
	
}
