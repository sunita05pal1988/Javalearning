package Ex_07_Abstraction_Abstract;

public class Lab195_Abstraction {
    public static void main(String[] args) {
        car c1 =new car();
        //Father f1 = new Father(); This is abstract in nature
        Child child =new Child();
        Father f2= new Child();  // Dynamic Dispatch
        child.loan50K();
    }

}

class car{
    //This is concreate class
    //this doesn't have the abstract methods
    void done(){

    }
}
abstract class Father{
    //This is called abstract function
    abstract void loan50K();
    // as a complete function
    void loan25K(){
        System.out.println("Given the 25k");
    }
}

class Child extends Father{
    @Override
    void loan50K(){
        System.out.println("Son has to give the 50K loan");
    }
}