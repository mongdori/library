import entity.Book;
import entity.Library;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Library library = new Library();
        library.addBook("Effective Java", "Anonymous", "1-1");
        boolean b = library.removeByBookName("Java");
        System.out.println("b = " + b);
    }
}