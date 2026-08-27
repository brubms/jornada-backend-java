package revisaoOOP;

public class PagamentoPix implements FormaPagamento{

    public void processarPagamento(double valor){
        System.out.println("Pagamento via PIX aprovado! Valor com 10% de descontos:" + valor*0.9);
    }

}
