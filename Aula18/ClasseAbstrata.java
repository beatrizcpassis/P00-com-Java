package Aula18;

public class ClasseAbstrata {

/*
 * Metodo abstrato: metodo sem corpo
 * Classe é abstrata: classe que não pode ser instanciada (não existe objeto dessa classe)
 */

 public static void main(String[] args) {
    Animal a = new Cachorro();

}
}

abstract class Animal{
	
	String nome;
	String raca;
	public abstract void comer(); //obriga as classes que herdam a usar esse metodo
}


class Cachorro extends Animal{ //tem que implementar o metodo comer de Animal

	public void comer() {
		// TODO Auto-generated method stub
		
	}
	
}

