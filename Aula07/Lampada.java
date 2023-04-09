package Aula07;

public class Lampada {
    
		//dados
		int voltagem;
		String cor;
		boolean ligado;
		
		//operações, metodos
		
		void ligar(){
			System.out.println("Lampada ligada");
			if(ligado!=true) ligado = true;
		}
		
		void desligar(){
			System.out.println("Lampada desligada");
			if(ligado!=false) ligado = false;
		}

	public static void main(String[] args) {
		
		//criação do objeto
		
		Lampada lamp1 = new Lampada();
		lamp1.voltagem = 120;
		lamp1.cor = "Amarelo";
		
		lamp1.ligar();
		System.out.println(lamp1.ligado);
		lamp1.desligar();
		System.out.println(lamp1.ligado);
}
}