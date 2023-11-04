package lotto;

public interface LottoMachine {
    int MAX_BALL_COUNT = 45;
    int RETURN_BALL_COUNT = 6;

    // !!!!!! 주의 : {} 중괄호 생략 - 추상메서드(abstract 생략)
    // 1. 45개의 볼 설정 -> 리턴 값 없음
    // Ball[]은 배열 타입, balls는 Ball 타입
    public void setBalls(Ball[] balls);

    //2. 섞는 기능 -> 리턴 값 없음
    public void mix();

    // 3. 섞은 볼을 6개 반환
    public Ball[] getBalls();
}
