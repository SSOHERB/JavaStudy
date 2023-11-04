package basic.java;

public class ParentMain {
    public static void main(String[] args) {
        Parent p1 = new Parent();
        System.out.println(p1.i);
        p1.printI();
        System.out.println("______________");
        Child c1 = new Child();
        System.out.println(c1.i);
        c1.printI();
        System.out.println("____Type은 부모변수를 참고__________");
        Parent p2 = new Child();
        System.out.println(p2.i);
        p2.printII();
        p2.printI();
    }
}
