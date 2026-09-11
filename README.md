# Jornada Backend Java

Repositório dedicado à evolução prática em Java para desenvolvimento Backend, cobrindo desde lógica e Orientação a Objetos até APIs REST com Spring Boot e Bancos de Dados.

---

## Trilha de Aprendizado

- [x] **Módulo 1: Fundamentos da Linguagem e POO Essencial**
- [x] **Módulo 2: Java Collections Framework, Generics & Exceptions**
- [x] **Módulo 3: Java Moderno (Streams API, Lambdas, Optional) & Testes Unitários (JUnit 5)**
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
├── modulo2/
│   ├── Caixa.java
│   ├── Estoque.java
│   ├── ItemNaoLocalizadoException.java
│   ├── ValorNaoAceitavelException.java
│   ├── Main.java
│   ├── Recibo.java
│   ├── ReciboArquivo.java
│   ├── Repositorio.java
│   └── RepositorioMemoria.java
└── modulo3/
    ├── FormatadorTexto.java
    ├── Musica.java
    ├── Main.java
    ├── ProdutoTest.java
    └── EstoqueTest.java
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

### Módulo 3 — Java Moderno & Testes Unitários com JUnit 5
- **Interfaces Funcionais & Lambdas:** Implementação de `@FunctionalInterface` customizada (`FormatadorTexto`) e expressões lambda para transformação de dados.
- **Streams API:** Pipelines de processamento declarativo (`filter`, `map`, `sorted`, `collect`, `Collectors.toList()`) aplicados a coleções de domínio.
- **Optional (`Optional<T>`):** Prevenção elegante contra `NullPointerException` com buscas seguras (`findFirst()`, `ifPresentOrElse()`, `orElse()`, `orElseThrow()`).
- **Testes Unitários Automatizados (JUnit 5):**
  - Configuração do JUnit Platform Standalone.
  - Testes de regras de negócio em [`ProdutoTest`](file:///c:/Users/bruno/projetos-java/jornada-backend-java/src/modulo3/ProdutoTest.java) utilizando `@Test` e `assertEquals` (produtos nacionais e importados).
  - Testes de integridade e fluxo de exceção em [`EstoqueTest`](file:///c:/Users/bruno/projetos-java/jornada-backend-java/src/modulo3/EstoqueTest.java) com `assertThrows` e verificação de catálogos com `ItemNaoLocalizadoException`.

---

## Como Executar

### Execução dos Testes Automatizados (JUnit 5)
Para compilar e rodar toda a suíte de testes do Módulo 3 via terminal:

```bash
# Compilar os testes e dependências
javac -d bin -cp "src;lib/junit-platform-console-standalone-1.10.2.jar" src/modulo2/*.java src/modulo3/*.java

# Executar todos os testes do pacote modulo3
java -jar lib/junit-platform-console-standalone-1.10.2.jar execute -cp "bin" -p modulo3
```

---

## Próximos Passos: Módulo 4 — Banco de Dados & Persistência (SQL, JDBC & JPA)

Planejamento dos cards para a próxima semana:

- [ ] **Card 4.1: Modelagem Relacional & SQL Essencial (DDL / DML)**
  - Modelagem do banco relacional (`produtos`, `categorias`, `itens_venda`).
  - Criação de scripts DDL com constraints (`PK`, `FK`, `UNIQUE`, `NOT NULL`).
  - Consultas analíticas com `JOINs`, agrupamentos (`GROUP BY`, `HAVING`) e agregações (`SUM`, `COUNT`).
- [ ] **Card 4.2: Conexão e Camada de Acesso com JDBC Puro & DAO**
  - Compreensão do funcionamento do driver JDBC, `DriverManager` e `Connection`.
  - Consultas parametrizadas com `PreparedStatement` (segurança contra SQL Injection) e leitura com `ResultSet`.
  - Padrão **DAO (Data Access Object)** desacoplando regras de negócio do acesso a dados.
  - Controle transacional explícito (`setAutoCommit`, `commit`, `rollback`).
- [ ] **Card 4.3: Mapeamento Objeto-Relacional (JPA / Hibernate)**
  - Configuração da unidade de persistência (`EntityManager`, `EntityManagerFactory`).
  - Mapeamento de Entidades com anotações `@Entity`, `@Table`, `@Id`, `@GeneratedValue`, `@Column`.
  - Modelagem de relacionamentos (`@ManyToOne`, `@OneToMany`, `@JoinColumn`) e estratégias de fetch (`LAZY` / `EAGER`).
  - Consultas orientadas a objetos com **JPQL**.
- [ ] **Card 4.4: Consolidação & Testes de Integração**
  - Integração do fluxo de vendas e estoque com persistência real em banco.
  - Testes automatizados com JUnit 5 validando operações de CRUD e integridade transacional.

