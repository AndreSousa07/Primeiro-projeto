package Exercicios;

import java.util.Scanner;

public class atividade3 {

	public static void main(String[] args) {
	    // TODO Auto-generated method stub
	    Scanner input = new Scanner(System.in);
			        
	    System.out.print("Digite um número inteiro: ");
	    int numero = input.nextInt();
			        
	    if(numero % 2 == 0) {
        System.out.println(numero + " é par.");
	   } 
	    else {
       System.out.println(numero + " é ímpar.");
  }
			        
			        input.close();
			}

		}

	


