package Aula03;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {

		//Leitura do teclado
		String nome;
		System.out.println("Entre com o nome:");
		Scanner teclado = new Scanner(System.in); //import java.util.Scanner;
		nome = teclado.next(); //le e guarda na string nome
		System.out.println("Boa noite, " + nome); //concatena strings

		int x = teclado.nextInt(); //lê e converte para int
		System.out.println(x);
		String z = teclado.next(); //lê e converte para String
		System.out.println(z);
		teclado.close();

		//Arrays
		String[] nomes = {"Maria", "Ana","José"};
		String nome1 = nomes[1];
		System.out.println(nome1);

		String[] meses = {"Janeiro", "Fevereiro", "Março","Abril","Maio","Junho","Julho","Agosto"};
		for (int j = 0; j < 8; j++) System.out.println(meses[j]);
		//System.out.println(meses[0] + meses[1]+ meses[2]);

		//array vazio
		String[] nomes2 = new String[10];
		nomes2[0]="Maria";

		//percorrendo array
		int[] idades = new int[10];
		for (int i = 0; i < 10; i++) idades[i] = i * 10;
		for (int i = 0; i < 10; i++) System.out.println(idades[i]);

	}
}
