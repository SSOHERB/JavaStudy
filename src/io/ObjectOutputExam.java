package io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectOutputExam {
    // 파일 열때, FileNotFoundException 발생하므로 IOException throws 처리
    public static void main(String[] args) throws Exception{
        // User 타입 객체 생성
        User user = new User("hong@hanmail.net", "Hong", 1992);

        // 객체 직렬화 파일 생성
        FileOutputStream fos = new FileOutputStream("/tmp/user.dat");
        ObjectOutputStream out = new ObjectOutputStream(fos);
        // == ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("/tmp/user.dat"));

        /* writeObject(객체) : 매개변수로 파일에 쓰고자하는 객체 전달
           user를 객체 직렬화시켜서 파일에 저장하게 됨
         */
        out.writeObject(user);
        out.close(); // io를 사용하면 반드시 close 필요
    }
}
