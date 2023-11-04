package collections;

import java.util.List;
import java.util.ArrayList;

public class ListExam01 {
    public static void main(String[] args) {
        // 자료구조 객체들은 제네릭 사용하지 않을시, Object 타입을 저장
        // 인터페이스 타입 = 인터페이스 구현한 인스턴스 타입
        List<String> list = new ArrayList<>();
        list.add("kim");
        list.add("Lee");
        list.add("hong");

        // List는 중복허용
        list.add("hong");

        String str1 = list.get(0);
        String str2 = list.get(1);
        String str3 = list.get(2);
        String str4 = list.get(3);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
    }
}
