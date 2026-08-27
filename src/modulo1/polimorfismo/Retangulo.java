package modulo1.polimorfismo;

public class Retangulo extends Forma {

    private double base;
    private double altura;

    public Retangulo( double altura, double base){
        this.altura = altura;
        this.base = base;

    }

    @Override
    public double calcularArea(){
        return base*altura;
    }

}
