package oops1.polymorphism;

public class Numbers {
    // same function definition but different body-->method overloading
    double sum(double a,double b){
        return a+b;
    }
    double sum(int a,int b){
        return a+b;
    }

    public static void main(String[] args) {
        Numbers obj = new Numbers();
        System.out.println(obj.sum(3,5));
        obj.sum(3.4,0);
    }
}
