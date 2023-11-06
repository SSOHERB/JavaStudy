package io;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectInputExam {
    public static void main(String[] args) throws Exception{
        // 파일 읽어오기
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("/tmp/user.dat"));

        /* readObject() : (역직렬화) 파일에 쓰여진 객체 읽기
           ObjectInputStream에 FIleInputStream을 전달하고 readObject를 이용해서 객체 얻어오기
           이미 User 타입으로 객체를 생성했기 때문에 다시 User로 형변환
        */
        User user = (User)in.readObject();
        in.close(); // io를 사용하면 반드시 close 필요
        System.out.println(user);
    }
}
