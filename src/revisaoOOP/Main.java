package revisaoOOP;

public class Main {
    public static void main(String[] args) {
       

        Produto produto1 = new ProdutoImportado("Celular", 9000.0);
        Produto produto2 = new ProdutoNacional("TV", 4000.0);

        
        
        System.out.println(produto1);
      System.out.println(produto2);
    }

}
