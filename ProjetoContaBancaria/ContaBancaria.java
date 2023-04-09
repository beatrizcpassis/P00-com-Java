package ProjetoContaBancaria;

class ContaBancaria {

	private final String NUMERO_CONTA; //nunca poderá ser alterado
	private TitularConta titularConta; 
	private double saldo;
	private final double TAXA = 10;
	
	
	//opção 1
	public ContaBancaria(String numeroConta, TitularConta titularConta, double saldo) {
		this.NUMERO_CONTA = numeroConta;
		this.titularConta = titularConta;
		this.saldo = saldo;
	}
	
	public ContaBancaria(String numeroConta, TitularConta titularConta) {
		this.NUMERO_CONTA = numeroConta;
		this.titularConta = titularConta;
		this.saldo = 0;
	}
	
	//opção 2
	static ContaBancaria CriarContaComSaldo(String numeroConta, TitularConta titularConta, double depositoInicial) {
		return new ContaBancaria(numeroConta,titularConta,depositoInicial);
	}
	
	static ContaBancaria CriarContaSemSaldo(String numeroConta, TitularConta titularConta) {
		return new ContaBancaria(numeroConta,titularConta,0);
	}
	
	
	//metodos
	
	public void depositar(double valorDeposito) {
		this.saldo += valorDeposito;
				
	}
	
	public void sacar(double valorSaque) {
		if(this.saldo-valorSaque-TAXA < 0) {
			System.out.println("\nValor indisponivel, verifique seu saldo");
		}else {
			this.saldo -= (valorSaque + TAXA);
			}				
	}

	@Override
	public String toString() {
		return "ContaBancaria [NUMERO_CONTA=" + NUMERO_CONTA + ", titularConta=" + titularConta + ", saldo=" + saldo
				+ "]";
	}
}

////////////////////////////////////////////////////////////////////////////

class TitularConta {

	private String nome; //pode ser alterado
	private String cpf;
	private Endereco endereco;
	public ContaBancaria[] conta = new ContaBancaria[5];
	
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public String getNome() {
		return nome;
	}


	public TitularConta(String nome, String cpf, Endereco endereco) {
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
	}

	/*public void adicionarConta(ContaBancaria conta) {
	this.conta = conta;
}*/

	
	@Override
	public String toString() {
		return "TitularConta [nome=" + nome + ", cpf=" + cpf + ", endereco=" + endereco + "]";
	}
	
	
}



////////////////////////////////////////////////////////////////////////////////

class Endereco {

	private String logradouro;
	private int numero;
	private String cidade;
	private Estado estado;
	private String cep;
	
	public Endereco(String logradouro, int numero, String cidade, Estado estado, String cep) {
		super();
		this.logradouro = logradouro;
		this.numero = numero;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
	}

	@Override
	public String toString() {
		return "Endereco [logradouro=" + logradouro + ", numero=" + numero + ", cidade=" + cidade + ", estado=" + estado
				+ ", cep=" + cep + "]";
	}

}


/////////////////////////////////////////////////////////////////////////
 //pode ser colocado na pagina da classe endereco (fora dela)

enum Estado {
	
	CE, PI, MA;
		 		 
}
