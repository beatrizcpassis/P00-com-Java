package Aula01;

public class TiposVariaveis {
	/*	
	public static final float pi = 3.14153925f; 	//varivável global, lockada com 'final'
	*/
	public static void main(String[] args) {
		// Declarar variável (tipagem)
		String nome;
		//final String naomuda; //'final' locka a variável, virando uma constante.
		int idade;
		float GRAvidade;
		
		// Inicializar a variável
		nome = "Beatriz";
		idade = 23;
		GRAvidade = 9.8071f;	// Necessita f no final do número float
		
		// Função - exemplo de função
		System.out.println(nome);  // atalho => sysout + ctrl+spaço
		System.out.println(GRAvidade + " m/s^2");
		//System.out.println(pi);
		System.out.printf("%s, ou o viajante de %d anos, conseguia correr a %f m/s%nIncrivel, tao rapido que pulou uma linha.", nome,idade,GRAvidade);
		// println(line) = printa tudo  -  printf = printa utilizando auxiliadores %
	}

}