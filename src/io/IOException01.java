package io;

import java.io.IOException;
import java.io.InputStream;

// ## 콘솔 입력 InputStream 내장 클래스 ##
public class IOException01 {
    public static void main(String[] args) throws IOException {
        //    IOException 예외처리 발생 필요
        //    문자열 얻기 System.in -> InputStream의 객성
        InputStream in = System.in;

        // read() 1byte 크기로 입력 -> int형
        int a;
        a = in.read();

        // 콘솔에 ASCII 입력 후 출력
        System.out.println(a);
    }
}
