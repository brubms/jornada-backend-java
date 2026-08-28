package modulo2;

import java.util.List;
import java.util.ArrayList;
import modulo1.revisaoOOP.*;

public class Caixa {
   
    public void finalizarVenda(List<Produto>carrinho, FormaPagamento formaPagamento){
        //variável nasce antes para poder armazenar, se estiver dentro do loop não será uma escolha boa.
        double total = 0;
        for (Produto produto : carrinho) {
             total += produto.precoFinal();
              System.out.println("Total: R$" + total);
             
        }
         System.out.println("Venda: " + carrinho.size() + "itens finalizada. Total: R$" + total);
               formaPagamento.processarPagamento(total);
       
    }

}
