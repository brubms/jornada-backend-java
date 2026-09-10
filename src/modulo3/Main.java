package modulo3;

import java.util.List;
import java.util.function.Predicate;
import java.util.function.Function;

import modulo1.revisaoOOP.Produto;
import modulo1.revisaoOOP.ProdutoNacional;
import modulo1.revisaoOOP.ProdutoImportado;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        
       /*  List<String> instrumentos = List.of("Guitarra", "Baixo", "Bateria", "Teclado" );

        System.out.println("---- método antigo(for-each)");
        for (String instrumento : instrumentos) {
                System.out.println("tocando: " + instrumento);
            
        }
        System.out.println("-----método novo (lambda)");
        instrumentos.forEach(instrumento -> System.out.println("Tocando: " + instrumento));
        System.out.println("-----meu Teste");
        List<String> musicas = List.of("Teu santo nome","Maior que tudo", "Coração igual ao teu");

        musicas.forEach(musica -> System.out.println("Músicas:" + musica));

        FormatadorTexto formatarEmCaixaAlta = texto -> texto.toUpperCase();

        FormatadorTexto comColchetes = texto -> "[" + texto + "]";

        System.out.println("em caixa alta: " + formatarEmCaixaAlta.formatar("teu santo nome"));
        System.out.println("com colchetes: " + comColchetes.formatar("Teu santo nome"));

    

        Predicate<Integer> ehPar = numero -> (numero %2==0);

        System.out.println("É par: " + ehPar.test(3));

        Function<Double, String> transformar = preco -> "R$ " + preco;

        System.out.println("teste: " + transformar.apply(200.0));

        List<Double> precos = List.of(1500.0,450.0,8900.0,120.0,3200.0,800.0);

        List<Double> precosAlto = precos.stream()
        .filter(preco -> preco > 1000.0)
        .toList();

        System.out.println(precosAlto);

        precos.stream()
        .filter(preco -> preco > 1000.0)
        .map(preco -> preco*0.90)
        .map(preco -> "R$" + preco )
        .toList()
        .forEach(System.out::println);
        
        Double precoEncotrado = precos.stream()
            .filter(preco -> preco > 5000.0)
            .findFirst()
            .orElseThrow(()-> new RuntimeException("Nenhum item encontrado"));
        System.out.println("Valor encontrado R$: " + precoEncotrado);

        Double soma = precos.stream()
            .mapToDouble(preco -> preco)
            .sum();
        System.out.println("Soma: R$" + soma);*/

        /* 
        //cria uma lista imutável que não aceita .add() e .remove()
        List<Produto> produtos = List.of(
            new ProdutoNacional("P01", "Iphone", 8000.0),
            new ProdutoImportado("P02", "Kindle", 1000.0),
            new ProdutoNacional("P03", "TV", 2500.0),
            new ProdutoNacional("P04", "Cabo USB", 50.0),
            new ProdutoImportado("P05", "Notebook", 6000.0)
        );

        //cria um fluxo sequencial onde cada produto guardado em memória é passado por eles, lembrando que não vai duplicar a lista
        produtos.stream()
            //instanceof= é uma pergunta no o objeto (p)que nesse caso se refere a produto foi instanciado a partir de ProdutoImportado.
            .filter(p -> p instanceof ProdutoImportado)
            //filtra os valores dos produtos que são maiores que 2 mil
            .filter(p -> p.precoFinal() > 2000.0)
            //imprimi na tela o objeto que passou nos filtros
            .forEach(System.out::println);
        // declarou uma variável chamada faturamento para receber produtos em uma nova esteira, lembrando que está pegando o fator númerico
        Double faturamento = produtos.stream()
            //este mapToDouble descarta todas as informações de produto que não sejam númericas e retorna o precoFinal()
            .mapToDouble(p -> p.precoFinal())
            //soma todos os preços 
            .sum();
        System.out.println("Faturamento: R$" + faturamento);

        //abre uma nova esteira do tipo Optional<Produto> chamada produtoBuscado
        Optional<Produto> produtoBuscado = produtos.stream()
            //filtrar os produtos pelo id e comparar qual deles é igual ao P02
            .filter(p -> p.getId().equals("P02"))
            //para a esteira ao encontrar o elemento procurado
            .findFirst();
        //criar uma variável chamada produtoEncontrado que recebe o produto buscado
        Produto produtoEncontrado = produtoBuscado
            //caso não encontre o produto ele para aqui e emite a mensagem 
            .orElseThrow(() -> new RuntimeException("Produto não encontrado"));
            //caso encotre mostrar na tela o produto encontrado
            System.out.println("Produto encontrado: " + produtoEncontrado.getNome());
        */

            List<Musica> playlist = List.of(
                new Musica("Teu Santo Nome", "Adoradores", 180,500000),
                new Musica("Inabalavel","Daniel",150,200),
                new Musica("Porto Seguro", "CD Jovem", 190, 800),
                new Musica("Vaso de Alasbastro", "Arautos do rei", 200, 600000),
                new Musica("Na casa", "Nova Semente", 140, 800)

        );

        playlist.stream()
            .filter(p -> p.getDuracaoSec() > 180 && p.getReproducao() > 500000)
            .toList()
            .forEach(System.out::println);
        int duracaoTotal = playlist.stream()
            .mapToInt(p -> p.getDuracaoSec())
            .sum();
            System.out.println("Duração total: " + duracaoTotal);

       Optional<Musica> musicaBuscada = playlist.stream()
        .filter(p -> p.getTitulo().equals("Deus de Israel"))
        .findFirst();

    Musica musicaEncontrada = musicaBuscada
        .orElseThrow(()-> new RuntimeException("Música não encontrada"));
        System.out.println("Música encontrada: " + musicaEncontrada);
    }


}
