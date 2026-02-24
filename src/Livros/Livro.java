package Livros;

import java.util.Scanner;

public class Livro {
    String titulo;
    String autor;
    int numeroDePaginas;
    int anoDeLancamento;

    Scanner sc = new Scanner(System.in);

    public void resgatarInformacoes(){
        System.out.println("Título do livro: ");
        titulo = sc.nextLine();

        System.out.println("Autor do livro: ");
        autor = sc.nextLine();

        System.out.println("Numero de paginas do livro: ");
        numeroDePaginas = sc.nextInt();
        sc.nextLine();

        System.out.println("Ano de lançamento do livro: ");
        anoDeLancamento = sc.nextInt();
        sc.nextLine();

    }

    public void mostrarLista(){
        System.out.println("Título: "+titulo);
        System.out.println("autor: "+autor);
        System.out.println("numeroDePaginas: "+numeroDePaginas);
        System.out.println("anoDeLancamento: "+anoDeLancamento);
    }

}
