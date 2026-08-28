

package modulo2;
//Sempre que for trabalhar com ArrayList, preciso importar 
import java.util.List;
import java.util.ArrayList;
//importe feito para reutilizar a classe Produto.java aqui dentro de Estoque
import modulo1.revisaoOOP.Produto;


public class Estoque {
    //criação de um atributo privado ArrayList do tipo Produto que armazena produtos!
    private List<Produto> produtos;
    //construtor que inicializa a gaveta para receber os produtos.
    public Estoque(){
        this.produtos = new ArrayList<>();
    }
    //toda vez que for trabalhar com ArrayList ao inicializar o construtor utilizo o this. e os comandos prontos que já existem dentro do ArrayList
    public void adicionarProduto(Produto produto){
        //toda vez que chamar esse método vai ser adicionado um produto dentro do ArrayList
        this.produtos.add(produto);
    }
    public void listarProdutos(){
        //for utilizado para percorrer o ArrayList e verificar todos os produtos cadastrados.
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }
    //.size() para verificar a quantidade total dentro do ArrayList
    public int quantidadeTotal(){
        return this.produtos.size();
    }
    public List<Produto> getProdutos(){
        return this.produtos;
    }

}
