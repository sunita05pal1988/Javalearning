package Task.July03.MethodOverloading;

//Title: Multiply using overloaded methods
public class MultiplyNumbers {
    public static void main(String[] args) {
        Multiplication M1 = new Multiplication();
        System.out.println(M1.multi(12,4));
        System.out.println(M1.multi(10,3,4));

    }
}

class Multiplication {
    int multi( int a, int b){
        return a*b;
    }

    int multi(int a, int b, int c){
        return a*b*c;
    }
}
