package io;

import java.sql.Array;
import java.util.ArrayList;

// ########################## 객체 직렬화가 필요한 이유 ##########################
public class ObjectInputOutExam {
    public static void main(String[] args) {
        // User 타입 객체 생성
        User user1 = new User("hong@hanmail.net", "Hong", 1992);
        User user2 = new User("go@hanmail.net", "Go", 1993);
        User user3 = new User("pak@hanmail.net", "Pak", 1994);

        ArrayList<User> list = new ArrayList<>();
        list.add(user1);
        list.add(user2);
        list.add(user3);

        /* 새로 생성한 list2는 list를 참조한다.
           따라서 list와 list2는 같은 ArrayList를 참조한다.
           복사가 아니라같은 곳을 바라본다.
         */
        ArrayList<User> list2 = list;
        for(int i = 0; i < list2.size(); i++){
            System.out.println(list2.get(i));
        }

        // ## list2는 list를 복사한 것인지 확인
        list.remove(2);
        System.out.println(list.size());
        System.out.println(list2.size());

        /* list3을 ArrayList 헝태로 새로운 인스턴스
           list3에 list 원소들을 하나씩 추가
           -> ArrayList 형태로 인스턴스를 생성했지만, list와 list3는 결국 같은 User를 참조한다.
         */
        ArrayList<User> list3 = new ArrayList<>();
        for(int i = 0; i < list.size(); i++){
            list3.add(list.get(i));
        }

        list.remove(1);
        System.out.println(list.size());
        System.out.println(list3.size());
    }
}
