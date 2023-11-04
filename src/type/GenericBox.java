package type;

// 아직 정해지지않은 Type<약자 T>
public class GenericBox<T> {
    // 변수 t의 Type은 정해지지 않음
    private T t;
    public void add(T obj){
        this.t = obj;
    }
    public T get(){
        return this.t;
    }
}
