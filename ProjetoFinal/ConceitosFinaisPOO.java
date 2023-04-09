package ProjetoFinal;

public class ConceitosFinaisPOO {

	public static void main(String[] args) {
		//Variavel : Objeto
		
		
		Arremessavel a1 = new Pedra();
		Arremessavel a2 = new Beisebol();
		Arremessavel a3 = new Futebol();
		
		Bola b1 = new Beisebol();
		Bola b2 = new Futebol();
		
		Pedra p1 = new Pedra();
		
		Beisebol b3 = new Beisebol();
		
		Futebol f1 = new Futebol();
		
	}

}

////////////////////////////////////////////////////////////////////////////////////////////

interface Arremessavel {
	
	public void arremessar();

}

////////////////////////////////////////////////////////////////////////////////////////////

abstract class Bola implements Arremessavel {
	
	public String marca;
	
	public abstract void quicar();

}

//////////////////////////////////////////////////////////////////////////////////////////


class Pedra implements Arremessavel{

	public void arremessar() {
		System.out.println("Capacidade de arremessar uma pedra");
		
	}
	
}

///////////////////////////////////////////////////////////////////////////////////////////

class Beisebol extends Bola{

	public void arremessar() {
		System.out.println("Capacidade de arremessar no beseibol");
		
	}

	public void quicar() {
		System.out.println("Capacidade de quicar no beisebol");
		
	}

}

///////////////////////////////////////////////////////////////////////////////////////////

class Futebol extends Bola{

	public void arremessar() {
		System.out.println("Capacidade de arremessar no futebol");
		
	}

	public void quicar() {
		System.out.println("Capacidade de quicar no futebol");
		
	}

}
