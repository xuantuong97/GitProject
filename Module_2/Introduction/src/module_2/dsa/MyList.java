package module_2.dsa;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private final int DEFAULT_CAPACITY = 10;
    private Object []elements;

    public MyList(){
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity){
        elements = new Object[capacity];
    }

    public int size(){
        return size;
    }

    public Object[] clone(){
        Object[] arrNew = new Object[size];
        for (int i = 0; i<size; i++){
            arrNew[i] = elements[i];
        }
        return arrNew;
    }

    public boolean contains(E o){
        boolean isContains = false;
        for (int i = 0; i < size; i++){
            if (o.equals(elements[i])){
                isContains = true;
                break;
            }
        }
        return isContains;
    }

    public int indexOf(E o){
        int index = -1;
        for (int i = 0; i < size; i++){
            if (o.equals(elements[i])){
                index = i;
                break;
            }
        }
        return index;
    }

    public void  remove(int index){
        if (index < 0 || index > size - 1){
            System.out.println("Index is not valid");
        }
        else {
            for(int i = index; i < size-1; i++){
                elements[i] = elements[i+1];
            }

        elements[size-1] = null;
        size--;
        }
    }

    private void ensureCap(int minCap){
        int newSize = elements.length + minCap;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(int index, E element){
        if (size == elements.length){
            ensureCap(1);
        }
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Not valid index");
        }
        else {
            for (int i = size; i > index; i--){
                elements[i] = elements[i-1];
                elements[i-1] = element;
            }
            size++;
        }
    }

    public boolean add (E e){
        if (size == elements.length){
            ensureCap(1);
        }
        elements[size++] = e;
        return true;
    }

    public E get (int i){
        if (i < 0 || i > size - 1){
            return null;
        }
        return (E) elements[i];
    }

    public void clear(){
        for (int i = 0; i<size; i++){
            elements[i] = null;
        }
        size = 0;
    }
}
