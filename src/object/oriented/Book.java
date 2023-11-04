package object.oriented;

/*
* JavaDoc : 주석문에서 사용되는 태그들(annotation)을 통해 생성할 수 있다.
*
* */
public class Book {
    // ## 필드 price (클래스 내 멤버변수)
    private int price;

    // ## 매개변수로 받은 지역변수
    // getter 메서드 : price 변수 반환
    public int getPrice() {
        return this.price;
    }

    // setter 메서드 : price 변수 설정
    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "String Override";
    }
}
