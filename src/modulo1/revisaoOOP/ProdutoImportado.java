package modulo1.revisaoOOP;

public class ProdutoImportado extends Produto{

    public ProdutoImportado(String nome, double preco){
        super(nome, preco);
    }

    @Override
    public double calcularImposto(){
        return getPreco()*0.20;
    }
  
}
