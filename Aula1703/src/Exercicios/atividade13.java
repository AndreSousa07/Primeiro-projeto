package Exercicios;

import java.util.Scanner;

public class atividade13 {
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a nota do trabalho de laboratório: ");
        
        double notaLab = scanner.nextDouble();
        
        System.out.print("Digite a nota da avaliação semestral: ");
        
        double notaSem = scanner.nextDouble();
        
        System.out.print("Digite a nota do exame final: ");
        
        double notaFinal = scanner.nextDouble();
        
        double media = ((notaLab * 2) + (notaSem * 3) + (notaFinal * 5)) / 10;
        
        System.out.println("A média final do estudante é: " + media);
    }
}

