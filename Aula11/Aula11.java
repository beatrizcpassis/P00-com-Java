package Aula11;

public class Aula11 {
    //Para importar tudo de um pacote com classes diferentes, coloca import nome.* no pacote diferente
//static serve para informar que pertence a classe e não a um objeto (variavel global) 
//não precisa estanciar a variavel static 
//estaciar é criar um novo objeto antes de atribuir os valores de cada atributo para ele 
//Ex: Aluno a1 = new Aluno(); -Estanciar
//static: Quando muda o valor de um atributo em um objeto, muda pra todos os objetos também

//Encapsulamento: normalmente todo atributo é privado, já os metodos podem ser publicos
//EX: private String nome;
//criar 2 metodos para cada atributo (get (ler) e set(escrever))
//EX: public String getnome(){return this.nome;} getters
//EX: public void setnome(String nome){this.nome = nome;}; seters

/*Tudo que é vital para classe deve ser passado obrigatoriamente via construtor. 
Se a sua classe depende de um atributo para ter sentido e você não passa o valor desse 
atributo no construtor ela pode ficar em um estado inconsistente. Adicione os métodos 
acessores(os getters and setters) para as propriedades que são mutáveis. Se um estado da 
classe tem valor A, porém amanhã pode ter seu valor alterado para B, você deve 
disponilizar um meio de isso ocorrer e uma das formas é via getters and setters.*/

//visibilidade diz respeito aos modificadores de acesso
//encapsulamento: getters e setters

	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		a1.setnome("José");
		a1.setsobrenome("Silva");
		System.out.println(a1.getnome());
		System.out.println(a1.nomeCompleto());

	}

}

class Aluno {
	
	private String nome;
	private String sobrenome;
	
	//nome
	public String getnome(){ //para mostrar o atributo de um objeto
		return this.nome;
	} 
	public void setnome(String nome) { //para escrever o atributo de um objeto
		this.nome = nome;
	} 
	
	public String getsobrenome(){ //para mostrar o atributo de um objeto
		return this.sobrenome;
	} 
	public void setsobrenome(String sobrenome) { //para escrever o atributo de um objeto
		this.sobrenome = sobrenome;
	} 
	
	public String nomeCompleto() {
		return nome + " " + sobrenome;
	}
}


