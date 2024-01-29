package Section16;

public class DataList<T> {

    private Object[] data;
    private int size;
    private int defaultSize = 10;

    public DataList() {
        data = new Object[defaultSize];
    }

    public DataList(int size) {
        data = new Object[size];
    }

    public void add(T value) {
        data[size++] = value;
    }

    public T get(int index) {
        return (T)data[index];
    }

    public int size() {
        return size;
    }
}
