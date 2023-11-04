package array;

import java.util.Arrays;
import java.util.Comparator;

public class Array201 {
    public static void main(String[] args) {
        Item[] items = new Item[5];
        items[0] = new Item("java", 5000);
        items[1] = new Item("파이썬", 4000);
        items[2] = new Item("C#", 4500);
        items[3] = new Item("자바스크립트", 6000);
        items[4] = new Item("Dart", 2000);

//        Arrays.sort(items);

        // 정렬 sort(Object[]) : Object는 모든 객체의 조상이므로 어떤 객체의 배열이든 올 수 있다.
        // sort(배열명, 정렬 방법 정의); 정렬 방법 정의는 외부 클래스에서 compare를 오버라이딩한 기능
        // command + p 메서드 파라미터 목록 단축키
        Arrays.sort(items, new ItemSorter());

        // *3번의 기능 -> 람다 표현식
//        Arrays.sort(items, (item1, item2) -> item1.getName().compareTo(item2.getName()));

        // 정렬 후 출력
        for (Item item : items) {
            System.out.println(item);
        }
    }
}

// ## 3. 이름순으로 정렬하는 기능을 더 쉽게
class ItemSorter implements Comparator {
    // compare은 자신과 무관하게 o1과 o2 두 객체 비교
    @Override
    public int compare(Object o1, Object o2) {
        Item item1 = (Item) o1;
        Item item2 = (Item) o2;
        return item1.getName().compareTo(item2.getName());
    }
}

// ClassCastException 발생 -> Comparable 인터페이스 사용
// Comparable는 어떤 Item이 큰지, 작은지 기준을 정하는 인터페이스
class Item implements Comparable {
    private String name;
    private int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    // ## compareTo 오버라이딩 ##
    // 1. 이름 순 비교 :: items 배열을 name 순서로 비교하는 방법
    // 파라미터로 들어온 Object와 내 자신을 비교하는 메소드
    // compareTo 에는 Object 입력 값이지만, 실제로는 Item이 들어온다.
/*    public int compareTo(Object o) {
        // 파라미터로 들어온 Item을 Object로 형변환
        Item d = (Item)o;
        // compareTo :: 가나다순으로 비교
        // String도 compareTo 메서드를 기본적으로 갖고 있음
        return this.name.compareTo(d.name);
    }*/

    // 2. 가격 순 비교 :: items 배열을 price 순서로 비교하는 방법
        // 자기 자신 vs 파라미터 값 비교
    @Override
    public int compareTo(Object o) {
        // 지역 변수 d에 파라미터 값을 형 변환
        Item d = (Item) o;
        // 자기 자신 - 파라미터 값
        // 양수, 음수, 0으로 비교값 return
        return this.price - d.price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    // 배열 요소 문자열로 출력
    // Object가 갖고있는 to String 오버라이딩(자동)
    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
