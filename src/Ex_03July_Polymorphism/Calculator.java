package Ex_03July_Polymorphism;

public class Calculator {
    public static void main(String[] args) {
        Calc c1= new Calc();
        c1.add(3,4);
        c1.add(3.422,5.646);
        System.out.println(c1.add(3, 4));
        System.out.println(c1.add(3.422,5.646));


    }
}
class Calc{
    int add(int a, int b){
        return a+b;
    }
    double add(double a, double b){
        return a+b;
    }
}