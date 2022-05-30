package com.pms.coursera.poo;

public class Principal {

	public static void main(String[] args) {
		Paciente one = new Paciente(80, 1.81);
		Paciente two = new Paciente(100, 1.74);
		Paciente three = new Paciente(50, 1.70);
		
		
		System.out.println("Paciente nº 1: " + one.diagnostico(one));
		System.out.println("Paciente nº 2: " + two.diagnostico(two));
		System.out.println("Paciente nº 3: " + three.diagnostico(three));
	}

}
