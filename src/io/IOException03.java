package io;

import java.io.IOException;
import java.io.InputStream;

// ## 3byte 단위로 콘솔 입력 처리 : byte단위의 배열에 담기
public class IOException03 {
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;

        byte[] a = new byte[3];
        in.read(a);

        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
    }
}
