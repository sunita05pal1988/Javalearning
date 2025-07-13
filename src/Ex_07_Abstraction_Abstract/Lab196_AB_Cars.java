package Ex_07_Abstraction_Abstract;

public class Lab196_AB_Cars {
    public static void main(String[] args) {
        WagonR car = new WagonR();
        car.drive();
        //Engine e1 = new Engine();

    }
}


abstract class GearManagement{
    abstract void gearSet();
}

abstract class Engine{
    abstract void startEngine();

    abstract void stopEngine();

    void checkEngine(){
        System.out.println("Everything is good!");
    }
}

class WagonR extends Engine{
     @Override
    void startEngine(){
         System.out.println("Starting the car!");
     }
     @Override
    void stopEngine(){
         System.out.println("Stopping the car!");
     }

     void drive(){
         checkEngine();
         startEngine();
         stopEngine();
     }

}