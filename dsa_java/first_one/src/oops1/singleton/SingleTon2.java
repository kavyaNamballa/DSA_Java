package oops1.singleton;

public class SingleTon2 {
    // The previous code will create multiple instances of Singleton class
    // if called by more than one thread in parallel(known as multithreading).
    //The primary solution to the current problem
    // will be to make getInstance() method synchronized.
    //Though it’s thread-safe and solves the issue of multiple instances,
    // it isn’t very efficient. You need to bear cost of synchronization
    // every time you call this method, while synchronization is only needed on first class,
    // when Singleton instance is created.
    // It is called double-checked locking because there are two checks for instance == null,
    // one without locking and other with locking (inside synchronized) block.
    private SingleTon2(){

    }
    private static SingleTon2 instance;
    public static SingleTon2 getInstance(){
        if(instance==null){

            instance = new SingleTon2();
        }
        return instance;
    }
}
