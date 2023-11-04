package io;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 파일에서 List<User> 정보를 저장 or 읽어오는 기능
 */
public class UserDao {
    private String filename;

    // A. 파일 가져오기
    public UserDao(String filename) {
        this.filename = filename;
    }

    // B. User를 받아들여서 저장
    public void saveUser(List<User> list) {
        // 객체를 파일에 쓴다 -> 직렬화
        // 파일 객체 생성
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
            // ObjectOutputStream의 메소드, 매개변수로 파일에 쓰고자하는 객체 전달
            out.writeObject(list);
        } catch (Exception ex) {
            // Exception 발생시 메시지 출력
            ex.printStackTrace();
        }
    }

    // C. 파일로부터 User 정보를 읽어오기
    public List<User> getUser() {
        File file = new File(filename);

        // C-1. 파일있는지 확인 -> 없으면 빈 List로 리턴
        if (!file.exists()) {
            return new ArrayList<>();
        }

        // C-2. 파일이 존재할 경우, List 자체로 읽어 들임 -> list 변수에 담아 리턴
        List<User> list = null;
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
            // readObject로 파일 읽기 -> List형태로 형변환
            list = (List<User>) in.readObject();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return list;
    }
}
