package file.example;

import java.io.FileWriter;
import java.io.IOException;

// ## 파일 생성 후 문자열 변환 없는 파일 작성
public class FileIOExam03 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("/Users/yunie/Downloads/FilewWriter.txt");

        for(int i=1; i<11; i++){
            String data = i + " 번째 줄입니다. \n";
            fw.write(data);
        }
        fw.close();
    }
}
