package modulo1.returnexercicio;

public class Verificador {

    public String verificarNumero(int numero){
        if(numero > 0){
            return "Positivo";
        }else if(numero < 0 ){
            return "Negativo";
        }else{
            return "Zero";
        }
    }

}
