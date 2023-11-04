package array;

public class Array05 {
    public static void main(String[] args) {
        double[] array1 = new double[5];
        double[] array2 = {1.5, 2.4, 3.6};
/*        double[] array3;
        double array4[] = null;*/
        double[] array3 = new double[0];

        System.out.println(array1.length);
        System.out.println(array1[0]);
//        System.out.println(array1[1]);
//        System.out.println(array1[2]);
//        System.out.println(array1[3]);
        System.out.println(array2.length);
        System.out.println(array3.length);

        // ArrayIndexOutOfBoundsException
//        System.out.println(array3[0]);
    }
}
