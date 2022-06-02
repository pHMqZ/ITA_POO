package com.pms.coursera.poo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Pizza {
	
	private List <String> ingredientes = new ArrayList<>();
	
	private int preco;
	
	public static int totalIngredientes = 0;
	
	
	public static Map <String, Integer> ingredientesUsados = new HashMap<>();
	
	
	public List<String> getIngredientes(){
		return ingredientes;
	
	}
	
	
	public static Map<String, Integer> getListaIngredientes(){
		return ingredientesUsados;
	}
	
	
	public static void contabilizaIngredientes(String ingrediente) {
		if (ingredientesUsados.containsKey(ingrediente)) {
			ingredientesUsados.get(ingrediente);
			ingredientesUsados.put(ingrediente, 1);
		} else {
			ingredientesUsados.put(ingrediente, 1);
		}
		totalIngredientes++;
	}
	
	
	public void adicionaIngrediente(String ingrediente) {
		if (ingrediente != "") {
		    this.ingredientes.add(ingrediente);
		    contabilizaIngredientes(ingrediente);
	       }
	    else {
	    	System.out.println("ATENÇÃO: Não foi informado ingrediente  ");
	    	
	       }
	}
	
	
	public int getPreco() {
		if(ingredientes.size() > 0 && ingredientes.size() < 3) {
			preco = 15;
		} else if(ingredientes.size() >= 3 && ingredientes.size() <= 5){
			preco = 20;
		} else if(ingredientes.size() > 5) {
			preco = 23;
		} else {
			preco = 0;
		}
		return preco;
	}
	
	public static void zerarIngredientes() {
		ingredientesUsados.clear();
	}
	
}
