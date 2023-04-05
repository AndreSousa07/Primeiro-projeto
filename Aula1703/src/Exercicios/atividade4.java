package Exercicios;

import java.util.Scanner;

    public class atividade4 {
   
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite sua altura em metros: ");
        double altura = input.nextDouble();
        
        System.out.print("Digite seu sexo (m ou f): ");
        String sexo = input.next();
        
        double pesoIdeal;
        if(sexo.equals("m")) {
            pesoIdeal = 72.7 * altura - 58;
            System.out.printf("Seu peso ideal é: %.2f kg", pesoIdeal);
        } else if(sexo.equals("f")) {
            pesoIdeal = 62.1 * altura - 44.7;
            System.out.printf("Seu peso ideal é: %.2f kg", pesoIdeal);
        } else {
            System.out.println("Sexo inválido. Digite 'm' para masculino ou 'f' para feminino.");
        }
        
        input.close();
    }
}
