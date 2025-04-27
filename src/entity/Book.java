package entity;

public class Book {

    /**
     * String은 Java가 String pool이라는 것을 재사용하여 리터럴 즉, 이미 고정된 값을 할당해놓으면 해당 주소를 가져오게 한다.
     * 즉 String은 문자열 리터럴로서 String pool에 저장된다.
     * String name = "book1" 여기서 name은 book1 값을 가지고 있는 참조 주소값을 가지고 있다. 해당 참조 주소값은 해당 객체로 가는 길을 갈 수 있는 화살표 기능을 가진다.
     * 초기화는 처음으로 값을 세팅하는 것.
     * 선언 : 공간만 확보할 수 있는 변수(참조 주소값)를 만든 것
     * final로 선언한 경우 언젠가 반드시 한 번은 생성자 블록에서 혹은 다른 곳에서 초기화해줘야 한다.
     */
    private final String name;
    private final String author;
    private final String isbn;

    public Book(String name, String author, String isbn) {
        this.name = name;
        this.author = author;
        this.isbn = isbn;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }
}
