package revisaoOOP;

public class ProdutoImportado extends Produto {

    public ProdutoImportado(String nome, double preco){
        super(nome, preco);
    }
    @Override
   public double precoFinal(){
    return getPreco()*1.20;
   }
}
