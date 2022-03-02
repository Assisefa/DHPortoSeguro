package PortoSeguro;

public class Automovel {

	// declaração dos atributos da classe automovel
	
	private String nomeProprietario;
	private String modelo;
	private String placa;
	private int ano;
	
	// criação do método especial construtor
	
	public Automovel(String nomeProprietario,String modelo,String placa, int ano) 
	{
		this.nomeProprietario = nomeProprietario;
		this.modelo = modelo;
		this.placa = placa;
		this.ano = ano;
	}
	
	// criação dos metodos da classe

	public String getNomeProprietario() {
		return nomeProprietario;
	}

	public void setNomeProprietario(String nomeProprietario) {
		this.nomeProprietario = nomeProprietario;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public void imprimirinfo() 
	{ 
		System.out.println("O senhor " +nomeProprietario+ ", possui um(a) automóvel " +modelo+
				" com placa "+placa+ " ano "+ano);
	}

	
	
	
}



