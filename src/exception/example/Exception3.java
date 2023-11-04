package exception.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception3 {
    public static void main(String[] args) {
        // 컴파일 에러 방지 : FileNotFoundException은 반드시 예외처리 필수
        try{
            FileInputStream fis = new FileInputStream("Exception4.java");
        } catch(FileNotFoundException fnfe){
            System.out.println("file을 찾을 수 없습니다");
        }
    }
}
