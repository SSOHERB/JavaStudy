package io;

import java.io.Serializable;

public class User implements Serializable {
    /* 필드도 직렬화가 가능해야 한다.
       현재 email, name은 String, birthYear은 int형인데 이렇게 기본형 타입도 직렬화가 가능하다.
     */
    private String email;
    private String name;
    private int birthYear;

    public User(String email, String name, int birthYear) {
        this.email = email;
        this.name = name;
        this.birthYear = birthYear;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }
}
