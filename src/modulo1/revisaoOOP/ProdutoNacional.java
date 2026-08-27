package modulo1.revisaoOOP;

public class ProdutoNacional extends Produto {

    public ProdutoNacional(String nome, double preco){
        super(nome, preco);
    }
    @Override
    public double calcularImposto(){
        return getPreco()*0.05;
    }

    

}
