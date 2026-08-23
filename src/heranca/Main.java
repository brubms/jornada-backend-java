package heranca;

public class Main {
    public static void main(String[] args) {
        
        Animal dog1 = new Cachorro("Pudim ");
        Animal cat1 = new Gato("Jorge ");
        Animal pato = new Pato("Severino ");

        System.out.println(dog1.getNome() + dog1.fazerSom());
        System.out.println(cat1.getNome() + cat1.fazerSom());
        System.out.println(pato.getNome() + pato.fazerSom());


    }

}
