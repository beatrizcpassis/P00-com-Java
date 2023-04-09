package Aula08;

public class ConstrutorLamp {
    //dados = ligada(S/N), Potência, Voltagem, cor, etc...
	//operações(métodos) = ligar e desligar
	
	//////////////		Dados (Atributos)		////////////////

			String cor;
			String brilho;
			double voltage;
			double potencia;
			boolean ligado;
			short cor_R,cor_G,cor_B;

	//// Criando um Construtor do objeto
	// recebe o nome da classe, não retorna nada
	// configura os atributos e parâmetros que um objeto receberia
	// facilita a config de novos objetos
	ConstrutorLamp(String cor, String brilho, double voltage, double potencia){
		this.cor = cor;  		/// o this. evita dúvida do computador de qual variável alterar.
		this.brilho = brilho; 	// assim o this.variável se refere ao atributo, que recebe como valor a variável local do construtor.
		this.voltage = voltage;
		this.potencia = potencia;
	}
	// é possível ter mais de 1 construtor, com o mesmo nome, e iremos construir mais
	// o que não pode é terem os mesmos tipos de variável, na mesma ordem. 
	ConstrutorLamp(String cor,double voltage){
		this.cor = cor;  	
		this.voltage = voltage;
	}
	
	//////////////		METHODS      ////////////////
			
	/// liga/desliga
	void ligar(){
		System.out.println("Lampada ligada");
		if(ligado=false)ligado = true;}
	void desligar(){
		System.out.println("Lampada desligada");
		if(ligado=true)ligado = false;}
	
	/// intensidade de brilho
	void mudar_brilho(String x) {
		brilho = x;
		//voltagem hipotética de cada intervalo de intensidade
	
		switch(brilho) {
		case "alto":
			voltage = 50.0;
			System.out.println("brilho alto");
			break;
		
		case "medio":
			voltage = 40.0;
		System.out.println("brilho medio");
			break;
		
		case "baixo":
			voltage=30.0;
			System.out.println("brilho baixo");
			break;			
		}
		
	}
	/// Cores	
	// em método único
	void muda_cor(String x) {
		cor = x;
		switch(cor) {
		case "vermelho":
			cor_R = 255;cor_G = 0;cor_B = 0;
			break;
		case "amarelo":
			cor_R = 255;cor_G = 255;cor_B = 0;
			break;
		case "verde":
			cor_R = 0;cor_G = 255;cor_B = 0;
			break;
		case "azul":
			cor_R = 0;cor_G = 0;cor_B = 255;
			break;
		case "violeta":
			cor_R = 159;cor_G = 95;cor_B = 159;
			break;
		case "branco":
		default:
			cor_R = 255;cor_G = 255;cor_B = 255;	
		}
	}
	
	
	////////	MÉTODO MAIN	 	//////
	public static void main(String[] args) {
		int x = 0 ;   /// compare com a criação de um objeto
		
		////////////   	Instancia / Objeto 		//////////////
		ConstrutorLamp lamp1 = new ConstrutorLamp("azul", "alto",220, 40);
		lamp1.ligado = false;   // por padrão já é false (padrão boolean)
		//lamp1.cor = "azul";
		//lamp1.brilho = "alto"
		//lamp1.voltage= 220;
		//lamp1.potencia= 40;
		
		System.out.println();
		
		/* antiga forma de criar instancias, sem construtor
		Lamp lamp2 = new Lamp();
		lamp2.cor = "azul";
		lamp2.potencia=40;
		lamp2.voltage=220;*/

		///em javascript objetos são declarados :  Lamp lamp3 = {ligado = true, cor="azul", voltage=220}
		

		while(x<10) {
			x++;
			lamp1.ligar();
			lamp1.desligar();		
		}
		
		System.out.println("Queimou");
	
	}

}

