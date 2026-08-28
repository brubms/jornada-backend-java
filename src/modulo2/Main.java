package modulo2;

import modulo1.revisaoOOP.FormaPagamento;
import modulo1.revisaoOOP.PagamentoPix;
import modulo1.revisaoOOP.ProdutoImportado;
import modulo1.revisaoOOP.ProdutoNacional;

public class Main {

    public static void main(String[] args) {
        
        Estoque estoque = new Estoque();
        Caixa caixa = new Caixa();

        estoque.adicionarProduto(new ProdutoImportado("TV", 8000.0) );
        estoque.adicionarProduto(new ProdutoNacional("NoteBook", 3000.0) );
        estoque.adicionarProduto(new ProdutoImportado("Iphone 16",4000.0));
        System.out.println("-------------------");
        estoque.listarProdutos();
        System.out.println("-------------------");
        System.out.println(estoque.quantidadeTotal());
        System.out.println("-------------------");
        caixa.finalizarVenda(estoque.getProdutos(), new PagamentoPix());
    }   

}
