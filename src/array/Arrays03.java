package array;
import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {
        int[] array = {5, 4, 3, 2, 1};

        // 배열 오름차순
        Arrays.sort(array);
        for(int i : array){
            System.out.print(i + " ");
        }
    }
}
