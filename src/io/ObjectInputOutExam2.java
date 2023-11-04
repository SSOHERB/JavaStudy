package io;

import io.User;

import java.io.*;
import java.util.ArrayList;

/*  ########################## 객체 직렬화가 필요한 이유 ##########################
    객체 직렬화를 통해서 객체를 복사한 예제 (deep copy)
 */
public class ObjectInputOutExam2 {
    public static void main(String[] args) throws Exception{
        // User 타입 객체 생성
        User user1 = new User("hong@hanmail.net", "Hong", 1992);
        User user2 = new User("go@hanmail.net", "Go", 1993);
        User user3 = new User("pak@hanmail.net", "Pak", 1994);

        ArrayList<User> list = new ArrayList<>();
        list.add(user1);
        list.add(user2);
        list.add(user3);

        // ############ 직렬화 ############
        /*
            byte 배열에 데이터를 입출력하는데 사용(메모리에 쓰임)
            직렬화 부분을 선택하여 메소드형태로 전환(Refactor -> Extract Method)
         */
        ArrayList<User> list2 = copy(list);

        // list 인덱스 1개를 지워도 list2는 복사했기 때문에 사이즈는 그대로
        list.remove(2);
        for(int i = 0; i < list2.size(); i++){
            System.out.println(list2.get(i));
        }
    }

    // 기존 ArrayList를 받아들여서 copy하는 메소드를 만듦
    private static ArrayList<User> copy(ArrayList<User> list) throws IOException, ClassNotFoundException {
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(bout);
        // list 직렬화해서 파일에 저장
        out.writeObject(list);

        // 선언한 것의 반대 순으로 닫기
        out.close();
        bout.close();

        // list가 직렬화가 되어 메모리상에서 byte배열이 됨
        byte[] array = bout.toByteArray();

        // ############ 직렬화된것을 읽는 방법 ############
        // 직렬화 만든 형태(byteArray)로 읽어야 함
        ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(array));
        // 형변환 후 읽기
        ArrayList<User> list2 = (ArrayList)in.readObject();
        in.close();
        return list2;
    }
}
