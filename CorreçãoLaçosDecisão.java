package PortoSeguro;

import java.util.Scanner;

public class Corre��oLa�osDecis�o {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* fa�a um programa que leia um numero inteiro e mostre a mensagem
		 * indicando se este n�mero � par ou �mpar, se � positivo o negativo.
		  */
		 
			
		int numero;
		
		try (Scanner leia = new Scanner(System.in)) {
			System.out.println("\n Digite um n�mero: ");
			numero = leia.nextInt();
		}
		
		if(numero % 2 == 0) {
			if(numero >= 0) {
				System.out.println("\n Este n�mero � par e positivo!");
			}
			else
			{
				System.out.println("\n Este n�mero � par e negativo");
			}
		}
		else {
	
			if(numero >= 0) {
				System.out.println("\n Este n�mero � impar e positivo!");
			}
			else
			{
				System.out.println("\n Este n�mero � impar e negativo");
						
		}
	}
	}
}
	
