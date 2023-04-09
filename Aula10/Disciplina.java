package Aula10;

public class Disciplina {
    
//Relacionamento entre classes
                            
	String nomeDisciplina;
	Professor P;
	
public static void main(String[] args) {
		Disciplina d1 = new Disciplina();
		d1.nomeDisciplina = "POO";
		Professor p1 = new Professor();
		p1.nomeProfessor = "Cesar";
		d1.P = p1; //Aloca o objeto professor p1 à disciplina 
		p1.disciplinas[0]= d1; //Aloca a disciplina da posição 0 ao professor p1

	}
}

class Professor{
	String nomeProfessor;
	Disciplina[] disciplinas = new Disciplina[10];
}
