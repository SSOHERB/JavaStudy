package array;

public class Array01 {
    public static void main(String[] args) {
        // 배열 선언 : 아직 값이 없는 상태(초기화 x)
        int[] array1;
//        int[] array1 = null;
        int array2[];
        int array3[];

        // 배열 초기화
        array1 = new int[5];
        array2 = new int[3];
        array3 = new int[0];

        // 배열 길이 구하기
        System.out.println(array1.length);
        System.out.println(array2.length);
        System.out.println(array3.length);
    }
}
