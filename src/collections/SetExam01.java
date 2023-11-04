package collections;
import java.util.*;

public class SetExam01 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("hello");
        set.add("hi");
        set.add("hong");

        // 중복 불가
        set.add("hong");

        // ## Iterator의 패턴은 항상 동일하므로 암기
        Iterator<String> iter = set.iterator();
        while (iter.hasNext()){
            String str = iter.next();
            System.out.println(str);
        }
    }
}
