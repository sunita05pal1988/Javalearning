package Ex_03July_Polymorphism;

public class Lab187_Poly_MethodOverloading {
    public static void main(String[] args) {
        MathOperations math = new MathOperations();
        int r1 = math.add(3,4);
        System.out.println(math.add(3,4));
        int r2 =math.add(3,4,6);
        double r3 = math.add(3.55,5.45);
        String r4 = math.add("pramod","dutta");


    }
}
class MathOperations{
    //In the same class, when you have a method with same
    //Same name methods but different arguments and different return type

    int add(int a, int b){
        return a+b;
    }

    int add(int a, int b, int c){
        return a+b+c;
    }

    double add(double a, double b){
        return a+b;
    }

    String add(String a, String b){
        return a+b;
    }
}
