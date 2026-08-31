package modulo2;

import java.lang.reflect.TypeVariable;

import modulo1.revisaoOOP.FormaPagamento;
import modulo1.revisaoOOP.PagamentoPix;
import modulo1.revisaoOOP.ProdutoImportado;
import modulo1.revisaoOOP.ProdutoNacional;

public class Main {

    public static void main(String[] args) {
        
        Estoque estoque = new Estoque();
        Caixa caixa = new Caixa();

        
        
        estoque.cadastrarProdutoNoCatalogo("P01", new ProdutoNacional("TV", 2000));
        estoque.cadastrarProdutoNoCatalogo("P02", new ProdutoImportado("Iphone", 7000.0));

        

        System.out.println(estoque.buscarNoCatalogo("P02"));

        estoque.removerDoCatalogo("P02");

        
        System.out.println(estoque.existeNoCatalogo("P02"));
    }   

}
