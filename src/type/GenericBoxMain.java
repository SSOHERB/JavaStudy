package type;

public class GenericBoxMain {
    public static void main(String[] args) {
        // 앞에있는 String 자료형을 그대로 사용
        // GenericBox에 있는 <T>를 전부 String 자료형으로 전환
        GenericBox<String> genericBox = new GenericBox<>();
        genericBox.add("Kim");
        String str = genericBox.get();
        System.out.println(str.toLowerCase());

        // 컴파일 오류
        // genericBox,add(new Integer(5));

        // int로 전환
        GenericBox<Integer> intBox = new GenericBox<>();
        intBox.add(new Integer(5));
        Integer intValue = intBox.get();
        System.out.println(intValue);
    }
}
