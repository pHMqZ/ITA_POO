package com.phmqz.poo.embaralhador;

import java.util.Random;

public class FabricaEmbaralhador {
	
	public static Embaralhador factory() {
		switch(new Random().nextInt(3)) {
			case 0:
				return new InversorString();
			case 1:
				return new OrdemAlfabetica();
			case 2:
				return new TrocarImparComPar();
			default:
				throw new IllegalArgumentException("Fabrica do Embaralhador com problemas");
		}
	}

}
