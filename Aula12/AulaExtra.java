package Aula12;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Arrays;


public class AulaExtra{

	public static void main(String[] args) {
		// Operador ternário
		String ternario = 2==2 ? "true" : "false";
		System.out.println(ternario);
		
		System.out.println(ternario.toUpperCase());
		System.out.println(ternario.toLowerCase());
		System.out.println(ternario.length());
		
		String tERNARIO = "TRUE";
		System.out.println(ternario.equalsIgnoreCase(tERNARIO));
		
		
		/// Oi, [nome]. Hoje é [dia da semana], Bom dia.
		String nome = "Beatriz";
		LocalDate hoje = LocalDate.now();
		Locale brasil = new Locale("pt","BR"); 
		
		//System.out.println(hoje.getDayOfWeek());	// manda o dia da semana em inglês e em fullcaps 
		System.out.println(hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil));	// rege o estilo do texto e a localidade     // necessita de imports
		String diaDaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL_STANDALONE, brasil);
		
		
		String saudacao;
		LocalDateTime agora = LocalDateTime.now();
		if(agora.getHour() >= 0 && agora.getHour() < 12) saudacao = "bom dia";
		else if(agora.getHour() >= 12 && agora.getHour() < 12) saudacao = "boa tarde";
		else saudacao = "boa noite";
		
		System.out.println("Oi, "+nome+". Hoje é "+hoje+", bom dia."); //ou
		System.out.printf("Oi, %s. Hoje é %s, %s.%n", nome, diaDaSemana, saudacao.toLowerCase());
		
		
		///// percorrendo arrays
		String[] arraia = {"a","a","a","a","a"};
		for (int i=0; i<arraia.length;i++) { System.out.println(arraia[i]);		
		}
		//ou
		System.out.println(Arrays.toString(arraia));
		
		
		int[] nums = {1,2,3,4,645,786,3123,5436};
		int maior = nums[0];
		int menor = nums[0];
		int media=0;
		
		for(int k=0; k< nums.length;k++) {
			if(nums[k]>maior) maior = nums[k];
			if(nums[k]<menor) menor = nums[k];
			media += nums[k];
		}
		
		System.out.println(maior);
		System.out.println(menor);
		System.out.println(media/nums.length);

		
		
		/// Chamando função
		String name_original = "Bea";
		saudacao(name_original);
		
		int resultado = soma(2,3);
		System.out.println(resultado);
	}

	
	/// Funções 
	public static void saudacao(String nomeParametro) {
		System.out.println("Hello, "+ nomeParametro);
	}
	
	public static int soma(int a, int b) {
		return a+b;
	}
}
