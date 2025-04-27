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

    /**
     *
     * 자기 자신을 인스턴스화 할 수 없는 이유
     * - 자기 자신은 자신을 생성시킬 수 없다. 자신의 존재 관리까지 하는건 말이 안된다.
     * - 자신의 존재 관리를 하는것보다 자신의 본질 (= 갖고 있는 데이터, 행동)에만 집중해야 한다.
     *
     * 인스턴스를 만드는 건 생성자가 해야 한다.
     * 객체 자신은 '존재'만 하는 것뿐.
     *
     * 특정 데이터들을 알아야 하고, 기억해야 하는 엔티티를 설정해야 한다.
     * 그래야 그 곳에 저장을 하고 가지고 올 수 있기 때문이야.
     *
     * 자신은 자기 자신의 본질을 책임져야 한다.
     * 자신에게 무슨 데이터가 세팅되어야 하는지 스스로 결정해야 한다.
     * 그리고 자신이 다른 곳에서 쓰일 수 있게 문을 여는 생성자 코드가 있어야 한다.
     * (생성자는 자기 자신을 생성하는 것이 아닌, 다른 곳에서 쓸 수 있도록 열어주는 문)
     *
     * 객체 자신만이 자신의 내부를 알아야 한다.
     */
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
