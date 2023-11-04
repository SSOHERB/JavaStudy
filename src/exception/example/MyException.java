package exception.example;

public class MyException extends RuntimeException{
    // 오류메시지나 발생한 Exception을 감싼 결과로 내가 만든 Exception 사용

    // String을 받아서 부모에 message를 넘김
    public MyException(String message) {
        super(message);
    }

    // Throwable은 Exception의 부모
    // 또다른 Exception이나 RuntimeException을 받아서 감싼 Exception을 사용
    public MyException(Throwable cause) {
        super(cause);
    }
}
