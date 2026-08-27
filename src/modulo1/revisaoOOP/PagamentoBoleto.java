package modulo1.revisaoOOP;

public class PagamentoBoleto implements FormaPagamento{
    @Override
    public void processarPagamento(double valor){
        System.out.println("Boleto gerado com sucesso! Taxa de R$ 2.00 inclusa. Total: R$"+ (valor+2.00));
    }

}
