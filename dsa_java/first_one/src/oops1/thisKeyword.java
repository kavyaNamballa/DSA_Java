package oops1;

import javax.xml.namespace.QName;

public class thisKeyword {
    public static void main(String[] args) {
        Student kunal = new Student(12,"kav",34.4f);

        kunal.greeting();
    }
}
class Student{
    int rno;
    String name;
    float marks;
    void greeting(){
        String name = "kavya";
        System.out.println("my name is: "+this.name); //means kunal.name which is null
        System.out.println("name is: "+name);
    }
    Student(int rno,String name,float marks){
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }
}
