package object.oriented;

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.setOprands(10, 0);
        c1.devide();

        Calculator c2 = new Calculator();
        c2.setOprands(10, 2);
        c2.devide();
    }
}

class Calculator {
    int left, right;

    // Number Setting
    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }

    // Calculate Method
    public void devide() {
        // 무조건 수행
        try{
            int deviding = this.left / this.right;
            System.out.println("계산결과는 : " + deviding);
        } catch (Exception e){ // Exception java.lang 소속된 기본 클래스

            // getMessage() : 기본적인 오류 내용 리턴
            System.out.println("\n\ne.getMessage()\n " + e.getMessage());

            // toString() : 예외 정보를 문자열로 출력
            System.out.println("\n\ne.toString()\n" + e.toString());

            // e.printStackTrace 리턴값 없음, 내부적으로 예외 결과 화면출력
            e.printStackTrace();
        }
    }
}
