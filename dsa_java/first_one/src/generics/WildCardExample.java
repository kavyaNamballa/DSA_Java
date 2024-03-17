package generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// here T should either be Number or its subclasses
public class WildCardExample<T extends Number> {
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;
    public WildCardExample(){
        this.data = new Object[DEFAULT_SIZE];
    }

    public void getList(List<? extends Number> li){ // this is wild card
        // do smthg
    }
    public void add(T num){
        if(isFull()){
            resize();
        }
        data[size++] = num;
    }
    private boolean isFull(){
        return size==data.length;
    }
    private void resize(){
        Object[] temp = new Object[data.length*2];

        //copy the current items in the new array
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    public T remove(){
        T rem = (T) data[size--];
        return rem;
    }
    public T get(int index){
        return (T)data[index];
    }
    public int size(){
        return size;
    }
    public void set(int index,T val){
        data[index] = val;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
////        ArrayList li = new ArrayList();
//        CustomGenArrayList list = new CustomGenArrayList();
//        list.add(1);
//        list.add(3);
//        list.add(5);
//        System.out.println(list);

        ArrayList<Integer> li = new ArrayList<>();
        // now since we bounded the type parameter, the generic type should extend the Number class
        // String type will give error
//        WildCardExample<String> li2 = new WildCardExample<>();
        WildCardExample<Integer> list3 = new WildCardExample<>();
        list3.add(45);
//        list3.add("ka");
        for (int i = 0; i < 14; i++) {
            list3.add(2*i);
        }
        System.out.println(list3);
    }
}
