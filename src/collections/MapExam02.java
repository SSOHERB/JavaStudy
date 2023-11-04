package collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExam02 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("k1", "hello");
        map.put("k2", "hi");
        map.put("k3", "안녕");

        // keySet(); map의 key에 접근할 수 있는 Set 객체
        // key들이 전부 모이면 Set 자료구조
        Set<String> keySet = map.keySet();
        // Set에서 모든 자료를 꺼내기 위한 Iterator
        // iterator(); keySet으로부터 하나씩 꺼낼 수 있는 iterator 리턴
        Iterator<String> iterator = keySet.iterator();
        while (iterator.hasNext()){
            String key = iterator.next();
            // Map에서 자료를 꺼내려면 key를 이용해서 꺼냄
            String value = map.get(key);
            System.out.println(key + " : " + value);
        }
    }
}
