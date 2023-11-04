package array;

public class Array04 {
    public static void main(String[] args) {
        ItemForArray[] array1 = new ItemForArray[3];
        array1[0] = new ItemForArray(500, "사과");
        array1[1] = new ItemForArray(3000, "바나나");
        array1[2] = new ItemForArray(100, "수박");

        ItemForArray[] array2 = new ItemForArray[]{new ItemForArray(500, "사과"), new ItemForArray(300, "키위"), new ItemForArray(100, "참외")};
        ItemForArray[] array3 = {new ItemForArray(500, "사과"), new ItemForArray(300, "키위"), new ItemForArray(100, "참외")};

        System.out.println(array1[0].getName());
        System.out.println(array1[0].getPrice());
        System.out.println(array2[1].getName());
    }
}
