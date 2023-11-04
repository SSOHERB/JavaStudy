package templateMethod.main;

import templateMethod.fw.Controller;
import templateMethod.myproject.FirstController;

public class ControllerMain {
    public static void main(String[] args) {
        Controller c1 = new FirstController();
        c1.execute();
    }
}
