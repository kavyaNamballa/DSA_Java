package cloning;

// here as clonable interface has no methods in it why we need to implement this?
// the ans is it's a way to tell the jvm that we are performing clone on the object of type human
// if we dont implement this then we'll get clone not supported exception
public class Human implements Cloneable{
    int age;
    String name;
    int[] arr;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr = new int[]{3,4,5};
    }
//    public Human(Human other){
//        this.age = other.age;
//        this.name = other.name;
//    }
    @Override
    public Object clone() throws CloneNotSupportedException{
//        // this is a shallow copy
//        return super.clone();

        //this is a deep copy;
        Human twin = (Human)super.clone();
        twin.arr = new int[twin.arr.length];
        for (int i = 0; i < twin.arr.length; i++) {
            twin.arr[i] = this.arr[i];
        }
        return twin;
    }


}
