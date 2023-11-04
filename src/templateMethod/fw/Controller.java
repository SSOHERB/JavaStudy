package templateMethod.fw;

public abstract class Controller {
    // protected 접근 제어자 : 상속받을 경우에만 접근 가능
    // 'final 메서드명'으로 오버라이딩 제한
    protected final void init(){
        System.out.println("초기화 코드 불변");
    }
    protected final void close(){
        System.out.println("마무리 코드 불변");
    }
    // 중간 단계의 매번 다른 코드
    protected abstract void run();

    // ## 템플릿 메소드 패턴 : 일정한 순서
    public void execute(){
        this.init();
        this.run();
        this.close();
    }
}
