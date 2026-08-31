package modulo1.nomenclatura;

public class Main {
    public static void main(String[] args) {
        
       

        ContaBancaria conta1 = new ContaBancaria(0,"Bruno",18382);

        conta1.temSaldo();
        conta1.fazerSaque(100);

        System.out.println(conta1.getSaldo());


        conta1.fazerDeposito(500);


        System.out.println(conta1.getSaldo());

        
    

    }

}
