# Jornada Backend Java

Repositório dedicado à evolução prática em Java para desenvolvimento Backend, cobrindo desde lógica e Orientação a Objetos até APIs REST com Spring Boot e Bancos de Dados.

---

## Trilha de Aprendizado

- [x] **Módulo 1: Fundamentos da Linguagem e POO Essencial**
- [x] **Módulo 2: Java Collections Framework, Generics & Exceptions**
- [ ] **Módulo 3: Java Moderno (Streams API, Lambdas, Optional) & Testes Unitários (JUnit 5)**
- [ ] **Módulo 4: Persistência de Dados, SQL & JPA / Hibernate**
- [ ] **Módulo 5: Ecossistema Spring Boot & APIs RESTful**

---

## Estrutura do Repositório

```text
src/
├── modulo1/
│   ├── tipoderetorno/
│   ├── escopovariaveis/
│   ├── wrappers/
│   ├── nomenclatura/
│   ├── fluxoexecucao/
│   ├── heranca/
│   ├── polimorfismo/
│   ├── returnexercicio/
│   ├── revisaogeral/
│   └── revisaoOOP/
└── modulo2/
    ├── Caixa.java
    ├── Estoque.java
    ├── ItemNaoLocalizadoException.java
    ├── ValorNaoAceitavelException.java
    ├── Main.java
    ├── Recibo.java
    ├── ReciboArquivo.java
    ├── Repositorio.java
    └── RepositorioMemoria.java
```

---

## Entregas Concluídas

### Módulo 1 — Fundamentos & POO
- **Tipos de Retorno & Métodos:** Operações aritméticas, classificadores e regras com retorno tipado.
- **Wrappers & Conversões:** Conversão e parsing seguro entre tipos primitivos (`int`, `double`) e `String`.
- **Escopo & Fluxo:** Controle de execução com `break`, `continue` e escopos de variáveis de instância e locais.
- **Herança & Encapsulamento:** Modelagem de entidades (`Animal`, `Funcionario`, `Veiculo`) com atributos encapsulados.
- **Polimorfismo & Interfaces:** 
  - Cálculo de áreas geométricas (`Circulo`, `Retangulo`, `Quadrado`).
  - Sistema de Caixa e Vendas utilizando interfaces (`FormaPagamento`, `Tributavel`) desacopladas de implementações concretas (`PagamentoPix`, `PagamentoCartao`, `PagamentoBoleto`).
  - Modelagem de produtos nacionais e importados com cálculo diferenciado de taxas.

### Módulo 2 — Collections, Generics, Exceções & I/O
- **List & ArrayList:** Gerenciamento dinâmico de itens em estoque e manipulação de carrinho de compras sequencial no `Caixa`.
- **Map & HashMap:** Implementação de catálogo em memória com busca instantânea \(O(1)\) por chave identificadora única, operações de cadastro, remoção e checagem de existência (`containsKey`).
- **Generics (`<T>`):** Contrato desacoplado na interface `Repositorio<T>` e implementação genérica em `RepositorioMemoria<T>`, garantindo segurança de tipos em tempo de compilação e reusabilidade.
- **Tratamento de Exceções de Domínio:** Criação de exceções não-checadas (`ItemNaoLocalizadoException` e `ValorNaoAceitavelException` estendendo `RuntimeException`) e tratamento resiliente com blocos `try-catch`, protegendo o sistema contra dados inválidos.
- **Persistência em Arquivos (Java I/O):** Interface desacoplada `Recibo` com implementação concreta `ReciboArquivo`, gravando comprovantes de compra formatados em disco (`recibo.txt`) utilizando `FileWriter` gerenciado por `try-with-resources`.
- **Mini Projeto de Consolidação (CLI Enterprise):** Aplicação interativa em console com separação de perfis de acesso (**Vendedor:** cadastro, remoção segura com confirmação e listagem; **Cliente:** catálogo enxuto com projeções seletivas, adição/remoção no carrinho, cálculo dinâmico de subtotal, checkout polimórfico e emissão de recibo físico).

