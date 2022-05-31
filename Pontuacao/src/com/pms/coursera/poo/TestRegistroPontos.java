package com.pms.coursera.poo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestRegistroPontos {

	@Test
	public void pontosCriarTopicos() {
		Usuario u = new Usuario();
		u.nome = "Phillip";
		CalcBonus cb = new CalcBonus();
		RegistroPontos rp = new RegistroPontos(cb);
		rp.criarTopico(u);
		assertEquals(u.pontos, 5);
		
	}
	
	@Test
	public void pontosCriarTopicosVip() {
		Usuario u = new Usuario();
		u.nome = "Phillip";
		u.vip= true;
		CalcBonus cb = new CalcBonus();
		RegistroPontos rp = new RegistroPontos(cb);
		rp.criarTopico(u);
		assertEquals(u.pontos, 25);
		
	}
	
	@Test
	public void pontosCriarTopicosBonusDia() {
		Usuario u = new Usuario();
		u.nome = "Phillip";
		CalcBonus cb = new CalcBonus();
		cb.bonusDia = 3;
		RegistroPontos rp = new RegistroPontos(cb);
		rp.criarTopico(u);
		assertEquals(u.pontos, 15);
		
	}

	@Test
	public void pontosCriarTopicosBonusDiaVip() {
		Usuario u = new Usuario();
		u.nome = "Phillip";
		u.vip = true;
		CalcBonus cb = new CalcBonus();
		cb.bonusDia = 2;
		RegistroPontos rp = new RegistroPontos(cb);
		rp.criarTopico(u);
		assertEquals(u.pontos, 50);
		
	}
}
