package modulo2;

import java.lang.reflect.TypeVariable;

import modulo1.revisaoOOP.FormaPagamento;
import modulo1.revisaoOOP.PagamentoPix;
import modulo1.revisaoOOP.Produto;
import modulo1.revisaoOOP.ProdutoImportado;
import modulo1.revisaoOOP.ProdutoNacional;

public class Main {

    public static void main(String[] args) {
        
       
        RepositorioMemoria<Produto> repositorio = new RepositorioMemoria<>();

        repositorio.salvarItem("P01", new ProdutoImportado("TV", 8000.0));
        
        repositorio.salvarItem("P02", new ProdutoNacional("Iphone 16", 9000.0));

        try{
            repositorio.buscarItem("P99");
            System.out.println( "Item localizado ");
        }catch(ItemNaoLocalizadoException e){
            System.out.println("Aviso do sistema: " + e.getMessage());
        }
        

        System.out.println("-------------------");

        System.out.println(repositorio.listarItens());
        System.out.println("-------------------");

        System.out.println(repositorio.totalItens());

        Repositorio<String> repositorioNomes = new RepositorioMemoria<>();

        repositorioNomes.salvarItem("1", "Bruno");
        
        System.out.println(repositorioNomes.listarItens());
    }   

}
