package modulo1.heranca;
public class Funcionario {

    private String nome;
    private double salario;

    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public double bonus(){
        return salario*0.10;
    }

    public double getSalario(){
        return this.salario;
    }

}
