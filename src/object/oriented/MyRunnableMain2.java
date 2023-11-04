package object.oriented;

public class MyRunnableMain2 {
    public static void main(String[] args) {
/*        object.oriented.MyRunnable myRunnable = new object.oriented.MyRunnable() {
            @Override
            public void run() {
                System.out.println("자동 오버라이딩");
            }
        };*/

        // 인터페이스의 추상메서드를 갖고있는 또 다른 클래스의 메서드를 실행
        RunnableExecute runnableExecute = new RunnableExecute();
        /* 1. 인수로 새로운 인스턴스 입력
        runnableExecute.execute(myRunnable);
         */

        // 2. 메서드 호출시 인수에 직접 넣기 -> 주로 객체 재사용 없을때
        runnableExecute.execute(new MyRunnable() {
                        @Override
                        public void run() {
                            System.out.println("hello!!");
                        }
        });
        // 3. 람다 인터페이스 : B번 방식을 간략화
/*        runnableExecute.execute(() -> {
                System.out.println("hello!!_2");
        });*/
    }
}
