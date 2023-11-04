package object.oriented;

public class MyRunnableMain {
    public static void main(String[] args) {
        // 1. 인터페이스로 객체 생성 불가 but 자동으로 오버라이딩 생성
        MyRunnable r = new MyRunnable() {
            @Override
            public void run() {
                System.out.println("myrunnable run!!");
            }
        };

        // 2. run() 실행
        r.run();
    }
}
