package Task.July03.MethodOverloading;

//Add Two Numbers  - Title: Overload a method to add different types of number
public class Calculator {
    public static void main(String[] args) {
        Calc2 m1= new Calc2();
        System.out.println(m1.add(3,10));
        System.out.println(m1.add(3.34,10.43));

    }
}

class Calc2{
   int add(int a, int b) {
       return a + b;
   }
    double add(double a, double b) {
        return a + b;
    }
}

