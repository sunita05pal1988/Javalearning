package Ex_01July_Constuctor;

public class Lab173_OOPs_Constructor {
    public static void main(String[] args) {
        Baby b1 = new Baby();
        b1.cry();
        b1.eat();
        b1.sleep();

    }
}
class Baby{
    //Attribute | Instance Variable | Member varibles, data members
    String name;

    //Default Constructor!
    Baby() {
        System.out.println("I am called Default Constructor");
        System.out.println("Your aadhar number is ready!");

        //fetch data from MySQL database..
        //Read from CSV File, XLXs
        // Open a file and read the data (json, testdata.xlxs txt file)
    }

    void m1(){
        System.out.println("I m1");
    }

    //Behaviour
    void cry(){
        System.out.println("Cry!");
    }

    void sleep(){
        System.out.println("Sleep");
    }

    void eat(){
        System.out.println("Eat!");
    }
}