package modulo3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import modulo1.revisaoOOP.ProdutoNacional;
import modulo1.revisaoOOP.ProdutoImportado;

public class ProdutoTest {

    @Test 
    void deve_Calcular_Preco_Final_Com_Cinco_Por_Cento_De_Imposto_Para_Produto_Nacional(){
        ProdutoNacional produto = new ProdutoNacional("P01","Livro",1000.0);

        double precoCalculado = produto.precoFinal();

        assertEquals(1050.0,precoCalculado);
    }
   
    @Test 
    void deve_Calcular_Preco_Final_Com_Vinte_Por_Cento_De_Imposto_Para_Produto_Importado(){
        ProdutoImportado produto = new ProdutoImportado("P02", "TV", 1000.0);

        double precoCalculado = produto.precoFinal();

        assertEquals(1200.0,precoCalculado);
    }
}
