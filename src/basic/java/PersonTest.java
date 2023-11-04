package basic.java;

public class PersonTest {
    public static void main(String[] args){
        Person p1 = new Person();
        Person p2 = new Person();
        p1.name = "홍길동";
        p2.name = "조조";

        System.out.println(p1.name);
        System.out.println(p1.name.length());
        System.out.println(p1.address);
        // NullPointerException 발생 : address필드는 참조 값이 없기 때문에 오류 발생
        System.out.println(p1.address.length());
    }
}
