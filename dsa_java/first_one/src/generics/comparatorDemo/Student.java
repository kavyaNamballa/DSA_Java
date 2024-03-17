package generics.comparatorDemo;

import java.util.Arrays;
import java.util.Comparator;

public class Student{
    int rno;
    float marks;
    String name;

    public Student(int rno, float marks,String name) {
        this.rno = rno;
        this.marks = marks;
        this.name = name;
    }

    @Override
    public String toString() {
        return rno+", "+marks;
    }

}

class rnoCompare implements Comparator<Student>{
    @Override
    public int compare(Student t0, Student t1) {
        return t0.rno-t1.rno;
    }
}
class marksCompare implements Comparator<Student>{
    @Override
    public int compare(Student t0, Student t1) {
        return (int)(t0.marks-t1.marks);
    }
}
class nameCompare implements Comparator<Student>{
    @Override
    public int compare(Student t0, Student t1) {
        return t0.name.compareTo(t1.name);
    }
}

class Main{
    public static void main(String[] args) {
        Student kavya = new Student(10,92.86f,"kavya");
        Student rahul = new Student(5,90.7f,"rahul");
        Student sachin = new Student(12,72.86f,"sachin");
        Student dhoni = new Student(14,80.7f,"dhoni");
        Student kunal = new Student(18,82.86f,"kunal");

        Student[] list = {kavya, kunal, sachin, dhoni, rahul};
        Arrays.sort(list,new rnoCompare());
        System.out.println(Arrays.toString(list));
        Arrays.sort(list,new marksCompare());
        System.out.println(Arrays.toString(list));
    }
}

