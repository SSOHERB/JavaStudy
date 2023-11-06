package io;

import java.util.Iterator;
import java.util.List;

public interface UserService {
    // 1. 회원정보 등록
    public void addUser(User user);

    // 2. 회원정보 수정 (user.getEmail)
    // 회원정보 찾기 성공(true), 실패(false)
    public boolean updateUser(User user);

    // 3. 회원정보 삭제
    public boolean deleteUser(String email);

    // 4. 모든 회원정보 반환 (List 형태)
    public Iterator<User> getUsers();

    // 5. email 해당하는 회원정보가 있을 경우 boolean으로 리턴
    public boolean exists(String email);
}
