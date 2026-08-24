public class Gerente extends Funcionario{

    public Gerente(String nome, double salario){
        super(nome, salario);
    }

    @Override
    public double bonus(){
        return getSalario() * 0.20;
    }

}
