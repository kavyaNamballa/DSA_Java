package oops1.access;

public class ObjectClass {
    int num;
    float gpa;
    public ObjectClass(int num,float gpa) {
        this.num = num;
        this.gpa = gpa;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return this.num == ((ObjectClass)obj).num;
//        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public static void main(String[] args) {
        ObjectClass obj = new ObjectClass(34,56.8f);
        ObjectClass obj2 = new ObjectClass(34,78.4f);
        ObjectClass obj3 = obj2;
        if(obj == obj2){   // a comparator
            System.out.println("obj1 is equal to obj2");
        }
        else{
            System.out.println("Not equal");
        }
        if(obj.equals(obj2)){  // a method
            System.out.println("obj1 is equal to obj2");
        }
        // hashCode takes an object and put some algorithm on it and generates random unique number
        System.out.println(obj.hashCode());
        System.out.println(obj2.hashCode());
        System.out.println(obj3.hashCode());
    }
}
