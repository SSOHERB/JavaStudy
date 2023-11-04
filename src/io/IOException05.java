package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// ## 콘솔 입력 : BufferedReader 길이 상관없이 입력 값 모두 받기
public class IOException05 {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);

        // readLine() 입력한 문자열 전부 출력
        String a = br.readLine();
        System.out.println(a);
    }
}
