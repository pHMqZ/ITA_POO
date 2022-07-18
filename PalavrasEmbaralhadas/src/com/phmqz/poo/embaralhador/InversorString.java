package com.phmqz.poo.embaralhador;

public class InversorString implements Embaralhador{

	@Override
	public String Embaralhar(String palavra) {
		return new StringBuilder(palavra).reverse().toString();
	}

}
