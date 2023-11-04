package io;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class KeyboardIOExam {
    public static void main(String[] args) throws Exception {
        // 키보드로부터 한줄씩 입력받고 출력한다.
        // 키보드로 한줄씩 입력 System.in (InputStream)
        // 한줄씩 출력 : System.out (PrintStream)
        // 키보드로 입력받았다는 건 문자로 입력 : char 단위의 입출력
        // char 단위 입출력 클래스 : Reader, Writer
        // 한줄 읽기 : BufferedReader 클래스의 readLine 메소드
        //           더이상 읽어들일것이 없으면(EOF) null을 반환
        // 한줄 쓰기 : PrintStream, PrintWriter

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        while ( (line = br.readLine()) != null){ // 한줄씩 입력받는다.
            System.out.println(line);
        }
    }
}
