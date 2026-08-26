package revisaoOOP;

public class ProdutoNacional extends Produto {

    public ProdutoNacional(String nome, double preco){
        super(nome, preco);
    }

    @Override
    public double precoFinal(){
        return getPreco()*1.05;
    }

}
