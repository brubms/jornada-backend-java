package revisaoOOP;

public class ContaCorrente extends Conta{

    public ContaCorrente(String titular, double saldo){
        super(titular, saldo);
    }

    @Override
    public boolean sacar(double valor){
        if(getSaldo() - valor  >= -500){
            double novoSaldo = getSaldo() - valor;
            alterarSaldo(novoSaldo);
            return true;
        }else{
            System.out.println("Saldo insuficiente");
            return false;
        }
    }


}
