package modulo3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import modulo2.Estoque;
import modulo1.revisaoOOP.ProdutoNacional;
import modulo2.ItemNaoLocalizadoException;


public class EstoqueTest {
    @Test
    void deve_verificar_a_quantidade_de_produtos_cadastrados(){

        Estoque estoque = new Estoque(); 
        ProdutoNacional produto = new ProdutoNacional("P01", "TV", 1000.0);

        estoque.adicionarProduto(produto);

        assertEquals(1,estoque.quantidadeTotal());
    }
    @Test   
    void deve_lancar_excecao_esperada(){

        Estoque estoque = new Estoque();

        

        assertThrows(ItemNaoLocalizadoException.class, ()->estoque.buscarNoCatalogo("P01"));
    }

}
