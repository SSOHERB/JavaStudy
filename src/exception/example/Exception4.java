package exception.example;

public class Exception4 {
    public static void main(String[] args) {
        int[] array = {4, 0};
        int[] value = null;
        try{
            value[0] = array[0] / array[1];
        } catch (ArrayIndexOutOfBoundsException aiob){
            System.out.println(aiob.toString());
        } catch (ArithmeticException ae){
            System.out.println(ae.toString());
        } catch (Exception ex) {
            // Exception은 NullPointException의 조상타입
            System.out.println(ex);
        }
    }
}
