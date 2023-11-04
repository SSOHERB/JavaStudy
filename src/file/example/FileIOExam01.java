package file.example;

import java.io.FileOutputStream;
import java.io.IOException;

// ## 해당 경로로 파일 생성
public class FileIOExam01 {
    public static void main(String[] args) throws IOException {
        // ## 생성시 입력으로 파일명
        FileOutputStream output = new FileOutputStream("/Users/yunie/Downloads/out.txt");
        // ## 파일 객체 닫기
        output.close();
    }
}
