package object.oriented;

public class CarExam {
    public static void main(String[] args) {
        // Car를 상속받는 이름없는 객체 생성 -> 오버라이딩
        Car c1 = new Car(){
            @Override
            public void run() {
                super.run();
            }
        };
    }
}
