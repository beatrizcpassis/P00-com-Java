package Aula15;

public class Polimorfismo {
    /* - classe filha herda atributos e métodos da classe mãe (observar
visibilidade).
   - Ser/um tipo de (herança)
   - Só pode herdar de uma única classe
   - Polimorfismo e herança permite respeitar a Lei de Lehman
   Poliformismo permite usar o conceito de open/close principle
   Poliformismo é o mesmo metodo usando objetos diferentes

*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//referencia nome-da-variavel new objeto()
		
		Animal a1 = new Cachorro("Toto",1); //cachorro é um animal
		a1.comer(); //executa o metodo do objeto (cachorro), no entanto, depende do metodo do animal
		
		a1 = new Mamifero("Mami",1);
		a1.comer(); //mamifero comendo (atribuiu a1 ao objeto mamifero)
		
		a1 = new Animal("Ani",2);
		a1.comer(); //animal comendo (atribuiu a1 ao objeto animal)
		
		Mamifero m1 = new Cachorro("Toto2",2); //cachorro é um mamifero
		m1.mamar(); //nesse caso o cachorro pode comer e mamar (somente o que um mamifero pode fazer)
		a1 = m1; //animal pode receber mamifero, pq mamifero é animal
		
		Cachorro c1 = new Cachorro("Toto3",3);
		c1.latir(); //como é cachorro, pode comer, mamar e latir
		m1 = c1; //mamifero pode receber cachorro, pq cachorro é um mamifero

		
	}
}

class Animal{
	String nome;
	int idade;

	
	public void comer(){
		System.out.println("Animal comendo");
		
		}

	public Animal(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
		
	}
}

class Mamifero extends Animal{
	
	public void comer(){
		System.out.println("Mamifero comendo");
		
	}
	
	public void mamar() {
		System.out.println("Mamifero mamando");
	}

	public Mamifero(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}
	
}

class Cachorro extends Mamifero{
	
	public Cachorro(String nome,int idade) {
		super(nome,idade);
		// TODO Auto-generated constructor stub
	}

	public void comer(){
		System.out.println("Cachorro comendo");
		
	}
	
	public void mamar() {
		System.out.println("Cachorro mamando");
	}
	
	public void latir() {
		System.out.println("Cachorro latindo");
	}
	
}
