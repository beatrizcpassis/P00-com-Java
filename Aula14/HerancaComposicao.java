package Aula14;

public class HerancaComposicao {

//o contrutor não pode ser herdado
//herança: mecanismo de reuso.
//Composição; mecanismo de reuso que reuni 2 objetos 
//sobreescrita de método: quando um método já existe em outra classe e outra classe herda, no entanto, há tbm um 
//metodo nessa outra classe, logo o metodo anterior é sobreescrito.

	public static void main(String[] args) {
		Gato g1 = new Gato("Miau",2);
		
		g1.comer();
		System.out.println(g1);
		
		Cachorro c1 = new Cachorro("Auau",3);
	
		c1.comer();
		System.out.println(c1);
		
		Rabo r1 = new Rabo();
		g1.rabo = r1;
		g1.rabo.abanar();
		
	}

}

class Animal{
	String nome;
	int idade;
	
		
	void comer(){
		System.out.println("Animal comendo");
			
    }

	@Override
	public String toString() {
		return "Animal [nome=" + nome + ", idade=" + idade + "]";
	}

	public Animal(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
			
	}
}
	
class Gato extends Animal{
	Rabo rabo;
		
		
	public Gato(String nome,int idade) {
		super(nome,idade);
		// TODO Auto-generated constructor stub
	}

	void comer(){
		System.out.println("Gato comendo");
			
	}
}
	
class Cachorro extends Animal{
				
	void comer(){
		System.out.println("Cachorro comendo");
			
	}
	
	public Cachorro(String nome,int idade) {
		super(nome,idade);
		// TODO Auto-generated constructor stub
	}
				
}
	
class Rabo{
		
	void abanar() {
		System.out.println("Abanando o rabo");
	}
		
}

