package modulo1.revisaoOOP;

public class ProdutoImportado extends Produto{

    public ProdutoImportado(String id, String nome, double preco){
        super(id , nome, preco);
    }

    @Override
    public double calcularImposto(){
        return getPreco()*0.20;
    }
  
}
