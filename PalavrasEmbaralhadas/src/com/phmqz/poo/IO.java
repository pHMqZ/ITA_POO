package com.phmqz.poo;

import java.util.Scanner;

public class IO {
	private Scanner sc;
	
	public IO() {
		sc = new Scanner(System.in);
	}
	
	public String entrada() {
		System.out.print("Tentativa: ");
		return sc.next().toUpperCase();
	}
	
	public String mecanica() {
		while(true) {
			System.out.println("Escolha modo de jogo:");
			System.out.println("Uma palavra/Um Jogador");
			System.out.println("Dois jogadores");
			System.out.print("Opção: ");
			switch(sc.nextInt()) {
			case 1:
				return "Um jogador";
			case 2:
				return "Dois jogadores";
			default:
				System.out.println("Entrada invalida");
			}
		}
	}
	
	public boolean jogarNovamente() {
		System.out.print("Você deseja jogar novamente? (S/N): ");
		String entrada = sc.next().toUpperCase();
		if(entrada.equals("S") || entrada.equals("SIM")) {
			System.out.println("--------------------------------------------------");
			return true;
		}
		System.out.println("Obrigado por participar");
		sc.close();
		return false;
	}
	
	public static void imprimeExecao(Exception e) {
		System.out.println(e);
	}
	
	public static void mostrarPalavra(String palavra) {
		System.out.println("A palavra tem " + palavra.length() + " letras");
		System.out.println("A palavra embaralhada é: " + palavra);
	}
	
	
	public static void acerto (boolean jogador) {
		if(jogador) {
			System.out.println("Parabens, o 1º Jogador acertou a palavra!!!");
		}else {
			System.out.println("Parabens, o 2º Jogador acertou a palavra!!!");
		}
	}
	
	public static void acerto(int pontos) {
		System.out.println("Parabens, você acertou a palavra!!!");
		System.out.println("Você fez " + pontos + " pontos");
	}
	
	public static void tenteNovamente() {
		System.out.println("Errou... Tente Novamente!");
	}
	
	public static void finalizar(String palavra) {
		System.out.println("Errou... Infelizmente suas tentativas acabaram");
		System.out.println("A palavra era " + palavra);
	}
	
	public static void turno(boolean jogador) {
		if(jogador) {
			System.out.println("Vez do 1º jogador");
		}else {
			System.out.println("Vez do 2º jogador");
		}
	}
}
