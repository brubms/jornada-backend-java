package modulo1.tipoderetorno.exercicio3;

public class Main {

    public static void main(String[] args) {
        
        /*MaiorNumero verificar = new MaiorNumero();

        int resultado = verificar.maior(10, 10, 10);

        System.out.println(resultado);*/

        Loja lojinha = new Loja();

      double   resultadoFalse = lojinha.calcularDesconto(100, false);
      double resultadoTrue = lojinha.calcularDesconto(100, true);

      System.out.println("resultado true: " + resultadoTrue);
      System.out.println("resultado false: " + resultadoFalse);


    }

}
