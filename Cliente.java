package PortoSeguro;

public class Cliente extends Pessoa {
	
	private int id;
	private int score;
	
	
	public Cliente(String nome,String endereco,String cpf,int telefone,int idade,int id,int score)
	{
		super(nome,endereco,cpf,telefone,idade);
		this.id = id;
		this.score = score;
					
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

		
	public void imprimirInfo()
	{
		System.out.println("\n Nome do cliente: "+getNome()+"\n Cpf: "+getCpf()+"\n Idade: "+getIdade()+"\n Telefone: "+getTelefone()+
				"\n Endereço: "+getEndereco()+"\n ID: "+getId()+ "\n Score: "+getScore());
	}
	
	public void validarCondição() 
	{
		if(score >100 ) 
		{
			System.out.println("\nPagamento parcelado até 24x: ");
		}
		else if (score >= 70 && score <=100) 
		{
			System.out.println("\nPagamento parcelado até 12x: ");
		}
		else if (score >= 30 && score < 70) 
		{
			System.out.println("\nPagamento parcelado até 6x: ");
		}
		else
		{
			System.out.println("\nPagamento à vista!");
		}
		
			
		}
		
	}
	
	
