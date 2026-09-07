package modulo2;

import java.util.List;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Scanner;

import modulo1.revisaoOOP.FormaPagamento;
import modulo1.revisaoOOP.PagamentoBoleto;
import modulo1.revisaoOOP.PagamentoCartao;
import modulo1.revisaoOOP.PagamentoPix;
import modulo1.revisaoOOP.Produto;
import modulo1.revisaoOOP.ProdutoImportado;
import modulo1.revisaoOOP.ProdutoNacional;

public class Main {

    public static void main(String[] args) {
        // Objeto Caixa para criar um novo objeto do tipo Caixa.
        Caixa caixaLoja = new Caixa();
        // Repositorio para armazenamento e manipulação dos produtos.
        RepositorioMemoria<Produto> repositorio = new RepositorioMemoria<>();
        // Criação de uma Lista, para armazenar todos os produtos que o cliente quer
        // armazenar no carrinho.
        List<Produto> carrinho = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        // definir qual opção o cliente quer seguir!
        int opcao;
        // Loop do menu, que acontece até que o usuário digite a saída: 0
        do {
            System.out.println("=======SISTEMA DA LOJA=========");
            System.out.println("1 - Vendedor");
            System.out.println("2 - Cliente");
            System.out.println("0 - Sair");
            opcao = scan.nextInt();
            // condição para que o menu seja escolhido de acordo com a opção abordada
            if (opcao == 1) {
                // chamando o método menuVendedor, que recebe duas instancias, scan(para entrada
                // de dados e repositorio para manipulação de dados do repositorio)
                menuVendedor(scan, repositorio);
            } else if (opcao == 2) {
                // mesma coisa da opção 1, todavia aqui aumenta as instancias para o método
                // iniciar.
                menuCliente(scan, repositorio, caixaLoja, carrinho);
            } else {
                // caso não seja nem 1 e 2, vai cair aqui nesse mensagem!
                System.out.println("Opção inválida");
            }
            // condição de fechamento do sistema!Acontece até que seja digitado 0!
        } while (opcao != 0);
        System.out.println("Saindo...");
    }

