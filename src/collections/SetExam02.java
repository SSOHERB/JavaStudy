package collections;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.Iterator;

public class SetExam02 {
    public static void main(String[] args) {
        Set<MyData> mySet = new HashSet<>();
        mySet.add(new MyData("kim", 500));
        mySet.add(new MyData("lee", 1500));
        mySet.add(new MyData("hong", 2000));
        mySet.add(new MyData("hong", 2000));

        // ## Iterator의 패턴은 항상 동일하므로 암기
        Iterator<MyData> iterator = mySet.iterator();
        while(iterator.hasNext()){
            MyData myData = iterator.next();
            System.out.println(myData);
        }
    }
}

// MyData
class MyData{
    private String name;
    private int value;

    public MyData(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    // 문자열 오버리이딩
    @Override
    public String toString() {
        return "MyData{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }

    // Hash 알고리즘(자동생성) : equals 및 hashCode 오버라이딩 : 반복 저장 방지
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyData myData = (MyData) o;
        return value == myData.value && Objects.equals(name, myData.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, value);
    }
}
