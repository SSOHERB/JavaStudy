package basic.java;

public class MathBean {
    // 1. 매개변수 X, 리턴 X
    public void printClassName() {
        System.out.println("basic.java.MathBean");
    }

    // 2. 매개변수 int x, 리턴 X
    public void printNumber(int x) {
        System.out.println(x);
    }

    // 3. 매개변수 X, 리턴 int
    public int getOne() {
        return 1;
    }

    // 4. 매개변수 int x, int y. 리턴 int
    public int plus(int x, int y){
        return x+y;
    }
}
