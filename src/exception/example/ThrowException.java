package exception.example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// exception.example.B.run()에서 발생한 예외를 최종적으로 메인 메서드에서 처리한다.
public class ThrowException {
    public static void main(String[] args) {
        C c = new C();
        try{
            c.run();
        } catch (FileNotFoundException e){
            // ## 사실 생략 가능 -> IOException이 조상이기 때문
            System.out.println("out.txt파일은 설정파일입니다. 이 파일은 프로젝트 루트에 존재합니다.");
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}

// 예외처리를 해야하는 곳(exception.example.B.run())에서 throws 키워드로 예외처리를 넘길 수 있다.
class B {
    void run() throws FileNotFoundException, IOException{
        BufferedReader bReader = null;
        String input = null;
        bReader = new BufferedReader(new FileReader("out.txt"));
        input = bReader.readLine();
        System.out.println(input);
    }
}

class C {
    // class B의 예외를 메서드 호출한 곳에서 처리할 수 있음
    void run() throws FileNotFoundException, IOException {
        // B의 객체를 생성하여 run()메소드 호출
        B b = new B();
        b.run();
    }
}