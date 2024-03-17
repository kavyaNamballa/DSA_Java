package oops1.abstractDemo;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(23);
        son.career();
        son.normal();

        Daughter daughter = new Daughter(22);
        //you can use parent class as ref although u cant create an obj for it
//        Parent daughter = new Daughter(33);
        daughter.career();
        daughter.normal();
        Parent.hello();
//        Parent mom = new Parent(32);
    }
}
