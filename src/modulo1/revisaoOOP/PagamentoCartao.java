package modulo1.revisaoOOP;

public class PagamentoCartao implements FormaPagamento {
    @Override
    public void processarPagamento(double valor){
        System.out.println("Pagamento via Cartão aprovado! Valor com taxa (5%): R$"+valor*1.05);
    }

}
