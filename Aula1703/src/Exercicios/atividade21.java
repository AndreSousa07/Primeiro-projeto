package Exercicios;

import java.util.Scanner;

public class atividade21 {
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um ano: ");
        int ano = scanner.nextInt();

        boolean bissexto = false;

        if (ano % 400 == 0) {
            bissexto = true;
        } else if (ano % 4 == 0 && ano % 100 != 0) {
            bissexto = true;
        }

        if (bissexto) {
            System.out.printf("%d é um ano bissexto.%n", ano);
        } else {
            System.out.printf("%d não é um ano bissexto.%n", ano);
        }

        scanner.close();
    }
}

