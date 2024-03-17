package oops1.interfaces;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
//        Engine car = new Car();
//        car.a;
//        System.out.println(car.price);
//
//        car.acc();
//        car.stop();
//        car.start();
//        Media carMedia = new Car();
//        carMedia.stop();

        NiceCar car2 = new NiceCar();
        car2.start();
        car2.startMusic();

        car2.upgradeEngine();

        car2.start();
    }
}
