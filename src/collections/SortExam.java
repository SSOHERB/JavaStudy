package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortExam {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("kim");
        list.add("lee");
        list.add("hong");

        // Collections.sort 정렬하는 메소드
        Collections.sort(list);
        // Collections.shuffle 섞는 메소드 -> 실행할 때 마다 값이 달라짐
        Collections.shuffle(list);

        // list 사이즈만큼 반복 출력
        for(int i=0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
