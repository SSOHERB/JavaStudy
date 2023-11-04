package collections;
import java.util.HashMap;
import java.util.Map;

public class MapExam01 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("k1", "hello");
        map.put("k2", "hi");
        map.put("k3", "안녕");
        // 키 값 같으면 덮어씌우기
        map.put("k3", "안녕하세요");

        System.out.println(map.get("k1"));
        System.out.println(map.get("k2"));
        System.out.println(map.get("k3"));
    }
}
