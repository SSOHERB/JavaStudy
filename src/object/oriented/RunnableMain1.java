package object.oriented;

public class RunnableMain1 {
    public static void main(String[] args) {
/*        object.oriented.MyRunnable myRunnable = new object.oriented.MyRunnable() {
            @Override
            public void run() {
                System.out.println("구현없이 인터페이스 실행 : 첫번째");
            }
        };*/
        RunnableExecute runnableExecute = new RunnableExecute();
       /* runnableExecute.execute(new object.oriented.MyRunnable() {
            @Override
            public void run() {
                System.out.println("구현없이 인터페이스 실행 : 두번째");
            }
        });*/
        runnableExecute.execute(() -> {
                System.out.println("구현없이 인터페이스 실행 : 세번째");
        });
    }
}
