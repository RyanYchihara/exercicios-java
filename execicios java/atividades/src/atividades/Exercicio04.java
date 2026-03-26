package atividades;

import java.util.Scanner;

public class Exercicio04 {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double c, f, k;

        System.out.print("Digite a temperatura em Celsius: ");
        c = teclado.nextDouble();

        f = (c * 9.0/5.0) + 32;
        k = c + 273.15;

        System.out.printf("Celsius: %.1f °C\n", c);
        System.out.printf("Fahrenheit: %.1f °F\n", f);
        System.out.printf("Kelvin: %.1f K\n", k);

        teclado.close();
    }
}