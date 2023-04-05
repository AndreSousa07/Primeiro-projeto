package Exercicios;

import java.util.Scanner;

public class atividade5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        int numero1 = input.nextInt();
        
        System.out.print("Digite o segundo número: ");
        int numero2 = input.nextInt();
        
        System.out.print("Digite o terceiro número: ");
        int numero3 = input.nextInt();
        
        int soma = numero1 + numero2 + numero3;
        
        System.out.println("A soma dos três números é " + soma);
    }
}
