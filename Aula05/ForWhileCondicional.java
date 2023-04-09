package Aula05;

import java.util.Scanner;

public class ForWhileCondicional {

	public static void main(String[] args) {
	
		Scanner teclado = new Scanner(System.in); 
		String repetir;
		String continuar = "S";
		
		//repetindo o código:
		do {
	
		//ano bissexto
		System.out.println("Digite um ano limite:");
		int anoRecebido = teclado.nextInt(); // Recebe o ano limite 
		System.out.println("Digite um ano de inicio:");
		int anoInicio = teclado.nextInt(); 
		
		while(anoInicio > anoRecebido) 
			{
			System.out.println("Digite um ano de inicio valido:");
			anoInicio = teclado.nextInt(); 
			}
		if(anoInicio < anoRecebido)
			{
			for(int anoAtual = anoInicio;anoAtual<=anoRecebido;anoAtual++) //contagem dos anos de 2022 até o ano
				{
				if(anoAtual%4==0) System.out.printf("%d: Ano bissexto \n",anoAtual); //verifica se o ano é bissexto
				else System.out.printf("%d: Ano não bissexto \n",anoAtual);
				}
			}
		System.out.println("Digite 'S' se deseja continuar:");
		repetir = teclado.next();
		
		}while(repetir.equals(continuar));
		
		teclado.close();
	}
}