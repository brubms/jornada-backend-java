package modulo1.heranca;

public class Main {
    public static void main(String[] args) {
        
        Funcionario funcionario = new Funcionario("João", 5000.0);
        Funcionario gerente = new Gerente("Amilton", 8000.0);
        Funcionario estagiario = new Estagiario("Pedro", 700.0);

        System.out.println("bônus Funcionário: R$" + funcionario.bonus() + " com um salário de R$" + funcionario.getSalario());
        System.out.println("bônus Gerente: R$" + gerente.bonus() + " com um salário de R$" + gerente.getSalario());
        System.out.println("bônus Estagiario: R$" + estagiario.bonus() + " com um salário de R$" + estagiario.getSalario());



    }

}
