package oops1.inheritance;

public class Main {
    public static void main(String[] args) {
//        Box b1 = new Box();
//        Box b2 = new Box(3);
//        System.out.println(b1.l+" "+b1.h+" "+b1.w);
//        System.out.println(b2.l+" "+b2.h+" "+b2.w);
//
//        BoxWeight b3 = new BoxWeight();
//        System.out.println(b3.weight+" "+b3.h);// can access parent class attributes using child class attribute
//        BoxWeight b4 = new BoxWeight(2,3,4,8);
//        System.out.println(b4.l+" "+b4.h+" "+b4.w+" "+b4.weight);
//        Box b5 = new BoxWeight();
//        System.out.println(b5.l);
//        System.out.println(b5.weight); // error! b5 can only access Box class attributes
        // since the b6 is of type BoxWeight it can access only Boxweight class variables
        //but here since it's pointing to Box class only l,h,w attributes are initialized
        //so weight can't be initialized by this call, so it's error
//        BoxWeight b6 = new Box(2,3,4);
//        BoxWeight b7 = new BoxWeight(b4);
//        System.out.println(b7.weight);

//        BoxPrice b8 = new BoxPrice(2,3,4,5,10);
//        System.out.println(b8.l);

        BoxWeight b = new BoxWeight();
        b.info();

    }
}
