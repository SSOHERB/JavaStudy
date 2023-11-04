package io;

import java.io.IOException;
import java.io.InputStream;

// ## 3byte 단위로 콘솔 입력 처리 : 1byte씩 3개
public class IOException02 {
    public static void main(String[] args) throws IOException {
        // 입력 객체 생성
        InputStream in = System.in;

        int a;
        int b;
        int c;

        // 1byte씩 3개 : 사용자로부터 입력받기
        a = in.read();
        b = in.read();
        c = in.read();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        // 동일한 표현방법
        System.out.println(System.in.read());
        System.out.println(System.in.read());
        System.out.println(System.in.read());
    }
}
