package basic.java;

import basic.java.Parent;

public class Child extends Parent {
    public int i = 15;
    public void printI(){
        System.out.println("child - childI() : " + i);
    }
}
