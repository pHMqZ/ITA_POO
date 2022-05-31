package com.pms.coursera.poo.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.pms.coursera.poo.Pizza;

class TestPizza {

	@Test
	void test() {
		Pizza Pizza1 = new Pizza();

		Pizza1.adicionaIngrediente("Queijo");
		Pizza1.adicionaIngrediente("Cebola");
		Pizza1.adicionaIngrediente("Orégano");
		Pizza1.adicionaIngrediente("Presunto");
		Pizza1.adicionaIngrediente("Bacon");

		assertEquals(5, Pizza1.getIngredientes().size());
	}

}
