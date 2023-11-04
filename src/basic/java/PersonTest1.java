package basic.java;

public class PersonTest1 {
    public static void main(String[] args) {
        // static 필드와 메서드
        System.out.println(Person.count);
        Person.printCount();

        // 인스턴스 필드와 메서드
        Person p1 = new Person();
        p1.name = "홍길동";
        System.out.println(p1.name);
        p1.printName();

        Person.count++;
        System.out.println(p1.count);
    }
}
