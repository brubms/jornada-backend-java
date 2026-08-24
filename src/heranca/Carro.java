public class Carro extends Veiculo {

    public Carro(String marca, String modelo){
        super(marca, modelo);
    }

    @Override
    public String ligar(){
        return "Carro ligou";
    }

}
