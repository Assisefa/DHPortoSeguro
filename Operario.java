package PortoSeguro;

public class Operario extends Pessoa{
	
	private double valorProducao;
	private double comissao;
	
	public Operario (String nome,String endereco,String cpf,int telefone,int idade,double valorProducao,double comissao)
	{
		super(nome,endereco,cpf,telefone,idade);
		this.valorProducao = valorProducao;
		this.comissao = comissao;
		
		
	}

	public double getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	public void imprimirInfo()
	{
		System.out.println("\n Nome do operário: "+getNome()+ "\n Cpf: "+getCpf()+
				"\n Idade: "+getIdade()+ "\n Telefone: "+getTelefone()+"\n Endereço: "+getEndereco()
				+ "\n valor monetário dos artigos produzidos: "+valorProducao+
				"\n Porcentagem (sem %) da comissao deste artigo: "+comissao);
		}
			public void calcularProducao()
			{
				double valorTotal = valorProducao + (valorProducao*(comissao/100));
				System.out.println("\n O valor total a ser recebido pelo operário:  "+getNome()+
						" será de: "+valorTotal);
			}
			
}