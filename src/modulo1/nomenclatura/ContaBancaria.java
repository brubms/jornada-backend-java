package nomenclatura;

public class ContaBancaria {

    private int numeroConta;
    private double saldo;
    private String nomeCliente;

    public ContaBancaria(double saldo, String nomeCliente, int numeroConta){
        this.saldo = saldo;
        this.nomeCliente = nomeCliente;
        this.numeroConta = numeroConta;
    }

    public void fazerSaque(double valor){
        if(valor > 0 && valor <= saldo ){
            saldo -= valor;
        }
    }
    public void fazerDeposito(double valor){
        saldo += valor;
    }
    public boolean temSaldo(){
        if(saldo > 0){
            return true;
        }else{
            return false;
        }
    }

    public double getSaldo(){
        return this.saldo;
    }
    public String getNomeCliente(){
        return this.nomeCliente;
    }
    public int getNumeroConta(){
        return this.numeroConta;
    }


    

}
