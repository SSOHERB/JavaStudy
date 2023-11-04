package array;

import java.util.Arrays;

public class Arrays04 {
    public static void main(String[] args) {
        int[] array = {5, 4, 3, 1, 2};

        // 배열 오름차순 : binary 알고리즘은 정렬 부터 필요하므로 sort 먼저 실행
        Arrays.sort(array);

        // key(값)이 4인 인덱스 검색 -> 중간값을 계속찾는 알고리즘
        int i = Arrays.binarySearch(array, 4);
        System.out.println(i);
    }
}
