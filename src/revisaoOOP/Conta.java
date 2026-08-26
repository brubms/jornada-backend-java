package revisaoOOP;

public class Conta {

    private String titular;
    private double saldo;
    
    public Conta(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }

    protected void alterarSaldo(double novoSaldo){
        this.saldo = novoSaldo;
    }

    public boolean sacar(double valor){
        return true;
    }

    public double getSaldo(){
        return this.saldo;
    }

}
