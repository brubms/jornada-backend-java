package modulo1.tipoderetorno.exercicio2;

public class Classificador {

    public String classificarPreco(double preco){

        if(preco > 100){
            return "Caro";
        }else if(preco >50 && preco < 100){
            return "Médio";
        }else{
            return "Barato";
        }

    }

}
