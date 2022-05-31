package com.pms.coursera.poo;

public class CalcBonus {
	
	public int bonusDia = 1;
	
	public int bonusUsuario(Usuario u) {
		int mult = bonusDia;
		if(u.vip) {
			mult *= 5;
		}
		return mult;
	}

}
