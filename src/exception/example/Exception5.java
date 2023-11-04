package exception.example;

public class Exception5 {
    public static void main(String[] args) {
        int[] array = {4, 2};
        int[] value = new int[1];

        // 이미 value는 null값 -> 4/2 일때, value[0]은 NullPointException 발생
        // int[] value = null;

        // ## 예외처리
        try{
            value[0] = array[0] / array[1];
        } catch (ArrayIndexOutOfBoundsException aiob){
            // array 1개일때 -> 나눌 수 없을때 발생
            System.out.println(aiob.toString());
        } catch (ArithmeticException ae){
            System.out.println(ae.toString());
        } catch (Exception ex) {
            // Exception은 NullPointException의 조상타입
            System.out.println(ex);
        }
    }
}
