package Ex_04July_Super;

public class Lab193_SuperKeyword {
    public static void main(String[] args) {

    }
}

class Vehicle {
    public int maxSpeed = 180;

    Vehicle() {
        System.out.println("Default C");
    }

    Vehicle(int a){
        System.out.println("Param Con");
        System.out.println("Param Con" +a);
    }

    //Method Overloading - Same, same name function with different arguments
    void message(int a){
        System.out.println("Type 2");
    }

    void message(){
        System.out.println("Type 1");
    }

    int message(String a){
        System.out.println("Type 4");
        return 0;
    }

    void display(){
        System.out.println("Vehicle Parent");
    }


}

class Car extends Vehicle{
    private int maxSpeed = 281;

    public int getMaxSpeed(){
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed){
        this.maxSpeed = maxSpeed;
    }
    Car(int a) {
        super(10);  //parent's parameterized call
    }

    Car(){
        super();  //calling parents default
    }
        @Override
    void display(){
            System.out.println(super.maxSpeed);
            System.out.println(this.maxSpeed);
            System.out.println("Hi Override!");
        }
    }
