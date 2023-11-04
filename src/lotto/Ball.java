package lotto;

// 불변 객체
public class Ball {
    // 로또 번호(숫자)는 변하지 않아야 한다.
    private int number;

    // 로또 번호는 생성할 때부터 number를 갖고 있음
    // 생성자 : 꼭 필요한 작업시 설정하는 것
    // 입력 값(인수-매개변수)만 전달하면 됨 -> 인스턴스 생성시 초기화할 값 세팅
    public Ball(int number){
        this.number = number;
    }

    // private한 번호를 반환해주는 getter 메서드
    public int getNumber() {
        return number;
    }
}
