package com.pms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestAuto {
	
	private Autoridade autoridade;

	@Test
	public void testInformal() {
		autoridade = new Autoridade("Phillip", "Marques", new Informal());
		assertEquals("Phillip", autoridade.getTratamento());
	}
	
	@Test
	public void testRespeitosoMasc() {
		autoridade = new Autoridade("Phillip", "Marques", new Respeitoso("masculino"));
		assertEquals("Sr. Marques", autoridade.getTratamento());
	}
	
	@Test
	public void testRespeitosoFem() {
		autoridade = new Autoridade("Elis", "Marques", new Respeitoso("feminino"));
		assertEquals("Sra. Marques", autoridade.getTratamento());
	}
	
	@Test
	public void testAut() {
		autoridade = new Autoridade("Phillip", "Marques", new Titulo("Exmo"));
		assertEquals("Exmo Phillip Marques", autoridade.getTratamento());
	}

}