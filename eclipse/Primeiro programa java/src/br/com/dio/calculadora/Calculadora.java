package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		float a, b;
		
		System.out.println("Digite o primeiro valor: ");
		a = scan.nextInt();
		System.out.println("Digite o segundo valor: ");
		b = scan.nextInt();
		
		float soma = soma(a,b);
		float subtração = subtração(a,b);
		float multiplicação = multiplicação(a,b);
		float divisão = divisão(a,b);
		
		System.out.println("Soma " + soma);
		System.out.println("Sub:" + subtração);
		System.out.println("Mult: " + multiplicação);
		System.out.println("Dividão: " + divisão);

	}

	public static float soma (float a, float b) {
		return  (a + b);
	}
	public static float subtração (float a, float b) {
		return (a - b);
	}
	public static float divisão (float a, float b) {
		return (a / b);
	}
	public static float multiplicação (float a, float b) {
		return  (a * b);
	}
}
