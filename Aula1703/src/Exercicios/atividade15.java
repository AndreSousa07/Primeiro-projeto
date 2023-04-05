package Exercicios;

import java.util.Scanner;

public class atividade15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();
        System.out.print("Digite o terceiro número: ");
        double num3 = scanner.nextDouble();

        double menor, medio, maior;
        if (num1 <= num2 && num1 <= num3) {
            menor = num1;
            if (num2 <= num3) {
                medio = num2;
                maior = num3;
            } else {
                medio = num3;
                maior = num2;
            }
        } else if (num2 <= num1 && num2 <= num3) {
            menor = num2;
            if (num1 <= num3) {
                medio = num1;
                maior = num3;
            } else {
                medio = num3;
                maior = num1;
            }
        } else {
            menor = num3;
            if (num1 <= num2) {
                medio = num1;
                maior = num2;
            } else {
                medio = num2;
                maior = num1;
            }
        }
        System.out.println("Os números em ordem crescente são: " + menor + ", " + medio + ", " + maior);
    }
}

        
