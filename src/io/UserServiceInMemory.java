package io;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// 메모리상에 User정보를 관리하는 클래스
public class UserServiceInMemory implements UserService {
    private List<User> users; // 불변객체

    // User 정보를 빈 ArrayList로 반환 or
    public UserServiceInMemory() {
        this.users = new ArrayList<>();
    }

    // 외부 User 정보를 받아들여서 users를 초기화
    public UserServiceInMemory(List<User> users){
        this.users = users;
    }

    // 1. 회원정보 등록 구현
    @Override
    public void addUser(User user) {
        users.add(user);
    }

    // 2. 회원정보 수정 (user.getEmail) 구현
    // email 존재 여부에 따라 회원정보 수정
    @Override
    public boolean updateUser(User user) {
        // 삭제 메소드 코드 활용 => boolean으로 반환
        boolean deleteFlag = deleteUser(user.getEmail());
        if(deleteFlag){
            users.add(user); // 삭제했을 경우
            return true;
        } else{
            return false; // 삭제 못했을 경우
        }
    }

    // 3. 회원정보 삭제 구현
    @Override
    public boolean deleteUser(String email) {
        // 불변 객체인 List users != 객체 user 값 비교
        int findIndex = findIndex(email);
        // 이메일 삭제했을 경우 true, 못했을 경우 false로 반환
        if(findIndex > -1){
            users.remove(findIndex);
            return true;
        } else {
            return false;
        }
    }

    // 4. 모든 회원정보 반환 (List 형태) 구현
    // Iterator로 반환하게 되면 내부에서만 수정가능
    @Override
    public Iterator<User> getUsers() {
        return users.iterator();
    }

    // 5. 이메일 존재 여부 확인
    @Override
    public boolean exists(String email) {
        if(findIndex(email) >= 0){
            return true;
        } else {
            return false;
        }
    }

    // private한 내부 메소드
    private int findIndex(String email) {
        int findIndex = -1;
        for(int i = 0; i < users.size(); i++){
            if(users.get(i).getEmail().equals(email)){
                findIndex = i;
                break;
            }
        }
        return findIndex;
    }
}
