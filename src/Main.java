import entity.Book;
import entity.Library;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Library library = new Library();
        library.addBook("Thinking", "Seong wook", "1-1");
        List<Book> bookList = library.getBookList();
        System.out.println("bookList = " + bookList.get(0).getName());

        Book thinking = library.findByBookName("Thinking");
        System.out.println("thinking = " + thinking.getName());

        //원래 0번째 인덱스에 있었던 Thinking은 인덱스에서 제외되고, 새로운 객체 thinking이 인덱스 0번째 자리에 가는 것 뿐.
        library.updateBookName("Thinking", "sW", "1-2"); //같은 이름의 객체를 찾아 해당 인덱스 자리에 업데이트.
        System.out.println("thinking.getName() = " + thinking.getName());
        System.out.println(library.getBookList().get(0).getName());
        System.out.println(thinking.getAuthor());
        System.out.println(library.getBookList().get(0).getAuthor());
    }
}