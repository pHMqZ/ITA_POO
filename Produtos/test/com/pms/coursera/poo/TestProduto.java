package com.pms.coursera.poo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestProduto {
	
	@Test
	public void testeEquals() {

		Produto p = new Produto("Camiseta", 2, 30);
		Produto p1 = new Produto("Calça", 2, 32);
		assertEquals(p.equals(p1), p1.equals(p));
	}

	@Test
	public void testeHashCode() {
		
		Produto pt = new Produto("Camiseta", 2, 30);
		Produto pt1 = new Produto("Blusa", 2, 32);
		assertEquals(pt.hashCode(), pt1.hashCode());
	
	}
	
}
