package modulo1.wrappers;

public class Main {
    public static void main(String[] args) {
        Conversor conv =  new Conversor();

        int resultado = conv.converterParaInt("123");
        double resultado2 =  conv.converterParaDouble("45.67");

        System.out.println(resultado);
        System.out.println(resultado2);
        
        System.out.println("-------------------");

        String texto1 =  conv.converterParaStringDouble(10.7);
        String texto2 = conv.converterParaStringInt(15);
        System.out.println("Inteiro convertido: " + texto2);
        System.out.println("Doble convertido: " + texto1);
        System.out.println("Resultado: " + texto1 + " e " + texto2 );
    }
}
