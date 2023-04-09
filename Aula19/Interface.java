//interface: a classe tem todos os metodos abstratos

package Aula19;

public class Interface {

	public static void main(String[] args) {
		
		Animal[] animais = new Animal[3];
		//List<Animal> animais = new ArrayList<>();
		
		Animal a1 = new Gato();
		Animal a2 = new Cachorro();
		Animal a3 = new Gato();
		Mamifero m1 = new Gato();
		Mamifero m2 = new Cachorro();
		
		for(Animal a : animais) {
			if(a != null) {
				a.comer();
				a.dormir();
			}
		}	
	}
}

//////////////////////////////////////////////////////////////////////////////////////////

//não é class, é interface
//com a interface é possivel ter herança multipla
//tammbém é possivel herdar e implementar: class Cachorro extends Animal implement Mamifero {} (sendo Animal uma class)
//a interface pode herdar de uma interface: public interface Mamifero extends Animal{} (sendo Animal outra interface)
//extends é só uma vez, se precisar usar novamente é o implements

interface Animal {

	void comer();
	void dormir();
}

///////////////////////////////////////////////////////////////////////////////////////////

interface Mamifero extends Animal { //interface mamifero herda da interface Animal

	public void mamar();
}

///////////////////////////////////////////////////////////////////////////////////////////

class Cachorro implements Animal, Mamifero {

	public void comer() {
		System.out.println("Cachorro comendo");		
		
	}

	public void dormir() {
		System.out.println("Cachorro dormindo");
		
	}

	public void mamar() {
		System.out.println("Cachorro mamando");
		
	}

}

////////////////////////////////////////////////////////////////////////////////////////////


class Gato implements Animal, Mamifero{ //não é herdando, é implementando

	
	public void comer() {
		System.out.println("Gato comendo");
		
	}

	
	public void dormir() {
		System.out.println("Gato dormindo");
		
	}

	public void mamar() {
		System.out.println("Gato Mamando");
		
	}

}
