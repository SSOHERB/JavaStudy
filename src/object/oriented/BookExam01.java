package object.oriented;

public class BookExam01 {
    public static void main(String[] args) {
        Book b1 = new Book();
        // ## setter메서드로 값을 초기화 설정
        b1.setPrice(500);
        // ## getter메서드로 값을 꺼내온다.
        System.out.println(b1.getPrice());
        System.out.println(b1.toString());
    }
}
