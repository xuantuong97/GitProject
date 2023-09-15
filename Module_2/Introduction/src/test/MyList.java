package test;

import java.util.Arrays;

public class MyList<E> {
    private int size;
    private static final int DEFAULT_CAP = 10;
    private Object elements[];

    public MyList(){
        elements = new Object[DEFAULT_CAP];
    }

    private void ensureCap(){
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(E e){
        if (size == elements.length){
            ensureCap();
        }
        elements[size++] = e;
    }

    public E get(int i){
        if (i>= size || i <0){
            System.out.println("can't");
        }
        return (E) elements[i];
    }

}
