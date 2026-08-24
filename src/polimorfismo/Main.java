package polimorfismo;

public class Main {
    public static void main(String[] args) {
        
        Forma quadrado = new Quadrado(4);
        Forma circulo = new Circulo(3);
        Forma retangulo = new Retangulo(5, 8);

        System.out.println("Quadrado: " + quadrado.calcularArea());
        System.out.println("Circulo: " + circulo.calcularArea());
        System.out.println("Retangulo: " + retangulo.calcularArea());
    }

}
