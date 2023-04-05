package Exercicios;

import java.util.Scanner;

public class atividade7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a base do triângulo: ");
        double base = input.nextDouble();

        System.out.print("Digite a altura do triângulo: ");
        double altura = input.nextDouble();

        double area = (base * altura) / 2;

        System.out.println("A área do triângulo é: " + area);
    }
}

