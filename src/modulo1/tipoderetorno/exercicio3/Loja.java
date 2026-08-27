package modulo1.tipoderetorno.exercicio3;

public class Loja {
    
    public double calcularDesconto(double preco, boolean clienteVip){
        if(clienteVip)
            return preco*0.9;
        
        else
            return preco*0.95;
        
            
    }
        
}
