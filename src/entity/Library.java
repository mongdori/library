package entity;

import java.util.ArrayList;
import java.util.List;

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





}
