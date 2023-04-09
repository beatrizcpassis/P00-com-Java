package ProjetoFinal;

import java.util.ArrayList;
import java.util.List;

public class CalcularDimensoes {
    
	public static void main(String[] args) {
		
		Forma r = new Retangulo(4, 3, 2); //numero de lados / altura / largura
		Retangulo r1 = (Retangulo)r; //casting (pois forma não tem redimensionavel, mas retangulo sim)
		r1.getArea(); //calcula a area do retangulo
		r1.getPerimetro(); //calcula o perimetro do retangulo
		r1.redimensionar(2); //redimensiona 
		
		Forma r2 = new Retangulo(4,4,2);
		Forma t1 = new Triangulo(3,5,3);
		
		List<Forma> formas = new ArrayList<>();
		formas.add(r);
		formas.add(r2);
		formas.add(t1);
		
		System.out.printf("\nPercorrendo o ArrayList\n");
		
	   for (int i=0; i<formas.size(); i++) {
	    	
	    	Forma formaObservada = formas.get(i);
	    	System.out.println("\nForma " + i);
	    	System.out.println(formaObservada);
	    	
	    	if(formaObservada.getNumLados() % 2 == 0) //o que diferencia as formas é o num de lados 
	    	{								//formas redimensionaveis são as que possuem lados pares
	    	Retangulo retangulo = (Retangulo)formaObservada;
	    	retangulo.redimensionar(0.5);
	    	}
	    }
	}

}
//////////////////////////////////////////////////////////////////////////////////////

abstract class Forma {
	
	private int numLados;

	public Forma(int numLados) {
		super();
		this.numLados = numLados;
	}

	public int getNumLados() {
		return numLados;
	}

	public void setNumLados(int numLados) {
		this.numLados = numLados;
	}
	
	public abstract void getArea();
	public abstract void getPerimetro();

}

///////////////////////////////////////////////////////////////////////////////////////


class Retangulo extends Forma implements Redimensionavel{
	
	private double altura,largura;

	public Retangulo(int numLados, double altura, double largura) {
		super(numLados);
		this.altura = altura;
		this.largura = largura;
	}


	public void getArea() {
		
		double area = altura*largura;
		System.out.println("A area do retangulo:" + area);
		
	}

	public void getPerimetro() {
		
		double perimetro = 2*(altura+largura);
		System.out.println("O perimetro do retangulo:" + perimetro);
	}

	public void redimensionar(double x) {
		
		double novaArea = (altura*x) * (largura*x);
		double novoPerimetro = 2*x*(altura+largura);
		System.out.println("A nova area:"+ novaArea);
		System.out.println("O novo perimetro:" + novoPerimetro);
		

	}


	@Override
	public String toString() {
		return "Retangulo [altura=" + altura + ", largura=" + largura + " Area =" + altura*largura +" Perimetro = " + 2*(altura+largura) + " ]";
	}

}

//////////////////////////////////////////////////////////////////////////////////

class Triangulo extends Forma { //considerando triangulo isosceles (que tem dois lados iguais)
	
	private double altura,base;


	public Triangulo(int numLados, double altura, double base) {
		super(numLados);
		this.altura = altura;
		this.base = base;
	}


	public void getArea() {
		
		System.out.println("A area do triangulo é:" + (altura*base)/2);
		
	}

	public void getPerimetro() {
		
		double cateto = Math.sqrt(Math.pow((base/2),2)+ Math.pow(altura, 2));
		
		System.out.println("O perimetro do triangulo é:" + ((2*cateto) + base));
		
	}


	@Override
	public String toString() {
		return "Triangulo [altura=" + altura + ", base=" + base + ", Area= " + (altura*base)/2 + ", Perimetro= " + ((2*Math.sqrt(Math.pow((base/2),2)+ Math.pow(altura, 2)))+base) + "]";
	}	

}

///////////////////////////////////////////////////////////////////////////////

interface Redimensionavel {
	
	public abstract void redimensionar(double x);

}
