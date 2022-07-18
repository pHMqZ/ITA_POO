package com.phmqz.poo.mecanica;

public class FabricaMecanica {
	public static MecanicaDeJogo factory(String mecanica) {
		switch (mecanica) {
		case "Um jogador": 
			return new PalavraUnica();
		case "Dois jogadores":
			return new DoisJogadores();
		default:
			throw new IllegalArgumentException("Modo de jogo invalido!!!");
		}
	}

}
