package Aula09;

public class LampModificadoresDeAcesso {
    
	/*modificadores de acesso: private - package - protected - public 
		normalmente os dados/atributos são private e os metódos public
		Private - Acesso apenas a classe 
		package - Acesso entre classes diferentes no mesmo pacote - default
		Protected - Acesso entre classes diferentes e em pacotes diferentes (desde de que herde isso - subclasses)
		Public - Acesso a todos
		API - Conjunto de metodos publicos
		
		Para gerar um contrutor automático basta clicar com o botão direito "source" depois "generate constructor 
		using field..." e pronto */
	
		//dados
	
		double voltagem;
		String cor;
		boolean ligado;
		double potencia;
		
		//contrutor de objeto sem valores (valores são passados no main)
		
		LampModificadoresDeAcesso(String cor, double voltagem, double potencia,boolean ligado){
			this.cor = cor;  		/// o this. evita dúvida do computador de qual variável alterar.
			this.voltagem = voltagem;
			this.potencia = potencia;
			this.ligado = ligado;
		}
		
		//construtor de objeto atribuindo valores (outra opção - default)
		
		LampModificadoresDeAcesso(){
			super();
		}
		
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
		LampModificadoresDeAcesso lamp1 = new LampModificadoresDeAcesso("azul",220, 40, true); // opção 1
		
		LampModificadoresDeAcesso lamp2 = new LampModificadoresDeAcesso(); //opção 2 
		lamp2.cor = "Azul";
		lamp2.voltagem = 220;
		lamp2.potencia = 50;
		
		
}
}
