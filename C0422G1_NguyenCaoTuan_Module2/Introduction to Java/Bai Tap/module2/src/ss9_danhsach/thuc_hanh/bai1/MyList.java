package ss9_danhsach.thuc_hanh.bai1;
import java.util.Arrays;

public class MyList<I extends Number> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(Object e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
    }

    public Object get(int i) {
        if (i>= size || i <0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
        return (Object) elements[i];
    }


}
