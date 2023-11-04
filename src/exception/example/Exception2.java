package exception.example;

public class Exception2 {
    public static void main(String[] args) {
        ExceptionObj2 exobj = new ExceptionObj2();
        try {
            int value = exobj.divide(10, 0);
            System.out.println(value);
        } catch (ArithmeticException ex){
            System.out.println("0으로 나눌 수 없다.");
        }
    }
}