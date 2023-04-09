package Aula16;

public class AlimentarPolimorfismo {

    public static void main(String[] args) {
        // criando os memes
        Pessoa p1 = new Pessoa(80.0);
        
        Feijao f1 = new Feijao(0.3);
        Arroz a1 = new Arroz(0.5);
        Sorvete s1 = new Sorvete(0.1);
        
        p1.comer(a1);
        p1.comer(s1);
        p1.comer(f1);
                
        System.out.printf("%.1f",p1.getPeso());
        
    }

}

    class Pessoa{
        double peso;
    
        protected double getPeso() {
            return peso;
        }
        protected void setPeso(double peso) {
            this.peso = peso;
        }
        
        public Pessoa(double peso) {
            super();
            this.peso = peso;
        }
    
    
        /*/// comer 3 tipos de alimentos
        void comer(Feijao f) {this.peso += f.getPeso();}
        void comer(Arroz a) {this.peso += a.getPeso();}
        void comer(Sorvete s) {	this.peso += s.getPeso();}
        Contudo esse código está feio e despendioso, logo será usado herança
        */
        void comer(Comida c) {
            System.out.println("Comendo "+c.getPeso()+"kg");
            this.peso += c.getPeso();
        }
        
    }
    
    
    class Feijao extends Comida{
    //encapsulamento
        //private double peso; desnecessário por conta da herança
        protected Feijao(double peso) {   
            super(peso);	
        }
    
        //setters e getters foram excluídos pois tbm são herdados
    }
    
    class Arroz extends Comida{
        
        protected Arroz(double peso) {
            super(peso);
        }
    }
    
    class Sorvete extends Comida{
        
        protected Sorvete(double peso) {
            super(peso);
            }
    }
    
    class Comida{
        private double peso;
        
        public Comida(double peso) { /// construct
            this.peso = peso;
        }
        protected double getPeso() {
            return peso;
        }
        protected void setPeso(double peso) {
            this.peso = peso;
        }
    }

