package Aula18;

public class Loja {
    public static void main(String[] args) {
		
		Funcionario g = new Gerente("Rogerio","4948584854",10000);
		Gerente g1 = (Gerente)g; //casting: diz que o objeto funcionario é gerente (usado para implementar metodo que é só do gerente)
		g1.metodoDeGerente(); //metodo só do gerente (podemos chamar tanto g, quanto g1)
		
		Funcionario c = new Caixa("Rodrigo","49485846654",1200);
		
		System.out.println(g.getbonificacao());
		
		ControleDeBonificaoes natalina = new ControleDeBonificaoes();
		natalina.registra(c);
		natalina.registra(g);
		System.out.println("Este ano será pago " + natalina.getTotalDeBonificacoes()+ " em bonificações");
	}

}

///////////////////////////////////////////////////////////////////////////////////////////////////////

abstract class Funcionario {
	
	protected String nome;
	protected String cpf;
	protected double salario;
	
	
	
	public Funcionario(String nome, String cpf, double salario) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
	}


	public abstract double getbonificacao();

}

//////////////////////////////////////////////////////////////////////////////////////////

class Gerente extends Funcionario {

	public Gerente(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getbonificacao() {
		// TODO Auto-generated method stub
		return this.salario*1.5;
		
	}
	
	public void metodoDeGerente() {}

}

///////////////////////////////////////////////////////////////////////////////////////////

class Caixa extends Funcionario{

	public Caixa(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getbonificacao() {
		// TODO Auto-generated method stub
		return this.salario*1.3;
	}

}

///////////////////////////////////////////////////////////////////////////////////////////

class ControleDeBonificaoes {
	
	private double totalDeBonificacoes = 0;
	
	public void registra(Funcionario f) {
		System.out.println("Adicionando bonificação do funcionario:" + f.nome);
		this.totalDeBonificacoes += f.getbonificacao();
	}
	
	public double getTotalDeBonificacoes() {
		return this.totalDeBonificacoes;
	}
}
