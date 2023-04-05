package Exercicios;


	import java.util.Scanner;
	
	public class atividade10 {
		
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Digite o preço do produto: ");
	        double preco = scanner.nextDouble();
	        double desconto = preco * 0.1;
	        double novoPreco = preco - desconto;
	        System.out.println("O novo preço do produto com 10% de desconto é: " + novoPreco);
	    }
	}
