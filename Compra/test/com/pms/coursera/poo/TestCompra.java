package com.pms.coursera.poo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCompra {

	CompraParcelada compra;
	
	@Test
	public void testCompra1Parcela() {
		compra = new CompraParcelada(100, 1, 10);
		assertEquals(110.00, compra.total(), 0.01);
	}
	
	@Test
	public void testCompra2Parcelas() {
		compra = new CompraParcelada(100, 2, 10);
		assertEquals(121.00, compra.total(), 0.01);
	}
	
	
	@Test
	public void testCompra5Parcelas() {
		compra = new CompraParcelada(100, 5, 10);
		assertEquals(161.05, compra.total(), 0.01);
	}
	
	@Test
	public void testCompra10Parcelas() {
		compra = new CompraParcelada(100, 10, 10);
		assertEquals(259.37, compra.total(), 0.01);
	}

}
