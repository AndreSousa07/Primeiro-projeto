package Exercicios;

import java.util.Scanner;

public class atividade14 {
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        
        double num1 = scanner.nextDouble();
        
        System.out.print("Digite o segundo número: ");
        
        double num2 = scanner.nextDouble();
        double maior = num1 > num2 ? num1 : num2;
        
        System.out.println("O maior número é: " + maior);
    }
}
