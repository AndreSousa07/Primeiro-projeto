package Exercicios;

import java.util.Scanner;

public class atividade11 {
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o salário base do funcionário: ");
        
        double salarioBase = scanner.nextDouble();
        
        double gratificacao = salarioBase * 0.05;
        
        double imposto = salarioBase * 0.07;
        
        double salarioReceber = salarioBase + gratificacao - imposto;
        
        System.out.println("O salário a receber é: " + salarioReceber);
    }
}
