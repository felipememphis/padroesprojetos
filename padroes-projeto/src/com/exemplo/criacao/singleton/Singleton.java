package com.exemplo.criacao.singleton;

public class Singleton {

	private static final Singleton INSTANCE = new Singleton();

	private Singleton() {
	}

	public static final Singleton getInstance() {
		return INSTANCE;
	}
}
