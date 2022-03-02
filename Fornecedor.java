package PortoSeguro;

public class Fornecedor extends Pessoa {
	
	private double credito;
	private int compras;
	private String aprovacao;
	
	Fornecedor(String nome,String endereco,String cpf,int telefone,int idade,
			double credito,int compras,String imposto)
	{
		super (nome,endereco,cpf,telefone,idade);
		
	}

}
