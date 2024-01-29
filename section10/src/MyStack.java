
import java.util.LinkedList;

public class MyStack<T> {

    private LinkedList<T> list;

    public MyStack() {
        list = new LinkedList<>();

    }

    public void add(T data) {
        list.add(data);
    }

    public T get() {
        return list.pop(); // peek, pop : 가져오면서 삭제
    }
}
