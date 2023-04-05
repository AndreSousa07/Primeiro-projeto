package Exercicios;

import java.util.Scanner;

public class atividade16 {
	
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        
        int num1 = scanner.nextInt();
        
        System.out.print("Digite o segundo número: ");
        
        int num2 = scanner.nextInt();
        
        System.out.print("Digite o terceiro número: ");
        
        int num3 = scanner.nextInt();
        
        System.out.print("Digite o quarto número: ");
        
        int num4 = scanner.nextInt();
        
        int menor, meio1, meio2, maior;
        
        if (num4 <= num1) {
            menor = num4;
            meio1 = num1;
            meio2 = num2;
            maior = num3;
            
        } else if (num4 <= num2) {
            menor = num1;
            meio1 = num4;
            meio2 = num2;
            maior = num3;
            
        } else if (num4 <= num3) {
            menor = num1;
            meio1 = num2;
            meio2 = num4;
            maior = num3;
            
        } else {
            menor = num1;
            meio1 = num2;
            meio2 = num3;
            maior = num4;
        }
        System.out.println("Os números em ordem crescente são: " + menor + ", " + meio1 + ", " + meio2 + ", " + maior);
    }
}


