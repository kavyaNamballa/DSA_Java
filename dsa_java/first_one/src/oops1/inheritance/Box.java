package oops1.inheritance;

public class Box {
    double l;
//    private l;
    double h;
    double w;
    Box(){
//        super(); // calls the object class constructor
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }
    //cube
    Box(double side){
        this.h = side;
        this.l = side;
        this.w = side;
    }
    Box(double l,double h,double w){
        this.l = l;
        this.h = h;
        this.w = w;
    }
    Box(Box old){
        this.l = old.l;
        this.h = old.h;
        this.w = old.w;
    }
    public static void info(){
        System.out.println("Running box");
    }
}
