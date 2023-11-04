package basic.java;

public class MathBeanTest {
    public static void main(String[] args){
        // 1. basic.java.MathBean 인스턴스 생성 : heap 메모리에 올라가고 math는 참조하게 된다.
        MathBean math = new MathBean();
        math.printClassName();
        math.printNumber(10);
        // 반환값 = 변수에 저장 후 출력
        int x = math.getOne();
        System.out.println(x);
        math.plus(2, 3);
    }
}
