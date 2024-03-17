package oops1.inheritance;

public class BoxPrice extends BoxWeight{
    double cost;
    BoxPrice(){
//        super();
        // it'll automatically call parent cls constructor so no need to call super();
        this.cost = -1;
    }
    BoxPrice(BoxPrice other){
//        super(other);
        //no need because they are already initialized when the passed object is created in main file
        this.cost = other.cost;
    }

    public BoxPrice(double l, double h, double w, double weight, double cost) {
//        super(l, h, w, weight);
        // we need call the above super constructor to store l,h,w values in the parent cls attributes
        // otherwise box.l returns -1;
        this.cost = cost;
    }
}
