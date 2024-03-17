package oops1.polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Square square = new Square();
//        shape.area();
//        circle.area();
//        square.area();
        Shapes sqr = new Square();  //method overriding
        //if we remove area method in super class
//        sqr.area(); // it'll give error
        sqr.staticMethodOverride();
    }
}
