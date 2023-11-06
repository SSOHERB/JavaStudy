package io;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ObjectInputExam2 {
    public static void main(String[] args) throws Exception{
        // 파일 읽어오기
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("/tmp/userlist.dat"));

        // ObjectOutputStream을 ArrayList 형태로 받아왔기 때문에 형변환
        ArrayList<User> list = (ArrayList)in.readObject();
        in.close();

        // list의 길이만큼 반복하면서 원소 출력
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
