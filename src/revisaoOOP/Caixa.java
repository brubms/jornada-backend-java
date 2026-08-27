package revisaoOOP;

public class Caixa {

    public void finalizarVenda(Produto produto, FormaPagamento formaPagamento){
        System.out.println("Iniciando venda do produto: " + produto.getNome() + "|Preço final: R$"+ produto.precoFinal());
        formaPagamento.processarPagamento(produto.precoFinal());
    }

}
