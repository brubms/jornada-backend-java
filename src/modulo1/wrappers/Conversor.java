package modulo1.wrappers;

public class Conversor {

    public int converterParaInt(String texto){
        return Integer.parseInt(texto);
    }

    public double converterParaDouble(String texto){
        return Double.parseDouble(texto);
    }

    public String converterParaStringInt(int numero){
        return String.valueOf(numero);
    }
    public String converterParaStringDouble(double numero){
        return String.valueOf(numero);
    }

}
