package com.pms.coursera.poo;

import java.util.ArrayList;

public class CarrinhoDeCompras {

	private int precoTotal;

	private ArrayList<Pizza> pedidoPizza = new ArrayList<>();

	public void adicionaPizza(Pizza pizza) {
		if (pizza.getIngredientes().isEmpty()) {

		} else {
			pedidoPizza.add(pizza);
		}

	}

	public int totalPizza() {
		return pedidoPizza.size();
	}
	
	public int getPrecoTotal() {
		for(int i=0; i < pedidoPizza.size(); i++) {
			precoTotal += pedidoPizza.get(i).getPreco();
		}
		
		return precoTotal;
	}
}
