package oops1;

public class StaticVar {
    public static void main(String[] args) {
        Human obj1 = new Human("kavya",19);
        Human obj2 = new Human("kaavvi",20);
        System.out.println(Human.population);
        //output will be 2 for above since we created two 2 humans till.
//        System.out.println(obj2.population);
    }
}
class Human{
    String name;
    int age;
    static long population;
    public Human(String name,int age){
        this.name = name;
        this.age = age;
        Human.population+=1;
    }
}
