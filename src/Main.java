import entity.Book;
import entity.Library;

public class Main {
    public static void main(String[] args) {
        String name1 = "seongwook";
        String author = "seongwook1";
        String isbn = "123";

        String name2 = "suzie";
        String author2 = "suzie1";
        String isbn2 = "345";

        Book book = new Book(name1, author, isbn);
        Book book2 = new Book(name2, author2, isbn2);

        Library library = new Library();
        library.addBook(name1, author, isbn);
        library.addBook(name2, author2, isbn2);
        library.printAllBooks();
        Book suzie = library.findByBookName("suzie");
        System.out.println("suzie = " + suzie.getName());
    }
}