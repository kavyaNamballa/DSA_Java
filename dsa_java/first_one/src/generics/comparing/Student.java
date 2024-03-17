package generics.comparing;

import java.util.Arrays;
import java.util.Comparator;

public class Student implements Comparable<Student>{
    int rno;
    float marks;

    public Student(int rno, float marks) {
        this.rno = rno;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student student) {
        System.out.println("In compareTo method");
        int dif = (int)(this.rno - student.rno);
        return dif;
    }

    @Override
    public String toString() {
        return rno + ", " + marks;
    }
}


class Main{
    public static void main(String[] args) {
        Student kavya = new Student(10,92.86f);
        Student rahul = new Student(5,90.7f);
        Student sachin = new Student(12,72.86f);
        Student dhoni = new Student(14,80.7f);
        Student kunal = new Student(18,82.86f);

        Student[] list = {kavya, kunal, sachin, dhoni, rahul};
        System.out.println(Arrays.toString(list));
        // it sorted it based on the marks because as we compared based on marks in compareTo method
        Arrays.sort(list);
        // if we compare as per roll numbers then it will be sorted based on rno's
        //if i don't add compareTo method then it'll return error
        Arrays.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return (int)(o1.marks - o2.marks);
            }
        });
        Arrays.sort(list, (o1, o2) -> (int)(o1.marks - o2.marks));
        System.out.println(Arrays.toString(list));
//        if(kavya.compareTo(rahul) > 0){
//            System.out.println("Kavya has more marks");
//        }
    }
}
