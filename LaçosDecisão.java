package PortoSeguro;

import java.util.Scanner;

public class La�osDecis�o {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		float n1,n2,resultado=0;
		int op;
		
		Scanner veja = new Scanner(System.in);
		
		System.out.println("\n Digite um n�mero: ");
		n1 = veja.nextFloat();
		System.out.println("\n Digite um n�mero: ");
		n2 = veja.nextFloat();
	
		
		System.out.println("\n Calculadora");
		System.out.println("\n 1 - Soma");
		System.out.println("\n 2 - Diferen�a");
		System.out.println("\n 3 - Divis�o");
		System.out.println("\n 4 - Multiplica��o");
		System.out.println("\n Escolha sua op��o");
		
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
				System.out.println("\n Divis�o n�o autorizada");
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
				System.out.println(" \n Op��o Inv�lida!");
		}
		
		System.out.println(" \n Resultado: " + resultado);
		
				
	}

}
