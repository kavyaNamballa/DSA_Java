package generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList {
    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;
    public CustomArrayList(){
        this.data = new int[DEFAULT_SIZE];
    }
    public void add(int num){
        if(isFull()){
            resize();
        }
        data[size++] = num;
    }
    private boolean isFull(){
        return size==data.length;
    }
    private void resize(){
        int[] temp = new int[data.length*2];

        //copy the current items in the new array
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    public int remove(){
        int rem = data[size--];
        return rem;
    }
    public int get(int index){
        return data[index];
    }
    public int size(){
        return size;
    }
    public void set(int index,int val){
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
//        ArrayList li = new ArrayList();
        CustomArrayList list = new CustomArrayList();
        list.add(1);
        list.add(3);
        list.add(5);
        System.out.println(list);

        ArrayList<Integer> li = new ArrayList<>();
    }
}
