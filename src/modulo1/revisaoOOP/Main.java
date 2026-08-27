package modulo1.revisaoOOP;


public class Main {
    public static void main(String[] args) {
       
      Caixa caixa = new Caixa();
      Produto produto = new ProdutoImportado("Notebook", 2000.0);
      Produto produto2 = new ProdutoNacional("TV", 5000.0);
        
      
      caixa.finalizarVenda(produto, new PagamentoPix());
      caixa.finalizarVenda(produto2, new PagamentoBoleto());
    }

}
