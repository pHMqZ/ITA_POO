package com.pms.coursera.poo;

public class Main {

	public static void main(String[] args) {
		CarrinhoDeCompras pedido = new CarrinhoDeCompras();

		// Cria 3 pizzas com ingredientes diferentes
		Pizza pizza1 = new Pizza();
		Pizza pizza2 = new Pizza();
		Pizza pizza3 = new Pizza();

		pizza1.adicionaIngrediente("Mussarela");
		pizza1.adicionaIngrediente("Tomate");
		
		pizza2.adicionaIngrediente("Mussarela");
		pizza2.adicionaIngrediente("Catupiry");
		pizza2.adicionaIngrediente("Gongorzola");
		pizza2.adicionaIngrediente("Provolone");
		
		pizza3.adicionaIngrediente("Calabreza");
		pizza3.adicionaIngrediente("Mussarela");
		pizza3.adicionaIngrediente("Cebola");

		// Adiciona essas Pizzas em um CarrinhoDeCompra
		pedido.adicionaPizza(pizza1);
		pedido.adicionaPizza(pizza2);
		pedido.adicionaPizza(pizza3);

		// Imprime o total do CarrinhoDeCompra
		System.out.println("Valor total do carrinho: " + pedido.getPrecoTotal());
		
		// Imprime a quantidade utilizada de cada ingrediente
		System.out.println("Total de ingredientes gastos:");
		System.out.println(Pizza.ingredientesUsados);

	}

}
