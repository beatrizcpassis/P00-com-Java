package ProjetoContaBancaria;

public class Main {

	public static void main(String[] args) {

		
		//Criando o endereco de 2 usuarios
		Estado e1 = Estado.PI;
		Estado e2 = Estado.CE;
		Endereco End1 = new Endereco("Rua Nogueira Acioli",440,"Fortaleza",e1,"60110-140");
		Endereco End2 = new Endereco("Rua Almeida Campos",430,"Fortaleza",e2,"60110-130");
		
		//Criando 2 titulares
		
		TitularConta t1 = new TitularConta("CJ","056.978.786-98", End1);
		TitularConta t2 = new TitularConta("Maria","056.978.786-90", End2);
		TitularConta t3 = new TitularConta("Ana","056.978.786-90", End2);
		TitularConta t4 = new TitularConta("CJ junior","056.978.786-90", End1);
		
		//Opção 1
		ContaBancaria c1 = new ContaBancaria("99832-x", t1);
		ContaBancaria c2 = new ContaBancaria("78796-x", t2, 1000);
		
		
		
		//Opção 2
		ContaBancaria c3 = ContaBancaria.CriarContaSemSaldo("99832-x", t3);
		ContaBancaria c4 = ContaBancaria.CriarContaComSaldo("78796-x", t4, 1000);
		
		//depositos
		System.out.println("\n Depositos realizados:\n");
		c1.depositar(15000);
		System.out.println(c1);
		c2.depositar(100);
		System.out.println(c2);
		c3.depositar(50);
		System.out.println(c3);
		c4.depositar(10);
		System.out.println(c4);
		
		System.out.println("\n Saques realizados:\n");
		c1.sacar(14000);
		//t1.setNome("Carlos"); //teste mudança do nome
		//t1.getNome(); //botar dentro de um print, caso necessário
		System.out.println(c1);
		c2.sacar(1200);
		System.out.println(c2);
		c3.sacar(50);
		System.out.println(c3);
		c4.sacar(10);
		System.out.println(c4);
		
		
		t1.conta[0] = c1; //adicionando a conta no array de contas do titular
	}

}
