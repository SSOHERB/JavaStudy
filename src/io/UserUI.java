package io;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.List;

/**
 * 메뉴,
 * 회원 등록,
 * 회원 리스트 출력
 */
public class UserUI {
    // 키보드로 부터 입력받는 객체
    private BufferedReader br;
    public UserUI(){
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    // A. 메뉴 입,출력
    public int menu(){
        System.out.println("1. 회원 등록");
        System.out.println("2. 회원 목록 보기");
        System.out.println("3. 회원 정보 수정하기");
        System.out.println("4. 회원 정보 삭제");
        System.out.println("5. 종료");

        int menuId = -1;
        try{
            // 사용자에게 한줄 입력 받음
            String line = br.readLine();

            // 입력받은 한줄은 정수로 변환하여 menuId에 담기
            menuId = Integer.parseInt(line);
        } catch (Exception ex){
            ex.printStackTrace();
        }
        return menuId;
    }

    // D-1. 메뉴 3번 입,출력 및 email 입력 받기
    public String inputEmail(){
        System.out.println("수정할 회원의 email을 입력하세요.");
        String email = "";
        try{
            // email 입력 받기
            email = br.readLine();
        } catch(Exception ex){
            ex.printStackTrace();
        }
        return email;
    }

    // D-2. 수정 기능 : 이름(name) 및 생년(birthYear) 입력 받기
    public User inputUser(String email){
        try{
            System.out.println(email + "회원 정보를 수정합니다.");
            System.out.println("이름을 입력하세요.");
            String name = br.readLine();
            System.out.println("생년을 입력하세요.");
            String strBirth = br.readLine();
            int birthYear = Integer.parseInt(strBirth); // string => int 형변환

            // email, name, birth를 입력받은 후, user 인스턴스로 리턴
            User user = new User(email, name, birthYear);
            return user;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    // B. 회원 등록
    public User regUser() {
        try{
            System.out.println("email를 입력");
            String email = br.readLine();

            System.out.println("이름 입력");
            String name = br.readLine();

            System.out.println("생년 입력");
            String strBirth = br.readLine();
            int birthYear = Integer.parseInt(strBirth);

            // email, name, birth를 입력받은 후, 인스턴스로 리턴
            User user = new User(email, name, birthYear);
            return user;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    // C. 회원 리스트 출력 : User를 입력받아서 사이즈만큼 출력
    public void printUserList(Iterator<User> iter){
        System.out.println("email         name          birth");
        System.out.println("=================================");

        /*for(int i = 0; i < users.size(); i++){
            // get(index) : user는 List 타입이므로 값 얻기
            User user = users.get(i);
            System.out.print(user.getEmail());
            System.out.print("         ");
            System.out.print(user.getName());
            System.out.print("         ");
            System.out.print(user.getBirthYear());
            System.out.println();
        }*/

        // List => Iterator로 변경되어서 반복문도 변경
        while (iter.hasNext()){
            User user = iter.next();
            System.out.print(user.getEmail());
            System.out.print("         ");
            System.out.print(user.getName());
            System.out.print("         ");
            System.out.print(user.getBirthYear());
            System.out.println();
        }
    }
}
