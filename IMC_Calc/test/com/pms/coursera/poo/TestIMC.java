package com.pms.coursera.poo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestIMC {
	
	private double alt = 1.80;

	@Test
	void pesoMuitoGrave() {
		Paciente p1 = new Paciente(40, alt);
		String diag = p1.diagnostico(p1);
		assertEquals("Baixo peso muito grave = IMC abaixo de 16 kg/m²", diag);
	}
	
	
	@Test
	void pesoBaixo() {
		Paciente p1 = new Paciente(55, alt);
		String diag = p1.diagnostico(p1);
		assertEquals("Baixo peso grave = IMC entre 16 e 16,99 kg/m²", diag);
	}
	
	@Test
	void pesoNormal() {
		Paciente p1 = new Paciente(60, alt);
		String diag = p1.diagnostico(p1);
		assertEquals("Peso normal = IMC entre 18,50 e 24,99 kg/m²", diag);
	}

	@Test
	void sobrepeso() {
		Paciente p1 = new Paciente(85, alt);
		String diag = p1.diagnostico(p1);
		assertEquals("Sobrepeso = IMC entre 25 e 29,99 kg/m²", diag);
	}
	
	@Test
	void obsUm() {
		Paciente p1 = new Paciente(100, alt);
		String diag = p1.diagnostico(p1);
		assertEquals("Obesidade grau I = IMC entre 30 e 34,99 kg/m²", diag);
	}
	
	@Test
	void obsDois() {
		Paciente p1 = new Paciente(115, alt);
		String diag = p1.diagnostico(p1);
		assertEquals("Obesidade grau II = IMC entre 35 e 39,99 kg/m²", diag);
	}
	
	@Test
	void obsMorb() {
		Paciente p1 = new Paciente(150, alt);
		String diag = p1.diagnostico(p1);
		assertEquals("Obesidade grau III (obesidade mórbida) = IMC igual ou maior que 40 kg/m²", diag);
	}
}
