package Exercicios;

import java.util.Scanner;

public class atividade18 {

	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite o valor em reais: ");
	        double valorEmReais = scanner.nextDouble();

	        System.out.print("Digite a cotação do dólar: ");
	        double cotacaoDolar = scanner.nextDouble();

	        double valorEmDolar = valorEmReais / cotacaoDolar;

	        System.out.printf("O valor em dólares é: %.2f%n", valorEmDolar);

	        scanner.close();
	    }
	}
