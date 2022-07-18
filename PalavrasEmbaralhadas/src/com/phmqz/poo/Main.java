package com.phmqz.poo;

import java.io.FileNotFoundException;

import com.phmqz.poo.embaralhador.FabricaEmbaralhador;
import com.phmqz.poo.entity.BancoDePalavras;
import com.phmqz.poo.mecanica.FabricaMecanica;
import com.phmqz.poo.mecanica.MecanicaDeJogo;

public class Main {
	
	public static BancoDePalavras banco;
	public static IO io;
	public static MecanicaDeJogo mecanica;

	public static void main(String[] args) {
		
		try {
			banco = new BancoDePalavras();
		}
		catch(FileNotFoundException file) {
			IO.imprimeExecao(file);
			return;
		}
		
		io = new IO();
		
		
		do {
			mecanica = FabricaMecanica.factory(io.mecanica());
			mecanica.setEmbaralhar(FabricaEmbaralhador.factory());
			mecanica.SetPalavra(banco.getPalavra());
			
			IO.mostrarPalavra(mecanica.getPalavra());
			
			while (mecanica.novaTentativa()) {
				mecanica.tentativa(io.entrada());
			}
		} while (!mecanica.fimDeJogo() || io.jogarNovamente());

	}

}
