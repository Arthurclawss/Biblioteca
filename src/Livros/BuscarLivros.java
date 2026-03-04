package Livros;

import com.google.gson.Gson;
import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class BuscarLivros {

    public Livro buscarNaWeb(String titulo) throws IOException, InterruptedException {

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://openlibrary.org/search.json?q="
                        + URLEncoder.encode(titulo, "UTF-8")))
                .GET()
                .build();

        HttpResponse<String> response = client.send(
                request,
                HttpResponse.BodyHandlers.ofString()
        );

        Gson gson = new Gson();

        ResultadoBusca resultado = gson.fromJson(response.body(), ResultadoBusca.class);

        if (resultado.getDocs() == null || resultado.getDocs().isEmpty()) {
            System.out.println("Nenhum livro encontrado.");
            return null;
        }

        LivroApi api = resultado.getDocs().get(0);

        return Livro.converter(api);
    }
}