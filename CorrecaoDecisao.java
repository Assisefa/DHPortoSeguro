package PortoSeguro;

import java.util.Scanner;

public class CorrecaoDecisao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// fa�a um progra,a que leia um nunmero inteiro e mostre uma mensagem na tela
		// indicando se este numero � par ou impar, e se � positivo ou negativo
		
		int numero;
		
		Scanner leia = new Scanner(System.in);
			System.out.println("\n Entre com um n�mero inteiro: ");
			numero = leia.nextInt();
		
			if( numero % 2 == 0 ) 
			{ 
				if( numero >=0) 
				{ 
					System.out.println("\n Este n�mero � par e positivo");
				}
				else 
				{
					System.out.println("\n Este n�mero � par e negativo");
				}
			}
			else{ 
				if( numero >=0) 
				{ 
					System.out.println("\n Este n�mero � impar e positivo");
				}
				else 
				{
					System.out.println("\n Este n�mero � impar e negativo");
				}
		
			}		
		
	}

}
