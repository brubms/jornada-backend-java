package modulo1.revisaoOOP;

public class PagamentoPix implements FormaPagamento{
    @Override
    public void processarPagamento(double valor){
        System.out.println("Pagamento via PIX aprovado! Valor com 10% de descontos:" + valor*0.9);
    }

}
