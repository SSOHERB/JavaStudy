package io;

import java.io.*;

public class CheckedException {
    public static void main(String[] args) throws IOException {
        // 파일 읽기
        BufferedReader bReader = new BufferedReader(new FileReader("out.txt"));
        String input = bReader.readLine();
        System.out.println(input);
    }
}
