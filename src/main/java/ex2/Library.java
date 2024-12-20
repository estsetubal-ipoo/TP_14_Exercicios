package ex2;

import java.util.HashMap;
import java.util.Map;

public class Library {
    private Map<String, Book> books = new HashMap<>();


    public void addBook(String isbn, Book book) {
        if(book == null) {
            throw new IllegalArgumentException("Book cannot be null.");
        }

        books.put(isbn, book);
    }

    public boolean hasBook(String isbn) {
        return books.containsKey(isbn);
    }

    public boolean removeBook(String isbn) {
        // Indicar se existia o livro
        Book removed = books.remove(isbn);
        return removed != null; //se null -> não existia
    }

    @Override
    public String toString() {
        String out = "";
        for(String isbn : books.keySet()) {
            Book b = books.get(isbn);
            out += String.format("ISBN: %s -> %s \n", isbn, b);
        }
        return out;
    }
}
