package modulo1.heranca;

public class Cachorro extends Animal {

    public Cachorro(String nome){
        super (nome);
    }

    @Override
    public String fazerSom(){
        return "Latiu";
    }

}
