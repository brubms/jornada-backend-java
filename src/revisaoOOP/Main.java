package revisaoOOP;

public class Main {
    public static void main(String[] args) {
        /*Conta bruno = new ContaPoupanca("Bruno Martins", 8000.0);
        Conta lai = new ContaCorrente("Laiana Martins", -500);

       boolean resultado =  bruno.sacar(900.0);
        System.out.println(resultado);
        System.out.println("Saldo: " + lai.getSaldo());
        lai.sacar(300);
        System.out.println("Saldo: " + lai.getSaldo()); */

        Produto produto1 = new ProdutoImportado("Celular", 9000.0);
        Produto produto2 = new ProdutoNacional("TV", 4000.0);

        double resultadoImportado = produto1.precoFinal();
        double resultadoNacional = produto2.precoFinal();

        System.out.println("Valor do produto: R$"+ produto1.getPreco() + "|Valor final: R$"+ resultadoImportado);
        System.out.println("Valor do produto: R$"+ produto2.getPreco() + "|Valor final: R$"+ resultadoNacional);
    }

}
