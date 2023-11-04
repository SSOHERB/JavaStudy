package array;

public class method02 {
    public static void main(String[] args) {
        // 3. 결과 값 담는 형태 -> 출력시 필요한 type
        int result = 0;

        // 1. 입력 값 1~999 중
        for(int n=1; n < 1000; n++){
            // 2. 출력 값 3의 배수, 5의 배수
            if(n % 3 == 0 || n % 5 == 0){
                result += n;
            }
        }

        // 4. 출력
        System.out.println(result);
    }
}
