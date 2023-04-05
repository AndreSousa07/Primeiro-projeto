package Exercicios;

import java.util.Scanner;

public class atividade9 {
    public static void main(String[] args) {
        double numero, quadrado, cubo, raizQuadrada;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número positivo: ");
        numero = entrada.nextDouble();

        if(numero < 0) {
            System.out.println("O número digitado não é positivo.");
            return;
        }

        quadrado = Math.pow(numero, 2);
        cubo = Math.pow(numero, 3);
        raizQuadrada = Math.sqrt(numero);

        System.out.printf("O número digitado é %.2f.%n", numero);
        System.out.printf("O número ao quadrado é %.2f.%n", quadrado);
        System.out.printf("O número ao cubo é %.2f.%n", cubo);
        System.out.printf("A raiz quadrada do número é %.2f.%n", raizQuadrada);
    }
}

