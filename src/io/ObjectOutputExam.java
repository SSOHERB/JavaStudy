package io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectOutputExam {
    public static void main(String[] args) throws Exception{
        // User 타입 객체 생성
        User user = new User("hong@hanmail.net", "Hong", 1992);

        // 객체 직렬화 파일 생성
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("/tmp/user.dat"));

        // writeObject(객체) : 매개변수로 파일에 쓰고자하는 객체 전달
        // user를 객체 직렬화시켜서 파일에 저장하게 됨
        out.writeObject(user);
        out.close();
    }
}