package Aula13;

public class SobrecargaDeMetodo {
    /*sobregarga de método
 * 
 * assinatura de método: Nela conta o nome do método, os parametros, os tipos dos parametros e
 * as ordens dos parametros. Ex:
 * 					metodo x(string y, int x){};  
 * 					metodo x(int x, string y){};
 * se diferenciam no tipo da variavel, ou seja, é possivel ter n métodos com o mesmo nome, desde que
 * diferenciem no tipo ou ordem dos parametros. A ordem dos parametros faz a diferença. O tipo de
 * retorno não entra na assinatura (void, int,etc)
*/
	//sobrecarga de método
	void comer() {System.out.println("comendo 1 kg");};
	void comer(int x) {System.out.println("comendo"+ x);};
	
	//recursividade: fatorial normal:
	int fatorial(int n) {
		int resultado = 1;
		for(int i = n; i>=1;i--) {
			resultado = resultado*i;
		} 
		return resultado;		
	} 
	
	//uma função recursiva deve ter: algum retorno e se chamar
	
	//fatorial recursivo:
	int fatorialRecursivo(int n) {
		if(n<=1) return 1;
		return n*fatorialRecursivo(n-1);
	}

	public static void main(String[] args) {
	    SobrecargaDeMetodo t1 = new SobrecargaDeMetodo();
		System.out.println(t1.fatorialRecursivo(6));
		

	}
}
