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

## Exemplo de uso

1️⃣ Menu inicial

Quando você roda a classe Principal.java, aparece o menu:

===== MENU =====

1 - Cadastrar livro manualmente

2 - Procurar livro na web

3 - Mostrar livros salvos

0 - Sair

Escolha uma opção:

2️⃣ Cadastrar um livro manualmente (opção 1)

Título do livro: O Senhor dos Anéis

Autor do livro: J.R.R. Tolkien

Numero de paginas do livro: 1178

Ano de lançamento do livro: 1954

Livro cadastrado com sucesso!


O livro agora está salvo na lista interna do programa.

3️⃣ Buscar livro na web (opção 2)

Digite o título do livro: Harry Potter e a Pedra Filosofal

Livro encontrado:

Título: Harry Potter e a Pedra Filosofal

Autor: J.K. Rowling

Ano: 1997

Páginas: 223

Deseja salvar? (1-Sim / 2-Não): 1

Livro salvo com sucesso!

O programa utiliza a API Open Library para buscar livros pelo título.

4️⃣ Listar livros salvos (opção 3)

=== Livros Salvos ===
----------------------

Título: O Senhor dos Anéis

Autor: J.R.R. Tolkien

Ano: 1954

Páginas: 1178
----------------------

Título: Harry Potter e a Pedra Filosofal
Autor: J.K. Rowling
Ano: 1997
Páginas: 223
5️⃣ Sair do programa (opção 0)
Programa encerrado...

## Como executar

1. Clone o repositório:

```bash
git clone https://github.com/Arthurclawss/Biblioteca.git
