import entity.Book;
import entity.Library;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Library library = new Library();
        library.addBook("Thinking", "Seong wook", "1-1");
        List<Book> bookList = library.getBookList();
        System.out.println("bookList = " + bookList.get(0));;

        Book thinking = library.findByBookName("Thinking");
        System.out.println("thinking = " + thinking.getName());
    }
}