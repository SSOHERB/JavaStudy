package array;

public class ItemArrayMain {
    public static void main(String[] args) {
        ItemForArray[] array = new ItemForArray[3];
        array[0] = new ItemForArray(500, "사과");
        array[1] = new ItemForArray(400, "바나나");
        array[2] = new ItemForArray(100, "수박");

        // for each : 배열 요소 꺼내기
        // item 변수 = array 객체는 ItemForArray 자료형이므로
        for(ItemForArray item : array){
            System.out.println(item.getName());
            System.out.println(item.getPrice());
        }
    }
}
