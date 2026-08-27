package modulo1.revisaogeral;

public class Main {

    public static void main(String[] args) {
        
        /*ConversorTeste conv = new ConversorTeste();

        int resultado = conv.converterParaInteiro("42");

        System.out.println(resultado);

        ValidadorTeste validar =  new ValidadorTeste();

        boolean resultadoVali = validar.estarVazio(null);

        System.out.println(resultadoVali);*/

        Funcionario funcionario1 = new Funcionario("Bruno", 3900);

        double resultadoBonus = funcionario1.bonus();

        System.out.println(resultadoBonus);
        
    }

}
