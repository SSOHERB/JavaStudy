package io;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

// ## 콘솔 입력 InputStreamReader : 아스키코드값 대신 문자로 입력
public class IOException04 {
    public static void main(String[] args) throws IOException {
        /*InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);*/

        // 객체 생성시, 생성자의 입력으로 InputStream 객체 필요
        InputStreamReader reader = new InputStreamReader(System.in);

        // char 배열 형태로 3byte 한번에 입력받기
        char[] a = new char[3];
        reader.read(a);

        System.out.println(a);
    }
}
