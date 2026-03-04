import Livros.BuscarLivros;
import Livros.InformacoesDoLivro;
import Livros.Livro;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner sc = new Scanner(System.in);
        ArrayList<Livro> listaDeLivros = new ArrayList<>();

        int opcao;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Cadastrar livro manualmente");
            System.out.println("2 - Procurar livro na web");
            System.out.println("3 - Mostrar livros salvos");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = sc.nextInt();
            sc.nextLine(); // limpa o buffer

            switch (opcao) {

                case 1:
                    InformacoesDoLivro info = new InformacoesDoLivro();
                    Livro novoLivro = info.resgatarInformacoes();
                    listaDeLivros.add(novoLivro);
                    System.out.println("Livro cadastrado com sucesso!");
                    break;

                case 2:
                    System.out.print("Digite o título do livro: ");
                    String titulo = sc.nextLine();

                    BuscarLivros buscar = new BuscarLivros();
                    Livro livroEncontrado = buscar.buscarNaWeb(titulo);

                    if (livroEncontrado != null) {
                        System.out.println("\nLivro encontrado:");
                        System.out.println("Título: " + livroEncontrado.getTitulo());
                        System.out.println("Autor: " + livroEncontrado.getAutor());
                        System.out.println("Ano: " + livroEncontrado.getAnoDeLancamento());
                        System.out.println("Páginas: " + livroEncontrado.getNumeroDePaginas());

                        System.out.println("\nDeseja salvar? (1-Sim / 2-Não)");
                        int escolha = sc.nextInt();
                        sc.nextLine();

                        if (escolha == 1) {
                            listaDeLivros.add(livroEncontrado);
                            System.out.println("Livro salvo com sucesso!");
                        }
                    }
                    break;

                case 3:
                    if (listaDeLivros.isEmpty()) {
                        System.out.println("Nenhum livro salvo ainda.");
                    } else {
                        System.out.println("\n=== Livros Salvos ===");
                        for (Livro l : listaDeLivros) {
                            System.out.println("----------------------");
                            System.out.println("Título: " + l.getTitulo());
                            System.out.println("Autor: " + l.getAutor());
                            System.out.println("Ano: " + l.getAnoDeLancamento());
                            System.out.println("Páginas: " + l.getNumeroDePaginas());
                        }
                    }
                    break;

                case 0:
                    System.out.println("Programa encerrado...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        sc.close();
    }
}