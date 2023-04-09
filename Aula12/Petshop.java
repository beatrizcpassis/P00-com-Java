package Aula12;

public class Petshop {
	private String CNPJ;
	private Endereco endereco;
	private Gato[] gatos = new Gato[3]; //sempre bom inicializar com array vazio
	private Cao[] caes = new Cao[3];
	
	
	public Petshop(String CNPJ, Endereco endereco){
		this.CNPJ = CNPJ;
		this.endereco = endereco;
	}
	

	public static void main(String[] args) {
	
		Endereco end = new Endereco("Rua abc",12,"60-70");
		Petshop p1 = new Petshop("8686868",end);
		
		Gato g1 = new Gato("Miau","Siames",6000);
		Gato g2 = new Gato("Miau2","Siames",7000);
		
		g1.compararPeso(g2); // comparar peso do g1 com g2

		g1.alimentar(100); // alimenta g1 com 100 gramas
		System.out.println(g1); // chama o metodo toString()
}
}

class Endereco {
	private String logradouro;
	private int numero;
	private String CEP;
	
	public Endereco(String logradouro, int numero, String CEP){
		this.logradouro = logradouro;
		this.numero = numero;
		this.CEP = CEP;
	}
	
	
}
class Cao {
	//atributos
	private String nome;
	private String raca;
	private int peso; //em grama
	static int numeroCaes;
	
	//contrutor
	public Cao(String nome, String raca, int peso){
		this.nome = nome;
		this.raca = raca;
		this.peso = peso;
		numeroCaes++;
		}
	
	//metodos
	public void alimentar(double qtd) {
		this.peso += qtd;
	}
	
}

class Gato{
	//atributos
	private String nome;
	private String raca;
	private int peso; //em grama
	static int numeroGatos; //variavel comum a todos os objetos
	
	//contrutor
	public Gato(String nome, String raca, int peso){
		this.nome = nome;
		this.raca = raca;
		this.peso = peso;
		numeroGatos++;
	}
	
	//metodos
	public void alimentar(double qtd) {
		this.peso += qtd;
	}
	
	public Gato compararPeso(Gato g) { //compara um gato com outro, metodo já é de um gato, se
										//fosse do petshop precisaria passar dois gatos.
		
		return this.peso>g.peso?this:g; //fazer com if pra praticar
	}

	
	public String toString() {
		return "Gato [nome=" + nome + ", raca=" + raca + ", peso=" + peso + "]";
	}
	
	
	
}
