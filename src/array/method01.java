package array;

import java.util.Arrays;

public class method01 {
    // 연산 기능 gugu 메소드
    static int[] gugu(int dan) {
        // 반환값 : 구구단이므로 9개 정수 담을 배열 형태
        int[] result = new int[9];
        for(int i=0; i<9; i++) {
            result[i] = dan * (i+1);
        }
        return result;
    }
    public static void main(String[] args) {
        // 결과값은 int형 배열을 하나씩 꺼내기
        int[] result = gugu(2);
        for(int a : result){
            System.out.println(a);
        }

        // 배열의 문자열 출력
        System.out.println(Arrays.toString(result));
    }
}
