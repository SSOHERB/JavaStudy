package file.example;

import java.io.FileWriter;
import java.io.IOException;

public class FileIOExam05 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("/Users/yunie/Downloads/addMode.txt");
        for(int i=1; i<11; i++){
            String data = i+ " 번째 줄입니다. \n";
            fw.write(data);
        }
        fw.close();

        // 생성한 같은 파일에 추가로 새로운 내용 넣기
        FileWriter fw2 = new FileWriter("/Users/yunie/Downloads/addMode.txt", true);
        for(int i=11; i<21; i++){
            String data = i+ " 번째 줄입니다. \n";
            fw2.write(data);
        }
        fw2.close();
    }
}
