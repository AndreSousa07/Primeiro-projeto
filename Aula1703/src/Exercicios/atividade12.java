package Exercicios;

import java.util.Scanner;

	import java.util.Scanner;

	public class atividade12 {
		
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Digite o salário do funcionário: ");
	        
	        double salario = scanner.nextDouble();
	        
	        System.out.print("Digite o percentual de aumento: ");
	        
	        double percentual = scanner.nextDouble();
	        
	        double aumento = salario * (percentual / 100);
	        
	        double novoSalario = salario + aumento;
	        
	        System.out.println("O valor do aumento é: " + aumento);
	        
	        System.out.println("O novo salário é: " + novoSalario);
	    }
	}
