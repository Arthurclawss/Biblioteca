package Livros;

import java.util.List;
import java.util.Scanner;

public class Livro {
    private String titulo;
    private String autor;
    private int numeroDePaginas;
    private int anoDeLancamento;


        public static Livro converter(LivroApi api){
            Livro livro = new Livro();

            livro.setTitulo(api.getTitle());

            if(api.getAuthor_name() != null && !api.getAuthor_name().isEmpty()){
                livro.setAutor((api.getAuthor_name().get(0)));
            }else {livro.setAutor("Desconhecido...");}

            if(api.getNumber_of_pages_median() != null){
                livro.setNumeroDePaginas(api.getNumber_of_pages_median());
            }

            if(api.getFirst_publish_year() != null){
                livro.setAnoDeLancamento(api.getFirst_publish_year());
            }

            return livro;
        };


    //Getters and setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }



}
