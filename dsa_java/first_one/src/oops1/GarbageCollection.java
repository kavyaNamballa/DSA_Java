package oops1;

public class GarbageCollection {
    public static void main(String[] args) {
        A kunal = new A("kav");
        for (int i = 0; i < 1000000; i++) {
            kunal = new A("kaavvi");
        }
    }
}
class A{
    String name;
    int rno;

    @Override
    protected void finalize() throws Throwable {
        System.out.println("object destroyed");
    }
    A(String name){
        this.name = name;
    }
}
