package br.com.dio.calculadora;

import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float a, b;
        System.out.println("Digite o primeiro valor: ");
        a = scan.nextFloat();
        System.out.println("Digite o segundo valor: ");
        b = scan.nextFloat();

        float somar = soma(a, b);
        float subtrair = subtração(a, b);
        float dividir = divisão(a, b);
        float multiplicar = multiplicação(a, b);

        System.out.println("Soma: " + somar);
        System.out.println("Subt: " + subtrair);
        System.out.println("div: " + dividir);
        System.out.println("Mult: " + multiplicar);

    }

    public static float soma(float a, float b) {
        return a + b;
    }

    public static float subtração(float a, float b) {
        return a - b;
    }

    public static float divisão(float a, float b) {
        return a / b;
    }

    public static float multiplicação(float a, float b) {
        return a * b;
    }
}
