package object.oriented;

import object.oriented.MyRunnable;

public class RunnableExecute {
    // 인터페이스를 입력 값으로 설정; 매개변수로 전달받음
    public void execute(MyRunnable myRunnable){
        myRunnable.run();
    }
}
