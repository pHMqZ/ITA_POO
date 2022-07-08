package com.pms;

public class Titulo implements FormatadorNome {
	
	private String titulo;
	
	public Titulo(String titulo) {
		super();
		this.titulo = titulo;
	}

	@Override
	public String formatarNome(String nome, String sobrenome) {
		return this.titulo + " " + nome + " " + sobrenome; 
	}
	
	

}
