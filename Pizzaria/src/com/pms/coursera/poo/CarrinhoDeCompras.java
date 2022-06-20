package com.pms.coursera.poo;

import java.util.ArrayList;

public class CarrinhoDeCompras {

	private int precoTotal;

	private ArrayList<Pizza> pedidoPizza = new ArrayList<>();

	public boolean adicionaPizza(Pizza pizza) {
		if (pizza.getPreco() != 0) {
			pedidoPizza.add(pizza);
			return true;
		} else {
			return false;
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
