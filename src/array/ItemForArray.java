package array;

// ## 불변 클래스
public class ItemForArray {
    private int price;
    private String name;

    // 생성자 : 값 초기화
    public ItemForArray(int price, String name){
        this.price = price;
        this.name = name;
    }

    public int getPrice(){
        return price;
    }
    public String getName(){
        return name;
    }
}
