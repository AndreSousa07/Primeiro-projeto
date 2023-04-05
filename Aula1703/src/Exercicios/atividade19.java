package Exercicios;

import java.util.Scanner;

public class atividade19 {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite um número inteiro: ");
	        int numero = scanner.nextInt();

	        int antecessor = numero - 1;
	        int sucessor = numero + 1;

	        System.out.printf("O antecessor de %d é %d.%n", numero, antecessor);
	        System.out.printf("O sucessor de %d é %d.%n", numero, sucessor);

	        scanner.close();
	    }
	}
