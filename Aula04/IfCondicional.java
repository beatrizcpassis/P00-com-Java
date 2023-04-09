package Aula04;

import java.util.Scanner;

public class IfCondicional {

	public static void main(String[] args) {
	
		//comando if
		int idade = 17;
		Scanner teclado = new Scanner(System.in); 
		System.out.println("Digite sua idade:");
		idade = teclado.nextInt();
		if(idade>17) System.out.println("De maior");
		if(idade<18) System.out.println("De menor");
		
		//Imprimir numeros impares ou pares
		//for(int i=0; i<21;i+=2)  System.out.println(i); //imprimi numeros pares de 0 a 20
		//for(int i=100; i>0;i-=3)  System.out.println(i); //ordem decrescente
		
		//ano bissexto
		System.out.println("Digite um ano limite:");
		int anoRecebido = teclado.nextInt(); // Recebe o ano limite 
		System.out.println("Digite um ano de inicio:");
		for(int anoAtual = teclado.nextInt();anoAtual<=anoRecebido;anoAtual++) //contagem dos anos de 2022 até o ano
		{
			if(anoAtual%4==0) System.out.printf("%d: Ano bissexto \n",anoAtual); //verifica se o ano é bissexto
			else System.out.printf("%d: Ano não bissexto \n",anoAtual);
		}
		
		teclado.close();
	}

}