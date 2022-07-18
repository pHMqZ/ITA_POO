package com.pms;

public class Autoridade {
	
	private String nome;
	private String sobrenome;
	private FormatadorNome format;
	
	public Autoridade(String nome, String sobrenome, FormatadorNome format) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.format = format;
	}
	
	public String getTratamento () {
		return format.formatarNome(nome, sobrenome);
	}

}
