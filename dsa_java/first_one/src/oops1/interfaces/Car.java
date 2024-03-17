package oops1.interfaces;

public class Car implements Engine,Brake,Media{
    int a;

    @Override
    public void start() {
        System.out.println("I start engine like a normal car");
    }

    @Override
    public void stop() {
        System.out.println("I stop engine like a normal car");
    }

    @Override
    public void acc() {
        System.out.println("I accelerate like a normal car");
    }

    @Override
    public void brake() {
        System.out.println("I break like a normal car");
    }
}
