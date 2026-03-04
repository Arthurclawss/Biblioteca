package Livros;

import java.util.Scanner;

public class InformacoesDoLivro {
    Scanner sc = new Scanner(System.in);

    public Livro resgatarInformacoes(){
        Livro livro = new Livro();
        System.out.println("Título do livro: ");
        String titulo = sc.nextLine();
        livro.setTitulo(titulo);

        System.out.println("Autor do livro: ");
        String autor = sc.nextLine();
        livro.setAutor(autor);

        System.out.println("Numero de paginas do livro: ");
        int numeroDePaginas = sc.nextInt();
        livro.setNumeroDePaginas(numeroDePaginas);


        System.out.println("Ano de lançamento do livro: ");
        int anoDeLancamento = sc.nextInt();
        livro.setAnoDeLancamento(anoDeLancamento);


        sc.nextLine();
        return livro;

    }

    public void mostrarLista(){
        Livro livro = new Livro();
        System.out.println("================================");
        System.out.println("Título: "+livro.getTitulo());
        System.out.println("Autor: "+livro.getAutor());
        System.out.println("Numero De Paginas: "+livro.getNumeroDePaginas());
        System.out.println("Ano De Lançamento: "+livro.getAnoDeLancamento());
        System.out.println("================================");
    }
}
