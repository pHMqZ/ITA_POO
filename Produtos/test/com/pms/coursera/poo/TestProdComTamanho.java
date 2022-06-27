package com.pms.coursera.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TestProdComTamanho {

	@Test
	public void testeEquals() {

		Produto p = new Produto("Camiseta", 2, 30);
		Produto p1 = new Produto("Calça", 2, 32);
		assertEquals(p.equals(p1), p1.equals(p));
	}

	@Test
	public void testeHashCode() {

		Produto p = new Produto("Camiseta", 2, 30);
		Produto p1 = new Produto("Calça", 2, 32);
		assertEquals(p.hashCode(), p1.hashCode());

	}
}
