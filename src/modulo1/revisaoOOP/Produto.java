package modulo1.revisaoOOP;

public abstract class Produto implements Tributavel {

    private String nome;
    private double preco;
    

    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public double getPreco(){
        return this.preco;
    }
    public String getNome(){
        return this.nome;
    }

    public double precoFinal(){
        return this.preco + calcularImposto();
    }
    

   @Override
    public String toString(){
        return "Produto: "+getNome() + " | Preço:  R$" + getPreco() + " |Valor do imposto: R$" + calcularImposto() + " |Preço final:  R$" + precoFinal();    }


    
}
