package array;

public class Arrays {
    public static void main(String[] args) {
        int[] copyFrom = {1, 2, 3};

        int[] copyTo = java.util.Arrays.copyOf(copyFrom, copyFrom.length);
        for(int c : copyTo){
            System.out.println(c);
        }
        System.out.println("---------------");

        int[] copyTo2 = java.util.Arrays.copyOf(copyFrom, 5);
        for(int c : copyTo2){
            System.out.println(c);
        }
        System.out.println("---------------");

        // copyTo3은 copyFrom을 참조
        int[] copyTo3 = copyFrom;
        for(int c : copyTo3){
            System.out.println(c);
        }

        System.out.println("======== 같은것을 참조하는지? ========");
        // == 같은 것을 참조하는지 비교
        if(copyFrom == copyTo){
            System.out.println("Same");
        } else {
            System.out.println("No!!");
            // copyTo는 copyFrom을 참조한 것이 아니라, 복사한 것이기 때문
        }

        System.out.println("================");
        if(copyFrom == copyTo3){
            // copyTo3는 copyFrom을 복사한 것이 아니라, 참조함
            System.out.println("Same");
        } else {
            System.out.println("No!!");
        }
    }
}
