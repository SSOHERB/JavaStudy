package lotto;

public class LottoMachineImpl implements LottoMachine{
    // ?????????????????? 필드 개념 ???????????????????????
    // Ball을 받아들여서 balls로 저장
    private Ball[] balls;

    // 1. 볼 설정
    // 매개변수인 balls : 외부로 부터 받아들인 balls를 자기 자신의 balls로 초기화
    @Override
    public void setBalls(Ball[] balls) {
        this.balls = balls;
    }

    // 2. 볼 섞기 : swap 알고리즘
    @Override
    public void mix() {
        // swap으로 10,000번 돌리기
        for(int i = 0; i < 10000; i++){
            // ??? 문법 : int 변수명 = (int) 변수명
            // 2개의 공간에 Math.random으로 0.0 ~ 45.0 사이의 실수 랜덤해서 넣기
            int x1 = (int)(Math.random() * LottoMachine.MAX_BALL_COUNT);
            int x2 = (int)(Math.random() * LottoMachine.MAX_BALL_COUNT);
            if(x1 != x2){
                // 값 치환시, 같은 타입의 임시 변수가 필요
                Ball tmp = balls[x1];
                balls[x1] = balls[x2];
                balls[x2] = tmp;
            }
        }
    }

    // 3. Ball 6개를 참조할 수 있는 배열 반환
    // getBalls의 반환 타입은 Ball[] : Ball의 배열 타입
    @Override
    public Ball[] getBalls() {
        Ball[] result = new Ball[LottoMachine.RETURN_BALL_COUNT];
        for(int i = 0; i < LottoMachine.RETURN_BALL_COUNT; i++){
            // result[6] 배열 변수에 mix()된 balls 배열을 앞에서 부터 6개 저장
            // ball[0] ~ ball[6]
            result[i] = balls[i];
        }
        return result;
    }
}
