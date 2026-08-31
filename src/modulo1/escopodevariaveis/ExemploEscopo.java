package modulo1.escopodevariaveis;

public class ExemploEscopo {

    private int numero = 10;

    public void mostrarNumero(){
        int numeroteste =15;
        System.out.println(numero);
    }

    public void tentarAcessarLocal(){
        System.out.println();
    }

}
