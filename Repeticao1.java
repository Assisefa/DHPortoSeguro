package PortoSeguro;

import java.util.Scanner;

public class Repeticao1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float [] media = new float[5];
		String [] nomeAluno = new String[5];
		float n1,n2,n3,somaMedia=0,mediaGeral;
		
		Scanner leia = new Scanner(System.in);
		
		for(int x=0;x<5;x++)
		{
			System.out.println("\nNotas do aluno "+ (x+1));
			
			
			System.out.println("\nEntre com a primeira nota: ");
			n1 = leia.nextFloat();			
			while(n1<0 || n1 >10)
			{
				System.out.println("\nVocê digitou um valor fora de 0 a 10..."
						+"\nEntre com a primeira nota : ");
			}
			
			
			System.out.println("\nEntre com a segunda nota:  ");			
			n2 = leia.nextFloat();
			while(n1<0 || n1 >10)
			{
				System.out.println("\nVocê digitou um valor fora de 0 a 10..."
						+"\nEntre com a segunda nota : ");
			}
			
			System.out.println("\nEntre com a terceira nota:  ");			
			n3 = leia.nextFloat();
			while(n1<0 || n1 >10)
			{
				System.out.println("\nVocê digitou um valor fora de 0 a 10..."
						+"\nEntre com a primeira nota : ");
			}
		
			
			media [x]= (n1+n2+n3)/3;
			
			somaMedia += media[x];
		}
		
		mediaGeral = somaMedia / x;
		System.out.printf("\n A média geral foi de:  %2.2f ",mediaGeral);
	}

}
