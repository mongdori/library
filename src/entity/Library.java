package entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Library {
    /**
     * 변수 : 값을 담고 있는 그릇
     * 참조 : 객체의 메모리 주소값
     * 해당 메모리 주소 즉, 참조 주소를 가지고 있는 변수 : 해당 메모리로 가는 화살표 기능
     * 참조 주소를 설정하고 해당 값을 반환하는 법 : new (새로운 메모리 공간을 할당, 객체 참조 주소를 반환) ArrayList(ArrayList 생성자를 호출하여 객체를 생성. 해당 참조 주소 안에는 ArrayList<>안에 담길 수 있는 데이터를 알려준다.<>) 해당 객체안에 들어갈 수 있는 값의 참조 주소값을 변수에 담는다
     * final : 해당 화살표 기능을 할 수 있고 참조 주소값을 가지고 있는 변수에 해당 주소만 바라보라는 final 키워드로 참조 주소값을 고정시킨다.
     * 고정시키는 이유는 어디선가 해당 변수에 새롭게 new를 해버리면 기존에 new 했던 메모리에 있는 데이터는 다 날아간다.
     */
    private final List<Book> books = new ArrayList<>();

    public List<Book> getBookList() {
        return books;
    }

    public void addBook(String name, String author, String isbn) {
        Book book = new Book(name, author, isbn);
        books.add(book);
    }

    /**
     * 1. Optional<>로 감싼다는게 무슨 의미인지?
     * 2. map()이란?
     * 3. Optional 객체란?
     * 4. Optional 객체를 직접 리스트에서 지울 수 없는 이유는?
     */
    public boolean removeByBookName(String name) {
        Optional<Book> bookOpt = findBook(name);
        return bookOpt.map(books::remove).orElse(false);
    }

    /**
     * setter를 쓰지 않는다는건 불변 객체로 하겠다는 말과 동일.
     * 불변 객체를 수정하기 위해선
     */
    public boolean updateBookInfo(String name, String newAuthor, String newIsbn) {

        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            if (book.getName().equals(name)) {
                Book newBook = new Book(name, newAuthor, newIsbn);
                books.set(i, newBook);
                return true;
            }
        }
        return false;
    }

    private Optional<Book> findBook(String name) {
        return books.stream()
                .filter(book -> book.getName().equals(name))
                .findFirst();
    }
}
