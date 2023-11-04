package file.example;

import java.io.FileOutputStream;
import java.io.IOException;

// ## 파일 생성 및 내용 입력
public class FileIOExam02 {
    public static void main(String[] args) throws IOException {
        FileOutputStream output = new FileOutputStream("/Users/yunie/Downloads/output.txt");
        for(int i = 1; i < 11; i++){
            String data = i + " 번째 줄입니다. \n";

            // getBytes() : String -> byte 배열 변환
            output.write(data.getBytes());
        }
        output.close();
    }
}
