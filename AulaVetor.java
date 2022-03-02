package PortoSeguro;

import java.util.Scanner;

public class AulaVetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		float [] media = new float [5];
		String [] nomeAluno = new String[5];
		float n1,n2,n3;
		float somaMedia=0,mediaGeral;
		int x,aprovados=0;
		
		Scanner leia = new Scanner(System.in);
		
		for(x=0;x<5;x++) 
		{
			System.out.println("\n Entre com a primeira nota: ");
			n1 = leia.nextFloat();
			System.out.println("\n Entre com a segunda nota: ");
			n2 = leia.nextFloat();
			System.out.println("\n Entre com a terceira nota: ");
			n3 = leia.nextFloat();
			
			media[x] = (n1+n2+n3)/3;
			
			if(media[x] >=7 && media[x]<=10) 
			{
				System.out.println("\n Parabéns aluno Aprovado!");
				aprovados++;
			}
			else if (media[x] >=5 && media[x]<7) 
			{
				System.out.println("\n Aluno está de Recuperação!");
				
			}
			else 
			{
				System.out.println("\n Aluno Reprovado!");
			}
			System.out.println("\n Aluno: "+nomeAluno[x]+" sua média é: " + media[x]);
			
			somaMedia += media[x];
		}
		
		mediaGeral = somaMedia/x;
		
		System.out.println("\n Média Geral "+ mediaGeral);
		System.out.println("\n Tivemos "+aprovados+ " alunos aprovados!");
	}

}
