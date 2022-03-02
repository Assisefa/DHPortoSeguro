package PortoSeguro;

import java.util.Scanner;

public class LaçosDecisão {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		float n1,n2,resultado=0;
		int op;
		
		Scanner veja = new Scanner(System.in);
		
		System.out.println("\n Digite um número: ");
		n1 = veja.nextFloat();
		System.out.println("\n Digite um número: ");
		n2 = veja.nextFloat();
	
		
		System.out.println("\n Calculadora");
		System.out.println("\n 1 - Soma");
		System.out.println("\n 2 - Diferença");
		System.out.println("\n 3 - Divisão");
		System.out.println("\n 4 - Multiplicação");
		System.out.println("\n Escolha sua opção");
		
		op = veja.nextInt();
		
		switch(op)
		{
		case 1:			
			resultado = n1+n2;
			break;
		
		case 2:
			resultado = n1-n2;
			break;
			
		case 3:
			if(n2 == 0)
			{
				System.out.println("\n Divisão não autorizada");
			}
			else
			{
				resultado = n1/n2;
			}
			break;
			
		case 4:		
			resultado = n1*n2;
			break;
			
			default:
				System.out.println(" \n Opção Inválida!");
		}
		
		System.out.println(" \n Resultado: " + resultado);
		
				
	}

}
