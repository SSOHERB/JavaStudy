package array;

public class Array03 {
    public static void main(String[] args) {
        // 배열 선언 : 아직 참조하는 것 없는 상태
        ItemForArray[] array1;
        ItemForArray array2[];

        // 배열 초기화
        array1 = new ItemForArray[5];
        array2 = new ItemForArray[5];

        // ItemForArray 인스턴스 생성 후, 배열 요소에 참조
        array1[0] = new ItemForArray(500, "item01");
        array1[1] = new ItemForArray(1000, "item02");

        System.out.println(array1[0].getName());
        System.out.println(array1[2]);
    }
}
