package modulo1.heranca;

public class Gato extends Animal{

    public Gato(String nome){
        super (nome);
    }

    @Override
    public String fazerSom(){
        return "Miou";
    }

}



