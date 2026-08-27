package modulo1.tipoderetorno.exercicio1;


public class Main {

    public static void main(String[] args) {
        
        Calculadora calc = new Calculadora();
        Calculadora calc2 = new Calculadora();
        // colocar tudo no mesmo!!
        int resultadoDobro = calc2.dobro(7);
        int resultadoSoma  = calc.somar(1,2);

        System.out.println(resultadoDobro);
    }

}
