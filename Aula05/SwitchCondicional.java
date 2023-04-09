package Aula05;

import java.util.Scanner;

public class SwitchCondicional {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o numero de inicio:");
		int numeroInicio = teclado.nextInt();
		System.out.println("Digite o numero final:");
		int numeroFim = teclado.nextInt();
		
		//Incrementando de um valor x até um y com while
		while(numeroInicio<numeroFim)
		{
			System.out.printf("%d \n",numeroInicio);
			numeroInicio++;
		}
		while(numeroInicio>=numeroFim)
		{
			System.out.printf("%d \n",numeroInicio);
			numeroInicio--;
		}
		
		//Switch aplicação
		System.out.println("Digite a fruta:");
		String fruta = teclado.next().trim().toLowerCase();
		switch(fruta) {
		case "laranja": System.out.println("Laranja custa R$6 Kg"); 
			break;
		case "maçã": case "maça": System.out.println("Maçã custa R$ 7 Kg"); 
			break;
		case "uva": System.out.println("Uva custa R$5 Kg"); 
			break;
		default: System.out.println("Desculpe, mas não temos "+fruta+" no sistema");
		}
		
		//array / for especial foreach
		String[] nomes = {"Maria","zé","Pedro"};
		for(String x:nomes) System.out.println(x);

		teclado.close();
	}

}