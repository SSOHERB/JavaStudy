package lotto;

public class LottoMachineMain {
    public static void main(String[] args) {
        // ###### Ball 부터 생성 #######
        // 1. 45개의 변수 필요 -> 배열 형태
        // Ball[]타입의 balls 인스턴스 생성
        Ball[] balls = new Ball[LottoMachine.MAX_BALL_COUNT];
        // 2. Ball[] 배열에 하나씩 숫자를 넣는다. -> 반복문
        for(int i = 0; i < LottoMachine.MAX_BALL_COUNT; i++){
            // ?????????????????? 왜 새로 생성하는지 ???????????????????????
            balls[i] = new Ball(i+1);
        }

        // ###### 로또 생성기 기능 실행 #######
        // 3. 새로운 Lottomachine 인스턴스 생성
        LottoMachine lottoMachine = new LottoMachineImpl();

        // 3-1. balls는 새로 생성된 객체, 배열
        lottoMachine.setBalls(balls);
        lottoMachine.mix();
        // Ball[] 타입의 result 변수에 getBalls() 반환 값을 저장
        Ball[] result = lottoMachine.getBalls();

        // 3-2. 섞인 볼의 결과를 반환하여 보여줌 - 6개
        for(int i = 0; i < result.length; i++){
            // Ball 클래스의 getNumber 메서드 : 숫자 반환
            System.out.println(result[i].getNumber());
        }

    }
}
