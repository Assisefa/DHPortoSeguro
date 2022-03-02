package PortoSeguro;

import java.util.Scanner;

public class Repaticao1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float n1,n2,n3,media,somaMedia=0,mediaGeral;
		
		Scanner leia = new Scanner(System.in);
		
		for(int x = 1; x <= 5; x ++) 
		{
			System.out.println("\n Notas do aluno: "+x+" :");
			
			System.out.println("\n Entre com a primeira nota: ");
			n1 = leia.nextFloat();
			while ( n1 <0 || n1 > 10)
			{
				System.out.println("\n Você digitou uma nota fora do intervalo de 0 a 10 ...\n Entre com a primeira nota: ");
				n1 = leia.nextFloat();	
			}
			
			System.out.println("\n Entre com a segunda nota: ");
			n2 = leia.nextFloat();			
			while ( n2 <0 || n2 > 10)
			{
				System.out.println("\n Você digitou uma nota fora do intervalo de 0 a 10 ...\n Entre com a segunda nota: ");
				n2 = leia.nextFloat();	
			}
			
			System.out.println("\n Entre com a terceira nota: ");
			n3 = leia.nextFloat();			
			while ( n3 <0 || n3 > 10)
			{
				System.out.println("\n Você digitou uma nota fora do intervalo de 0 a 10 ...\n Entre com a primeira nota: ");
				n3 = leia.nextFloat();	
			}
			
			media = (n1 + n2 + n3) / 3;
			
			somaMedia = somaMedia + media;
	
		}
		
		mediaGeral = somaMedia / 5;
		
		System.out.printf("\n A média geral foi de :  %2.2f", mediaGeral);

	}

}
