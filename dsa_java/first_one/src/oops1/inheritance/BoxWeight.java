package oops1.inheritance;

public class BoxWeight extends Box{
    double weight;
    BoxWeight(){
        this.weight = -1;
    }
    BoxWeight(BoxWeight other){
        super(other);
        this.weight = other.weight;
    }
    BoxWeight(double l,double h,double w,double weight){
        //if any var of parent class is private we can't do like this
//        super.l = l;
//        super.h = h;
//        super.w = w;
        //so the other way is calling parent class constructor
        super(l,h,w);
        this.weight = weight;
    }

}
