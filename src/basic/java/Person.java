package basic.java;

public class Person {
    // 1. 인스턴스 필드 3개 : name, address, isVip(Boolean)
    String name;
    String address;
    boolean isVip;

    // 2. 클래스(static) 필드는 static 블록에서만 초기화 가능
    static int count;
    static {
        count = 100;
    }

    // 1-A. 인스턴스 메서드
    public void printName(){
        System.out.println("내 이름은" + name);
    }

    // 2-exception.example.B. 클래스(static) 메서드 : static 필드만 사용 가능
    public static void printCount(){
        System.out.println("count : " + count);
    }
}
