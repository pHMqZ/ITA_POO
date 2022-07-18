package com.phmqz.poo.mecanica;

import com.phmqz.poo.IO;
import com.phmqz.poo.embaralhador.Embaralhador;

public class PalavraUnica implements MecanicaDeJogo{
	
	private String palavra;
	private Embaralhador e;
	private int pontos;
	private boolean fdj;
	
	PalavraUnica(){
		this.palavra = null;
		this.e = null;
		this.pontos = 0;
		this.fdj = true;
	}

	@Override
	public void setEmbaralhar(Embaralhador e) {
		this.e = e;
		
	}

	@Override
	public void SetPalavra(String p) {
		
		if(e == null) throw new RuntimeException("Embaralhador não definido");
		
		this.palavra = p;
		this.pontos = 10*p.length();
		this.fdj = false;
		
	}

	@Override
	public String getPalavra() {
		return e.Embaralhar(this.palavra);
	}

	@Override
	public boolean novaTentativa() {
		return !this.fdj;
	}

	@Override
	public void tentativa(String p) {
		if(palavra.equals(p)) {
			this.fdj = true;
			IO.acerto(this.getPontos());
		} else {
			pontos -= 10;
			if(this.pontos > 0) {
				IO.tenteNovamente();
			} else {
				this.fdj = true;
				IO.finalizar(this.getPalavra());
			}
		}
		
	}
	
	public int getPontos() {
		return this.pontos;
	}

	@Override
	public boolean fimDeJogo() {
		return this.fdj;
	}

}
