package Livros;

import java.util.List;

public class LivroApi {
    private String title;
    private List<String> author_name;
    private Integer first_publish_year;
    private Integer number_of_pages_median;

    public String getTitle() {
        return title;
    }

    public List<String> getAuthor_name() {
        return author_name;
    }

    public Integer getFirst_publish_year() {
        return first_publish_year;
    }

    public Integer getNumber_of_pages_median() {
        return number_of_pages_median;
    }
}
