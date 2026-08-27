package modulo1.revisaoOOP;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(String titular, double saldo){
        super(titular, saldo);
    }

    @Override 
    public boolean sacar(double valor){
        if(valor<= getSaldo()){
            double novoSaldo = getSaldo() - valor;
            alterarSaldo(novoSaldo);
            return true;
        }else{
            
            System.out.println("Conta bloqueada");
            return false;
        }
    }

}
