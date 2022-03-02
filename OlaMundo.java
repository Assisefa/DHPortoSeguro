package PortoSeguro;

import java.util.Scanner;

public class OlaMundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nome;
		int idade = 26,x,y;
		float  altura;
		double nota1,nota2,nota3,media;
		
		Scanner leia = new Scanner(System.in); // criando a entrada de dados do usuário
		
		
		System.out.println("Olá Mundo!!!!"); // criando a saida de dados
		
		System.out.println("Por favor prezado usuário....\nEntre com o seu nome: "); // saida de dados
	/* o \n é só para pular uma linha
	 o \t é para dar um tab, ou seja , para dar espaço*/
		
		nome = leia.nextLine(); // estou pegando a entrada do meu usuário
		System.out.println("Entre com a sua altura: "); // saida de dados 
		altura = leia.nextFloat(); // estou pegando e entrada de dados do meu usuário
		
		System.out.println("Eu me chamo "+nome+ ", tenho "+idade+ " anos de idade"+ 
		" e minha estatura é "+altura+" cm.");
		
		/* Esta é uma outra forma de chamada de dados como foi feito no exercicio acima:
		 * 
		 * lembrando que eu posso usar o printf neste caso  ficaria desta forma: 
		
		 System.out.printf("Eu me chamo %s , tenho %d de idade"+ " e minha altura .2f 
		 é: ",nome,idade,altura);
		 */
		
		
		System.out.println("\nQual foi a sua primeira nota: "); //saida de dados
		nota1 = leia.nextFloat(); // entrada de dados do usuário através do leia e confirmada pelo método nextfloat que será armazenada na variavel nota1
		System.out.println("Qual foi a sua segunda nota: ");
		nota2 = leia.nextFloat();
		System.out.println("Qual foi a sua terceira nota: ");
		nota3 = leia.nextFloat();
		
		media = (nota1+nota2+nota3) / 3; // calculando as notas e tirando a media que será armazenada na variavel media
		
		System.out.printf("A média de suas notas ficou em  %2.2f",media); // saida do calculo de media chamando a variavel media
		
		nota1 = Math.sqrt(nota2); // raiz quadrada
		nota2 = Math.pow(nota3, 3); // potência ao cubo
		
		System.out.println("\nDigite o valor de x: "); // saida de dados
		x = leia.nextInt(); // entrada de dados do usuario na variavel x
		System.out.println("\nDigite o valor de y: ");
		y = leia.nextInt();
		
		x = x % y; // calcula o resto da divisão entre dois números inteiros.
		
		System.out.println(x); // saida de dados do calculo armazenado na variavel x
		
	}

}
