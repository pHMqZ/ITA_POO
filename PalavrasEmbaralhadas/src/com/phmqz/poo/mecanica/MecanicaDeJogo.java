package com.phmqz.poo.mecanica;

import com.phmqz.poo.embaralhador.Embaralhador;

public interface MecanicaDeJogo {
	
	public void setEmbaralhar(Embaralhador e);
	
	public void SetPalavra(String p);
	
	public String getPalavra();
	
	public boolean novaTentativa();
	
	public void tentativa(String p);
	
	public boolean fimDeJogo();

}
