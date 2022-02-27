package ch10;

abstract class Car {
    public abstract void drive();
    public abstract void stop();

    public void startCar() {
        System.out.println("start Car");
    }

    public void turnOff() {
        System.out.println("turn off");
    }

    final public void run() {
        startCar();
        drive();
        stop();
        turnOff();
    }
}

class ManualCar extends Car {

    @Override
    public void drive() {
        System.out.println("Man drive");
        System.out.println("Man control handle");
    }

    @Override
    public void stop() {
        System.out.println("Step break to stop");
    }
}

class AICar extends Car {

    @Override
    public void drive() {
        System.out.println("Auto pilot");
        System.out.println("Car change direction by itself");
    }

    @Override
    public void stop() {
        System.out.println("Stop by itself");
    }

    public void goMars() {
        System.out.println("fly me to the Mars");
    }
}

public class CarTest {
    public static void main(String[] args) {
        Car aiCar = new AICar();
        aiCar.run();
        System.out.println("=======================");
        AICar aiCar1 = new AICar();
        aiCar1.run();
        aiCar1.goMars();
        System.out.println("=======================");
        Car manualCar = new ManualCar();
        manualCar.run();
    }
}
