package com.phmqz.poo.mecanica;

import com.phmqz.poo.IO;
import com.phmqz.poo.embaralhador.Embaralhador;

public class DoisJogadores implements MecanicaDeJogo{
	
	private boolean turno;
	private String palavra;
	private Embaralhador e;
	private boolean fdj;
	
	

	public DoisJogadores() {
		this.turno = true;
		this.palavra = null;
		this.e = null;
		this.fdj = true;
	}

	@Override
	public void setEmbaralhar(Embaralhador e) {
		this.e = e;
		
	}

	@Override
	public void SetPalavra(String p) {
		if (e == null) throw new RuntimeException("Embaralhador não definido");
		
		this.palavra = p;
		this.fdj = false;
	}

	@Override
	public String getPalavra() {
		return this.e.Embaralhar(this.palavra);
	}

	@Override
	public boolean novaTentativa() {
		if(this.fdj) return false;
		IO.turno(this.turno);
		return true;
	}

	@Override
	public void tentativa(String p) {
		if (this.palavra.equals(p)) {
			this.fdj = true;
			IO.acerto(this.turno);
		} else {
			this.turno = !this.turno;
		}
		
	}

	@Override
	public boolean fimDeJogo() {
		return this.fdj;
	}

}
