package io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ObjectOutputExam2 {
    public static void main(String[] args) throws Exception{
        // User 타입 객체 생성
        User user1 = new User("hong@hanmail.net", "Hong", 1992);
        User user2 = new User("go@hanmail.net", "Go", 1993);
        User user3 = new User("pak@hanmail.net", "Pak", 1994);

        // ArrayList도 Serializable를 implements했기에 직렬화가 될 수 있다.
        ArrayList<User> list = new ArrayList<>();
        list.add(user1);
        list.add(user2);
        list.add(user3);

        // 객체 직렬화 파일 생성
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("/tmp/userlist.dat"));

        // writeObject(객체) : 매개변수로 파일에 쓰고자하는 객체 전달
        // tmp/userlist.dat에 list 인스턴스를 통째로 저장
        out.writeObject(list);
        out.close();
    }
}
