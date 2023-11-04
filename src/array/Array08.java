package array;

public class Array08 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }

        System.out.println("for each문");

        // for each문
        for(int i : array){
            System.out.println(i);
        }
    }
}
