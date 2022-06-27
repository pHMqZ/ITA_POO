package com.pms.coursera.poo;

public class CompraParcelada extends Compra {
	
	private int qntParcelas;
	
	private double juros;

	public CompraParcelada(double valor, int qntParcelas, double juros) {
		super(valor);
		this.qntParcelas = qntParcelas;
		this.juros = juros;
	}
	
	@Override
	public double total() {
		return valor * Math.pow(1 + juros/100, qntParcelas);
	}
}
