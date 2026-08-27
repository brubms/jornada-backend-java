package heranca;

public class Pato extends Animal {

    public Pato(String nome){
        super (nome);
    }

    @Override
    public String fazerSom(){
        return "Quack";
    }



}
