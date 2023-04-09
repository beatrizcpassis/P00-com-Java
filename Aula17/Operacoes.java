package Aula17;

public class Operacoes {
	public static void main(String[] args) {
		
		Endereco ende= new Endereco("Rua abc",10,"60.123-123");
		Petshop peto1= new Petshop("cnpj",ende);
		Estoque estoque = new Estoque(100000, 100000, 100000, 100000, 100000);
	
		Gato g1 = new Gato("papua","laranja",3000);
		Gato g2 = new Gato("Nova Guine","preto",6000);
		g1.compararPeso(g2);
		System.out.println(g1); // chama automaticamente o método toString criado
		
		g1.alimentar(100);
		System.out.println(g1);
		
		Cao cao1 = new Cao("Limaozin","Shiba",1500);
		System.out.println(cao1);
		cao1.alimentar(100);
		System.out.println(cao1.getPeso()+"g");
		
		peto1.animais[0] = g1;
		peto1.animais[1] = g2;
		peto1.animais[2] = cao1;
		/// depois fazer loop de adição de memes
		System.out.println(estoque.getRacaoGeral());
		peto1.alimentarAnimais(100, estoque);		/// chama método alimentar
	
		System.out.println(estoque.getRacaoGeral());
	}

}


class Petshop{
	private String cnpj;
	private Endereco endereco;
	private Cao[] caes = new Cao[10];
	private Gato[] gatos = new Gato[10];;
	
	Petshop(String cnpj, Endereco endereco){
		//this.animais = animais;
		this.cnpj = cnpj;
		this.endereco= endereco;
		}

	
	public Animal[] animais = new Animal[3];   /// array com a quantidade de animais q o petshop suporta
	
	public void alimentarAnimais(int racao,Estoque estoque){
		///// loop para alimentar animais
		// foreach (ctrl+spaco)
		for (Animal animal : animais) { //// a variavel animal é traduzido para objeto que ele representa
			animal.peso +=racao;
			estoque.usarRacao(racao);
		}
		System.out.println("Animais comendo "+racao+"g da racao geral.");
	}
}

class Endereco{
	private String lougradouro;
	private int numero;
	private String cep;
	
	Endereco(String lougradouro,int numero,String cep){
		this.cep = cep;
		this.lougradouro=lougradouro;
		this.numero = numero;
	}
	
	private int numDeObjetos;
}

class Estoque {
	private int racaoGeral;
	private int racaoCarne;
	private int racaoGraos;
	private int racaoDeCao;
	private int racaoDeGato;
	
	public Estoque(int racaoGeral, int racaoCarne, int racaoGraos, int racaoDeCao, int racaoDeGato) {
		super();
		this.racaoGeral = racaoGeral;
		this.racaoCarne = racaoCarne;
		this.racaoGraos = racaoGraos;
		this.racaoDeCao = racaoDeCao;
		this.racaoDeGato = racaoDeGato;
	}
	
	
	public void usarRacao(int janta) {
		this.racaoGeral -= janta;
	}

	
	public int getRacaoGeral() {
		return racaoGeral;
	}
	protected void setRacaoGeral(int racaoGeral) {
		this.racaoGeral = racaoGeral;
	}
	public int getRacaoDeGato() {
		return racaoDeGato;
	}
	public void setRacaoDeGato(int racaoDeGato) {
		this.racaoDeGato = racaoDeGato;
	}
	protected int getRacaoDeCao() {
		return racaoDeCao;
	}
	protected void setRacaoDeCao(int racaoDeCao) {
		this.racaoDeCao = racaoDeCao;
	}
	protected int getRacaoCarne() {
		return racaoCarne;
	}
	protected void setRacaoCarne(int racaoCarne) {
		this.racaoCarne = racaoCarne;
	}
	protected int getRacaoGraos() {
		return racaoGraos;
	}
	protected void setRacaoGraos(int racaoGraos) {
		this.racaoGraos = racaoGraos;
	}
	
}

class Animal {
	protected String nome;
	protected String raca;
	protected int peso;
	
	
	
	public Animal(String nome, String raca, int peso) {
		super();
		this.nome = nome;
		this.raca = raca;
		this.peso = peso;
	}

	public void alimentar(int qtd){
		System.out.println("Animal comendo "+qtd+"g de racao.");
		this.peso += qtd;
		//// chamar metodo de tirar racao do estoque
	}
	
	public void autoAlimentar(){
		this.peso += 500;
		System.out.println("Animal comendo 500g de racao.");
		///usarRacao(qtd);    ainda não sei usar
	}
	
	public Animal compararPeso(Animal bicho) { /// método já pertence a um objeto, então entra apenas mais um gato p/ comparação
		System.out.println(this.peso > bicho.peso ? this.nome:bicho.nome);
		return this.peso > bicho.peso ? this:bicho ; // fazer com if pra treinar
	}

	@Override
	public String toString() {
		return "Animal [nome= " + nome + ", raca= " + raca + ", peso= " + peso + "g]";
	}
	
	///// getters e setters
	protected String getNome() {
		return nome;
	}
	protected void setNome(String nome) {
		this.nome = nome;
	}
	protected String getRaca() {
		return raca;
	}
	protected void setRaca(String raca) {
		this.raca = raca;
	}
	protected int getPeso() {
		return peso;
	}
	protected void setPeso(int peso) {
		this.peso = peso;
	}
	
}

class Cao extends Animal{
	private static int numCao=0;
	public Cao(String nome, String raca, int peso) {
		super(nome, raca, peso);
				
		this.numCao++;
	}
	
	public String toString() {
		return "Cachorro [nome= " + nome + ", raca= " + raca + ", peso= " + peso + "g]";
	}
}

class Gato extends Animal{
	private static int numGato=0;
	public Gato(String nome, String raca, int peso) {
		super(nome, raca, peso);
				
		this.numGato++;
	}

	public String toString() {
		return "Gato [nome= " + nome + ", raca= " + raca + ", peso= " + peso + "g]";
	}
}
