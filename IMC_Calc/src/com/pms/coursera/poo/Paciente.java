package com.pms.coursera.poo;

public class Paciente {
	
	private double peso;
	
	private double altura;
	
	
	
	public Paciente(double peso, double altura) {
		this.peso = peso;
		this.altura = altura;
	}


	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	
	public double IMC(double peso, double altura) {
		double calc =  peso/(Math.pow(altura, 2));
		return calc;
	}

	public  String diagnostico(Paciente paciente) {
		double imc = IMC(paciente.getPeso(), paciente.getAltura());
		 
		if (imc < 16) {
			return "Baixo peso muito grave = IMC abaixo de 16 kg/m²";
		}else if(imc >= 16 && imc < 16.99 ) {
			return "Baixo peso grave = IMC entre 16 e 16,99 kg/m²";
		}else if(imc >= 17 && imc <= 18.49 ) {
			return "Baixo peso = IMC entre 17 e 18,49 kg/m²";
		}else if(imc >= 18.50 && imc <= 24.99 ) {
			return "Peso normal = IMC entre 18,50 e 24,99 kg/m²";
		}else if(imc >= 25 && imc <= 29.99 ) {
			return "Sobrepeso = IMC entre 25 e 29,99 kg/m²";
		}else if(imc >= 30 && imc <= 34.99 ) {
			return "Obesidade grau I = IMC entre 30 e 34,99 kg/m²";
		}else if(imc >= 35 && imc <= 39.99 ) {
			return "Obesidade grau II = IMC entre 35 e 39,99 kg/m²";
		}else {
			return "Obesidade grau III (obesidade mórbida) = IMC igual ou maior que 40 kg/m²";
		}
	}

}
