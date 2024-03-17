package oops1.polymorphism;

public class Square extends Shapes{
    @Override
    public void area(){
        System.out.println("Area of Square l * b");
    }
//    @Override
    // static methods can' be overridden
    public static void staticMethodOverride(){
        System.out.println("Static method in sub class");
    }
}
