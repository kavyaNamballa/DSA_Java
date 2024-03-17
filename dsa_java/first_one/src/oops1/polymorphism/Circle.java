package oops1.polymorphism;

public class Circle extends Shapes{
    @Override // this is an annotation for checking whether the method is overridden or not
    public void area(){
        System.out.println("Area of circle pi * r * r");
    }
}
