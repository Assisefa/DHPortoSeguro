package PortoSeguro;

public class Empregado1 extends Pessoa {
	
	private int codigoSetor;
	private float salarioBase;
	private float imposto;
	
	public Empregado1(String nome,String endereco,String cpf,int telefone,int idade,
			int codigoSetor,float salarioBase,float imposto)
	{
	
			super (nome,endereco,cpf,telefone,idade);
			this.codigoSetor = codigoSetor;
			this.salarioBase = salarioBase;
			this.imposto = imposto;
			
	}

	public int getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public float getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}

	public float getImposto() {
		return imposto;
	}

	public void setImposto(float imposto) {
		this.imposto = imposto;
	}
	
	public void ImprimirInfo()
	{
		System.out.println("\nNome do empregado: "+getNome()+"\nCpf: "+getCpf()+"\nidade: "+getIdade()
		+"\nTelefone: "+getTelefone()+"\nEndere?o: "+getEndereco()+"\nC?digo do Setor: "+codigoSetor+
		"\nSal?rio Base: "+salarioBase+"\nImposto: "+imposto);
}
	public void calcularSalario()
	{
		double salarioLiquido = salarioBase - (salarioBase *(imposto/100));	
		System.out.println("/n O sal?rio total a ser recebido pelo empregado: "+getNome()+" ? igual a : "+salarioLiquido);
	}
}