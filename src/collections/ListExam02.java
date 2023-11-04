package collections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ListExam02 {
    public static void main(String[] args) {
        // Collection : 참조하고 있는 클래스 = 객체생성 클래스 ArrayList
        // 따라서 Collection 메서드만 사용 가능
        // 순서대로 출력된 것은 ArrayList 형태이기 때문
        // 오른쪽은 Collection을 구현하고 있는 자료구조 가능
        Collection<String> collection = new ArrayList<>();
        collection.add("Kim");
        collection.add("Lee");
        collection.add("Hong");

        System.out.println(collection.size());

        // Iterator : Collection에 있는 자료를 모두 꺼내기 위한 인터페이스
            // Collection의 입력값이 String이기 때문에 Iterator의 제네릭도 String
        Iterator<String> iter = collection.iterator();

        // hasNext() : boolean; 꺼낼 데이터가 있는지?
        // next() : Object; 데이터 꺼내기
        while (iter.hasNext()){
            String str = iter.next();
            System.out.println(str);
        }
    }
}
