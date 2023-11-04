package type;

public class StringExam {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hello";
        String str3 = new String("hello");
        String str4 = new String("hello");

        // ## 문자열 출력
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);

        // ## Call by Reference
        if(str1 == str2)
            System.out.println("str1 == str2");
        else if(str2 == str3)
            System.out.println("str2 == str3");
        else if(str3 == str4)
            System.out.println("str3 == str4");

        // ## Call by Value
        if(str1.equals(str4)){
            System.out.println("str1 == str4");
        }

        // ## String 불변객체
        String s = str1.toUpperCase();
        System.out.println(s);
        System.out.println(str1);

        // ## String 문자열 자르기
        String cut = str1.substring(3);
        System.out.println(cut);
    }
}