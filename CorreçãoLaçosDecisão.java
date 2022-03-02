package PortoSeguro;

import java.util.Scanner;

public class CorreçãoLaçosDecisão {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* faça um programa que leia um numero inteiro e mostre a mensagem
		 * indicando se este número é par ou ímpar, se é positivo o negativo.
		  */
		 
			
		int numero;
		
		try (Scanner leia = new Scanner(System.in)) {
			System.out.println("\n Digite um número: ");
			numero = leia.nextInt();
		}
		
		if(numero % 2 == 0) {
			if(numero >= 0) {
				System.out.println("\n Este número é par e positivo!");
			}
			else
			{
				System.out.println("\n Este número é par e negativo");
			}
		}
		else {
	
			if(numero >= 0) {
				System.out.println("\n Este número é impar e positivo!");
			}
			else
			{
				System.out.println("\n Este número é impar e negativo");
						
		}
	}
	}
}
	
