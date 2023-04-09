package Aula06;

public class Enum {
    
	public static void main(String[] args) {
		enum Dias
		{
		 DOMINGO,
		 SEGUNDA,
		 TERÇA,
		 QUARTA,
		 QUINTA,
		 SEXTA,
		 SABADO
		}
	
		String teclado = "DOMINGO";
		Dias dia = Dias.valueOf(teclado);
		
		switch(dia) {
		case DOMINGO: 
		case SABADO:
			System.out.println("Dia de festa"); break;
			
		case SEGUNDA: 
		case TERÇA: 
		case QUARTA: 
		case QUINTA: 
		case SEXTA:
			System.out.println("Dia de trabalhar"); break;
		}

		//pegadinha,retorna 9.0 (double)
		int a = 5;
		System.out.println("Valor é: "+ ((a<5)?9.9:9));
		
		//literais de numeros inteiros em notações:
		int x = 0x2A4; //hexadecimal
		int y = 05665; //octal
		int z = 0b1111; //binário
		System.out.println(y); //imprime em decimal
		
	}	
}
