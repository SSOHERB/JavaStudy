package object.oriented;

import object.oriented.Car;

public class SuperCar extends Car {
    @Override
    public void run() {
        System.out.println("시륜구동으로 달린다.");
    }
}
