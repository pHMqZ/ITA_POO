package com.pms.coursera.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TestCarrinhoDeCompras {

	@Test
	public void testeQuantidadeNoCarrinho() {
		Produto p = new Produto("Calça Jeans", 12, 15);
		CarrinhoDeCompras c1 = new CarrinhoDeCompras();
		c1.adicionaProduto(p, 3);
		assertEquals(CarrinhoDeCompras.getQuantidadeNoCarrinho(), 3);

	}

}
