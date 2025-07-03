package Ex_02July_Inheritance.single_inheritance;



public class Lab180_Inheritance {
    public static void main(String[] args) {
        Father f1 = new Father();
        System.out.println(f1.gold_f);
        f1.bhk2();

        Son s1= new Son();
        System.out.println(s1.gold_f);
        s1.bhk2();
        s1.bhk3();
    }
}
class Father{
    int gold_f = 1000;
    void bhk2(){
        System.out.println("Father - 2bhk");
    }
}
class Son extends Father {
    //int gold_f = 1000; //Attribute | Data Varibles |Property | Instance Varibles
    //void bhk2{// Behaviour |Method | Function | Data members
    // System.out.println("Father - 2bhk")
    //}

    void bhk3(){

        System.out.println("3bhk Son");
    }
}