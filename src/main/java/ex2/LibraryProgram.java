package ex2;

public class LibraryProgram {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook("978-1234567897", new Book("Java Programming", "John Doe", 2021));
        library.addBook("978-9876543210", new Book("Data Structures", "Jane Smith", 2020));
        library.addBook("978-4567891234", new Book("Algorithms", "Alan Turing", 2019));
        String isbn = "978-9876543210";
        System.out.println("978-9876543210 exists? " + library.hasBook("978-9876543210")); // -> true
        System.out.println(library);
        /* Listagem pretendida (não interessa a ordem):
        ISBN: 978-1234567897 -> Book[name=Java Programming, author=John Doe, year=2021]
        ISBN: 978-9876543210 -> Book[name=Data Structures, author=Jane Smith, year=2020]
        ISBN: 978-4567891234 -> Book[name=Algorithms, author=JAlan Turing, year=2019]
        */

        library.removeBook("978-4567891234");
        // Repetir listagem
        System.out.println(library);
    }
}
