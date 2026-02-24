import Livros.Livro;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        ArrayList<Livro> ListaDelivros = new ArrayList<>();

        System.out.println("Quantos livros deseja cadastrar: ");
        int quantidade = sc.nextInt();
        sc.nextLine();

        for (int i = 0; quantidade > i; i++){
            System.out.println("Numero de cadastro do livro: "+(i+1));
            Livro livro = new Livro();

            livro.resgatarInformacoes();

            ListaDelivros.add(livro);



        }
        System.out.println("\nLista completa: ");
        for (Livro livro : ListaDelivros){
            livro.mostrarLista();
            System.out.println("---------------------");
        }

    }
}
