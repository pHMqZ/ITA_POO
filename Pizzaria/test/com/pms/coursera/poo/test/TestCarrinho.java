package com.pms.coursera.poo.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.jupiter.api.Test;

import com.pms.coursera.poo.CarrinhoDeCompras;
import com.pms.coursera.poo.Pizza;

public class TestCarrinho {
	
	@After
	public void zerar() {
		Pizza.zerarIngredientes();
	}

	@Test
	void testePreco() {
		CarrinhoDeCompras carrinho1 = new CarrinhoDeCompras();
		
		Pizza pizza1 = new Pizza();
		Pizza pizza2 = new Pizza();
		
		pizza1.adicionaIngrediente("Queijo");
		pizza1.adicionaIngrediente("Calabresa");
		
		carrinho1.adicionaPizza(pizza1);
		
		assertEquals(15, pizza1.getPreco());
		assertEquals(0, pizza2.getPreco());
	}
	
	@Test
	void testePizzaVazia() {
		CarrinhoDeCompras carrinho2 = new CarrinhoDeCompras();
		
		Pizza pizza3 = new Pizza();
		
		assertEquals(false, carrinho2.adicionaPizza(pizza3));
	}
}
