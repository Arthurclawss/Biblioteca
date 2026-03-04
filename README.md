# Biblioteca

Projeto em **Java** que simula um sistema de biblioteca, permitindo cadastrar livros manualmente ou buscar informações na web através da API Open Library.

## Funcionalidades

- Cadastrar livros manualmente
- Buscar livros na web pelo título
- Visualizar lista de livros salvos
- Armazenamento temporário em memória (ArrayList)

## Tecnologias

- Java 17
- Maven
- IntelliJ IDEA (opcional)
- Biblioteca Gson para conversão JSON (API Open Library)

## Estrutura do Projeto

- `Principal.java` → Classe principal que exibe o menu e controla o fluxo do programa
- `Livro.java` → Classe modelo do livro, com atributos e métodos getters/setters
- `InformacoesDoLivro.java` → Classe que coleta informações do livro do usuário
- `BuscarLivros.java` → Classe que busca livros na web usando Open Library API
- `LivroApi.java` e `ResultadoBusca.java` → Classes auxiliares para conversão da API

## Como executar

1. Clone o repositório:

```bash
git clone https://github.com/Arthurclawss/Biblioteca.git
