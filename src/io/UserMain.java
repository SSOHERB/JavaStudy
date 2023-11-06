package io;

import java.util.List;

/*
    사용자로부터 메뉴를 입력받고 실행한다.
 */
public class UserMain {
    public static void main(String[] args) {
        // A. UserUI :: 회원이 직접 사용하는 메뉴
        UserUI userUI = new UserUI();

        // B. UserDao :: 회원 정보 저장 및 파일 읽기(".dat 형식")
        UserDao userDao = new UserDao("/tmp/users.dat");

        // B-1. 파일에 있는 회원 목록 얻기
        // List<User> users = userDao.getUser();
        UserService userService = new UserServiceInMemory(userDao.getUser());

        // A-1. UserUI의 menu 선택 (무한반복)
        while (true){
            int menuId = userUI.menu();
            if(menuId == 5){ // 저장 후 종료
                System.out.println("종료");
                // Iterator로 입력(saveUser) => 반환(getUsers)
                userDao.saveUser(userService.getUsers());
                break;
            } else if(menuId == 1){ // 1. 회원등록
                User user = userUI.regUser();
                // 파일에 있는 기존 회원 목록에 새로 등록된 user 추가
                userService.addUser(user);
                System.out.println("등록 완료");
            } else if(menuId == 2){ // 2. 회원 목록 보기
                userUI.printUserList(userService.getUsers());
            } else if(menuId == 3){ // 3. 회원정보 수정
                String email = userUI.inputEmail();
                boolean isFindEmail = userService.exists(email);

                // 3-1. 회원 정보에 email이 있을 경우 or 없을 경우
                if(isFindEmail){ // A. 회원정보에 email있을 경우
                    // A-a. 이름(name) 및 생년(birthYear) 입력 받기
                    User updateUser = userUI.inputUser(email);

                    // A-b. 이메일 찾을 경우, userService의 수정 기능
                    userService.updateUser(updateUser);
                    System.out.println("수정되었습니다.");

                } else{ // B. 회원정보에 email을 찾기 못할 경우
                    System.out.println("수정할 회원 정보가 없습니다.");
                }
            } else if (menuId == 4) { // 4. 회원정보 삭제
                String email = userUI.inputEmail();
                boolean isFindEmail = userService.exists(email);

                // 4-1. 회원 정보에 email이 있을 경우 or 없을 경우
                if(isFindEmail){
                    userService.deleteUser(email);
                    System.out.println("삭제되었습니다.");
                } else{
                    System.out.println("삭제할 회원 정보가 없습니다.");
                }
            }
        }
    }
}
