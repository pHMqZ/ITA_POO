package com.pms.coursera.poo.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.pms.coursera.poo.Pizza;

class TestPizza {

	
	@Test
	void pizzaUm() {
		Pizza pizza1 = new Pizza();

		pizza1.adicionaIngrediente("Queijo");
		pizza1.adicionaIngrediente("Cebola");
		pizza1.adicionaIngrediente("Orégano");
		pizza1.adicionaIngrediente("Presunto");
		pizza1.adicionaIngrediente("Bacon");

		assertEquals(5, pizza1.getIngredientes().size());
	}
	
	@Test
	void pizzaDois() {
		Pizza pizza2 = new Pizza();
		
		pizza2.adicionaIngrediente("Queijo");
		
		assertEquals(1, pizza2.getIngredientes().size());
	}

}
