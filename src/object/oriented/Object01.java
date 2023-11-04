package object.oriented;

public class Object01 {
    int a; // 객체변수

    // 1. 매개변수로 자료형 전달
    int objAdd(int a){
        // a는 매개변수안에서만 쓰이는 변수이다.
        a++;
        return a;
    }

    // 2. 객체형태로 전달
    void objPlus(Object01 obj){
        obj.a++;
    }

    public static void main(String[] args) {
        int b = 1;
        Object01 obj = new Object01();
        // b는 메서드의 int a와 다르다.
        obj.objAdd(b);
        System.out.println(b);

        // objAdd 사용하여 b 값 변경하는 방법
        b = obj.objAdd(b);
        System.out.println(b);

        // 객체를 통해 값 변경
        obj.a = 1;
        obj.objPlus(obj);
        System.out.println(obj.a);
    }
}
