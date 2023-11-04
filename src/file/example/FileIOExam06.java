package file.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// ## 파일 내용을 콘솔에 입력
public class FileIOExam06 {
    public static void main(String[] args) throws IOException {
        // 파일 한줄 단위로 읽는 파일 생성
        BufferedReader br = new BufferedReader(new FileReader("/Users/yunie/Downloads/output.txt"));
        while (true){
            String line = br.readLine();
            if(line == null) break; // 읽을 내용없을 시, while 문 빠짐
            System.out.println(line);
        }
        br.close();
    }
}
