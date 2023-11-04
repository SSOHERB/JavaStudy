package array;

public class Array02 {
    public static void main(String[] args) {
        // 배열 선언+초기화 방법 : 첫번째
        int[] array1 = new int[5];
        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;
        array1[3] = 4;
        array1[4] = 5;

        // 두번째 방법
        int[] array2 = new int[]{1, 2, 3, 4, 5};

        // 세번째 방법
        int[] array3 = {1, 2, 3, 4, 5};

        // 배열 + 반복문 출력
        for(int i = 0; i < array3.length; i++){
            System.out.println(array3[i]);
        }
    }
}
