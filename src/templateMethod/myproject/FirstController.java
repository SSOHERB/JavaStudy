package templateMethod.myproject;

import templateMethod.fw.Controller;

public class FirstController extends Controller {
    @Override
    protected void run() {
        System.out.println("오버라이딩 메소드 : 별도의 동작 수정 가능");
    }
}