    // método para o menuVendedor, onde vai ser manuseado o cadastro, exclusão e
    // listagem dos produtos.
    private static void menuVendedor(Scanner scan, Repositorio<Produto> repositorio) {
        // variáveis locais para manusear o método.
        int opcao;
        String idDoItem;
        String nomeDoItem;
        double valorDoItem;
        String encerrar = "";
        String excluir = "";

        // loop do menu do vendedor
        do {
            System.out.println("=====SISTEMA VENDEDOR======");
            System.out.println("1 - Cadastrar itens");
            System.out.println("2 - Excluir itens");
            System.out.println("3 - Listar itens");
            System.out.println("0 - Sair");
            // int opcao -> um scanner para entrada
            opcao = scan.nextInt();
            // recebe opcao para selecionar qual opção desejada
            switch (opcao) {
                // cadastro de itens
                case 1:
                    do {

                        System.out.println("Cadastrar itens");
                        System.out.println("----------------------");
                        System.out.println("1 - Nacional");
                        System.out.println("2 - Importado");
                        // seletor de opções do menu 1
                        opcao = scan.nextInt();
                        // try/catch utilizado para verificar o número digitado
                        try {
                            // criador de produtos nacionais
                            if (opcao == 1) {
                                System.out.println("Digite o ID: (Exemplo: P01)");
                                idDoItem = scan.next();
                                System.out.println("Digite o nome do item: ");
                                nomeDoItem = scan.next();
                                System.out.print("Valor: R$");
                                valorDoItem = scan.nextDouble();
                                // condição caso o valor do item seja menor ou igual a zero.
                                if (valorDoItem <= 0) {
                                    // cria uma nova throw do tipo ValorNaoAceitavelException e emite uma mensagem!
                                    throw new ValorNaoAceitavelException("O valor precisa ser maior que zero!");
                                }
                                // dando tudo certo cai aqui e cria um produto nacional
                                ProdutoNacional produtoCriado = new ProdutoNacional(idDoItem, nomeDoItem, valorDoItem);
                                repositorio.salvarItem(idDoItem, produtoCriado);
                                // criador de produtos importados
                            } else if (opcao == 2) {
                                System.out.println("Digite o ID: ");
                                idDoItem = scan.next();
                                System.out.println("Digite o nome do item: ");
                                nomeDoItem = scan.next();
                                System.out.print("Valor: R$");
                                valorDoItem = scan.nextDouble();
                                if (valorDoItem <= 0) {
                                    throw new ValorNaoAceitavelException("O valor precisa ser maior que zero!");
                                }
                                // dando tudo certo cai aqui e cria um produto importado
                                ProdutoImportado produtoCriado = new ProdutoImportado(idDoItem, nomeDoItem,
                                        valorDoItem);
                                repositorio.salvarItem(idDoItem, produtoCriado);
                            } else {
                                System.out.println("Opção inválida!");
                            }
                            // caso o valor não seja aceitavel cai dentro do catch e gera uma mensagem
                            // amigável ao usuário
                        } catch (ValorNaoAceitavelException e) {
                            System.out.println("Aviso do sistema: " + e.getMessage());
                            continue;
                        }
                        // confirmação se ainda existe mais produtos a serem cadastrados
                        System.out.println("Deseja cadastrar mais algum item: (S/N) ");
                        encerrar = scan.next();

                    } while (encerrar.equalsIgnoreCase("S"));
                    System.out.println("Saindo...");

                    break;
                // Excluir itens
                case 2:
                    // loop para excluir itens até que o usuário digite '0' para sair
                    do {

                        System.out.println("Excluir itens");
                        System.out.println("----------------------");
                        System.out.println("Digite o ID do item a ser excluído: ");
                        idDoItem = scan.next();
                        // confirmação se o item existe, caso o item não esteja cadastrado, o usuário
                        // não consegue excluir
                        try {
                            // faz a busca do item e pergunta se realmente deseja excluir o item selecionado
                            System.out.println(repositorio.buscarItem(idDoItem));
                            System.out.println("Item localizado ");
                            System.out.println("Deseja excluir o item realmente? (S/N)");
                            excluir = scan.next();
                            // ao validar que o item foi encontrado, efetua a pergunta e da o comando para
                            // excluir o item
                            if (excluir.equalsIgnoreCase("S")) {
                                // recebe o id para exclusão e executa
                                repositorio.removerItem(idDoItem);
                                // caso não queira excluir pode ser cancelado
                            } else if (excluir.equalsIgnoreCase("N")) {
                                System.out.println("Exclusão cancelada!");
                            }
                            // resposta amigável para caso o item não seja encontrado
                        } catch (ItemNaoLocalizadoException e) {
                            System.out.println("Aviso do sistema: " + e.getMessage());
                        }
                        // valida se existe algo mais a ser excluído no sistema
                        System.out.println("Deseja excluir mais algum item: (S/N) ");
                        encerrar = scan.next();
                        // encerrar apenas se o usuário digitat S
                    } while (encerrar.equalsIgnoreCase("S"));

                    System.out.println("Saindo...");
                    break;
                // Listar itens
                case 3:
                    // lista todos os itens cadastrados no sistema
                    System.out.println("Listar itens");
                    System.out.println(repositorio.listarItens());

                    break;
                // encerramento do sistema do vendedor
                case 0:
                    System.out.println("Saindo...");
                    break;
                // caso seja digitado que o número que não está previsto nas opções
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 0);

    }

    // método para acessar o menu do cliente, onde ele pode ver os itens, adicionar
    // ou remover do carrinho e finalizar a compra.
    private static void menuCliente(Scanner scan, Repositorio<Produto> repositorio, Caixa caixaLoja,
            List<Produto> carrinho) {
        // váriaveis locais para uso do menu
        int opcao;
        String encerrar = "";
        String idDoItem;
        String formaDePagamento = "";
        // loop do sistema do cliente que acontece até que seja digitado '0'
        do {
            System.out.println("=====SISTEMA CLIENTE======");
            System.out.println("1 - Catálogo");
            System.out.println("2 - Adicionar itens no carrinho");
            System.out.println("3 - Remover itens do carrinho");
            System.out.println("4 - Finalizar compra");
            System.out.println("0 - Sair");
            opcao = scan.nextInt();
            // menu de seleção com switch
            switch (opcao) {
                // acessa o catálogo
                case 1:

                    System.out.println("Catálogo");
                    // for que perocore o repositório com o listarItens() e retorna todos os itens
                    // cadastrados pelo vendedor
                    for (Produto produto : repositorio.listarItens()) {
                        // imprime na tela o id do item, nome e o preço final que o cliente vai pagar.
                        System.out.println("ID: " + produto.getId() + " |Produto: " + produto.getNome() + " |Preço: R$"
                                + produto.precoFinal());
                    }
                    break;
                // adicionar itens ao carrinho
                case 2:
                    // loop para adicionar itens até que o cliente feche a compra
                    do {
                        // para ser adicionado o cliente adiciona o id do item
                        System.out.println("Adicionar itens no carrinho");
                        System.out.println("Qual id do item: ");
                        idDoItem = scan.next();
                        // try/catch utilizado para o caso do cliente buscar um id que não está
                        // cadastrado!
                        try {
                            // variável criada para armazenar o id selecionado e passar para o carrinho
                            Produto produtoEscolhido = repositorio.buscarItem(idDoItem);
                            carrinho.add(produtoEscolhido);
                            System.out.println(produtoEscolhido.getNome() + " foi adicionado ao carrinho!");
                            System.out.println(caixaLoja.subtotal(carrinho));
                            // catch para mensagem amigável para o usuário
                        } catch (ItemNaoLocalizadoException e) {
                            System.out.println("Aviso do sistema: " + e.getMessage());
                        }
                        // validação para cadastro de mais itens ao carrinho
                        System.out.println("Deseja colocar mais itens no carrinho: (S/N) ");
                        encerrar = scan.next();
                    } while (encerrar.equalsIgnoreCase("S"));

                    break;
                // Remover itens do carrinho
                case 3:
                    // loop para remoção de itens
                    do {
                        System.out.println("Remover itens no carrinho");
                        System.out.println("Qual id do item: ");
                        idDoItem = scan.next();
                        // verficação se o item a ser escolhido está na lista!
                        try {
                            // variável para armazenar o idDoItem para ser recibido no .remove
                            Produto produtoEscolhido = repositorio.buscarItem(idDoItem);
                            carrinho.remove(produtoEscolhido);
                            // retorna que o produto foi removido
                            System.out.println(produtoEscolhido.getNome() + " foi removido do carrinho!");
                            // retorna o subtotal
                            System.out.println("Subtotal: R$" + caixaLoja.subtotal(carrinho));
                            // mensagem amigável para o usuário
                        } catch (ItemNaoLocalizadoException e) {
                            System.out.println("Aviso do sistema: " + e.getMessage());
                        }
                        // verificação para prosseguir com mais remoções ou finalizar o processo!
                        System.out.println("Deseja remover mais algum item: (S/N) ");
                        encerrar = scan.next();
                    } while (encerrar.equalsIgnoreCase("S"));

                    break;
                // Fechamento de venda
                case 4:
                    // Define a forma de pagamento através de um switch
                    System.out.println("Finalizar compra");
                    System.out.println("Qual a forma de pagamento:\n 1. PIX\n 2. CARTÃO\n 3. BOLETO)");
                    opcao = scan.nextInt();
                    // PIX, CARTÃO OU BOLETO
                    switch (opcao) {
                        // pagamento com pix
                        case 1:
                            // cria uma forma de pagamento do tipo PagamentoPix
                            FormaPagamento pagamentoPix = new PagamentoPix();
                            // chama o metodo finalizarVenda recebendo o carrinho e o método de pagamento
                            caixaLoja.finalizarVenda(carrinho, pagamentoPix);
                            System.out.println("valor final: R$" + caixaLoja.subtotal(carrinho));
                            System.out.println("Compra finalizada");
                            formaDePagamento = "Pix";
                            break;

                        case 2:
                            // cria uma forma de pagamento do tipo PagamentoCartao
                            FormaPagamento pagamentoCartao = new PagamentoCartao();
                            // chama o metodo finalizarVenda recebendo o carrinho e o método de pagamento
                            caixaLoja.finalizarVenda(carrinho, pagamentoCartao);
                            System.out.println("valor final: " + caixaLoja.subtotal(carrinho));
                            System.out.println("Compra finalizada");
                            formaDePagamento = "Cartão";
                            break;

                        case 3:
                            // cria uma forma de pagamento do tipo PagamentoBoleto
                            FormaPagamento pagamentoBoleto = new PagamentoBoleto();
                            // chama o metodo finalizarVenda recebendo o carrinho e o método de pagamento
                            caixaLoja.finalizarVenda(carrinho, pagamentoBoleto);
                            System.out.println("valor final: " + caixaLoja.subtotal(carrinho));
                            System.out.println("Compra finalizada");
                            formaDePagamento = "Boleto";
                            break;

                        default:
                            System.out.println("Opção inválida");
                            break;
                    }
                    // Pergunta se pode gerar o recibo!
                    System.out.println("Deseja gerar o recibo da compra: (S/N)");
                    encerrar = scan.next();
                    // texto do recibo com id do item, preço e valor de cada com total
                    String textoRecibo = "========= RECIBO DA COMPRA ======\n";
                    for (Produto p : carrinho) {
                        textoRecibo += "[" + p.getId() + "]" + p.getNome() + " - R$ " + p.precoFinal() + "\n Total: R$"
                                + caixaLoja.subtotal(carrinho) + "\n Forma de pagamento: " + formaDePagamento;
                    }
                    //Se a resposta for 's' então o sistema gera um recibo do tipo ReciboArquivo
                    if (encerrar.equalsIgnoreCase("S")) {
                        //criação do objeto Recibo do tipo ReciboArquivo
                        Recibo geraRecibo = new ReciboArquivo();
                        //gera o recibo usando o texto criado acima
                        geraRecibo.gerarRecibo(textoRecibo);
                        //confirmação que foi gerado o arquivo
                        System.out.println("Recibo gerado com sucesso!!");

                    } 
                //limpa o carrinho
                carrinho.clear();
                    
                System.out.println("Compra encerrada! voltando ao menu inicial!");
                        
                break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }

        } while (opcao != 0);

    }

}
