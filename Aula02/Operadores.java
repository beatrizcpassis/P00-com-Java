package Aula02;

public class Operadores {

	public static void main(String[] args) {
		//incremento
		int x, y, z;
		x = 42;
		y = x++; // y=42 e x=43
		System.out.println(y);
		System.out.println(x);
		
		z = ++x; //z= 44 e x = 44
		System.out.println(z);
		System.out.println(x);
		
		x = ++z + z; // x = 45+45 = 90 
		System.out.println(x);
		
		//decremento
		int a, b, c;
		a = 42;
		b = a--; //b=42 e a=41
		System.out.println(a);
		System.out.println(b);
		
		c = --a; //c=40 e a=40
		System.out.println(c);
		System.out.println(a);
		a = c-- + c; //a=40+39 =79
		System.out.println(a);
		
		//operadores relacionais
		 int d = 15;
		 int e = 12;                                                        
		 System.out.println("d = " + d);
		 System.out.println("e = " + e);
		 System.out.println("d == e -> " + (d == e));
		 System.out.println("d != e -> " + (d != e));
		 System.out.println("d < e -> " + (d < e));
		 System.out.println("d > e -> " + (d > e));
		 System.out.println("d <= e -> " + (d <= e));
		 System.out.println("d >= e -> " + (d >= e));
		 System.out.println("d = e -> " + (d = e));

		 //operadores lógicos
		 System.out.println("True && True = " + (true && true) );
		 System.out.println("True && False = " +(true && false) );
		 System.out.println("True || True = " + (true || true) );
		 System.out.println("True || False = " + (true || false) );
		 System.out.println("Not False = " + (!false) );
		 
		 //operadores bitwise
		 int u = 4;
		 int v = 7;
		 System.out.println(u & v); // imprime 4
		//em um sistema de 32 bits
		// 00000000 00000000 00000000 00000100
		// 00000000 00000000 00000000 00000111
		// ===================================
		// 00000000 00000000 00000000 00000100
		 
		 //operador ternário
		 int num = 2;
		 String resultado = num%2 == 0 ? "Par":"Impar";
		 System.out.println(resultado);
		 
	}

}
