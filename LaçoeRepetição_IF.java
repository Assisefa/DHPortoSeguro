package PortoSeguro;

import java.util.Scanner;

public class LaçoeRepetição_IF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nome;
		int idade = 26;
		float altura,nota1,nota2,nota3,media;
		
		Scanner leia = new Scanner(System.in);
				
		System.out.println("\nQual o seu nome: ");
		nome = leia.nextLine();
		System.out.println("\nQual a sua altura: ");
		altura = leia.nextFloat();
		
		System.out.println("Esta é sua primeira nota: ");
		nota1 = leia.nextFloat();
		System.out.println("Esta é sua segunda nota: ");
		nota2 = leia.nextFloat();
		System.out.println("Esta é sua terceira nota: ");
		nota3 = leia.nextFloat();
		
		media = (nota1+nota2+nota3)/3;
		System.out.printf("A sua média ficou em : %2.2f",media);
		
		if(media>=7 && media<=10) 
		{
			System.out.println("\nAluno Aprovado!");
		}
		else if(media>=5 && media<7) 
		{
			System.out.println("\nAluno em Recuparação!");
		}
		else if (media>=0 && media<5)
		{
			System.out.println("\nAluno Reprovado!");
		}
		else 
		{
			System.out.println("\n Nota inválida!");
		}
			}
		}
