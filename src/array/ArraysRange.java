package array;
import java.util.Arrays;
// java.lang 패키지의 클래스는 import하지 않아도 사용가능

public class ArraysRange {
    public static void main(String[] args) {
        char[] copyFrom = {'h', 'e', 'l', 'l', 'o', '!'};
//        char[] copyTo = java.util.Arrays.copyOfRange(copyFrom, 1, 3);
        char[] copyTo = Arrays.copyOfRange(copyFrom, 1, 3);
        for(char c : copyTo){
            System.out.println(c);
        }
    }
}
