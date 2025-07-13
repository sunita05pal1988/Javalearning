package Ex_07_Abstraction_Interface;

public class Lab199_Car_Practicle_Interface {
    public static void main(String[] args) {
        Car1 tesla = new Car1();
        tesla.drive();

    }
}

class Car1 implements Engine1, Brakes{

    void drive(){
        startEngine();
        applyBreak();
        stopEngine();
        money();

    }

    @Override
    public void applyBreak(){
        System.out.println("Apply Break");
    }

    @Override
    public void startEngine(){
        System.out.println("Starting the engine");
    }

    @Override
    public void stopEngine(){
        System.out.println("Stop the engine");
    }

    @Override
    public void money(){
        System.out.println("Son has to earn by itself!");
    }
}


interface Brakes {
    void applyBreak();
    void money();
}

interface Engine1{
    void startEngine();
    void money();
    void stopEngine();

    default void completeF1(){
        System.out.println("Default complete function!");
    }
}