package com.pms;

public class Respeitoso implements FormatadorNome {

	private String gender;
	
	
	
	public Respeitoso(String gender) {
		super();
		this.gender = gender;
	}


	@Override
	public String formatarNome(String nome, String sobrenome) {
		if(this.gender.toLowerCase().equals("masculino")) {
			return "Sr. " + sobrenome;
		} else if (this.gender.toLowerCase().equals("feminino")) {
			return "Sra. " + sobrenome;
		}
		return null;
	}

}
