package array;
import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {
        int[] array1 = {2, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5};
        int[] array3 = {1, 2, 3, 4, 5, 6};

        // ## 배열 비교 : compare(x, y)
        // ## x - y = 양수, 0, 음수
            // 양수 : x값이 더 클때, 음수 : y값이 더 클때
        int compare = Arrays.compare(array1, array2);
        System.out.println(compare);

        // compare(x, y)로 배열 길이도 비교할 수 있다.
        int compareLength = Arrays.compare(array2, array3);
        System.out.println(compareLength);
    }
}
