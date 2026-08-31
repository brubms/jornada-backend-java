package modulo1.heranca;

public class Animal {

    private String nome;
    
    public Animal(String nome){
        this.nome = nome;
    }
    public String fazerSom(){
        return "Defina o som ";
    }

    public String getNome(){
        return nome;
    }
}
