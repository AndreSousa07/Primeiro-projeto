package Exercicios;

import java.util.Scanner;

public class atividade8 {
	
    public static void main(String[] args) {
        double raio, area;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o valor do raio do círculo: ");
        raio = entrada.nextDouble();
        
        area = Math.PI * Math.pow(raio, 2);
        
        System.out.printf("A área do círculo é: %.2f", area);
    }
}

