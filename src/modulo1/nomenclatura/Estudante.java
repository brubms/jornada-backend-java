package nomenclatura;

public class Estudante {

    private String nome;
    private int idade;
    private double media;

    public boolean estaAprovado(double nota1, double nota2){
        media = (nota1+nota2)/2;

        if(media >=7){
            return true;
        }else{
            return false;
        }
    }

}
