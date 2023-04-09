package Aula10;

public class Postagem {

    String legenda;
    Usuario autor;
        
    
    public static void main(String[] args) {
        Postagem post1 = new Postagem();
        post1.legenda = "Feliz Aniversario";
            
        Postagem post2 = new Postagem();
        post2.legenda = "uhuuul";
            
        Usuario User1 = new Usuario();
        post1.autor = User1; //Informa que o post1 é do objeto user1
        post2.autor = User1; //post2 é do user1
        User1.nome = "Davi";
        User1.postagens[0] = post1;	//informa que o post1 vai estar na posição 0 das postagens daquele usuario
        User1.postagens[1] = post2; //post2 está na posição 2 do user1
            
        System.out.println(User1.postagens[0].legenda + " "+ User1.postagens[1].legenda);
        }
    }
    
    class Usuario{
        String nome;
        Postagem[] postagens = new Postagem[10];
            
    }
