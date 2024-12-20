package ex2;

public class Book {
    private final String title;
    private final String author;
    private final int year;

    public Book(String title, String author, int year) {
        // TODO: validação de parâmetros
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public String toString() {
        return String.format("Book[title=%s, author=%s, year=%4d]",
                title, author, year);
    }
}
