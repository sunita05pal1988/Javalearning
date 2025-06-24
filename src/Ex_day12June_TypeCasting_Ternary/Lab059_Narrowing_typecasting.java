package Ex_day12June_TypeCasting_Ternary;

public class Lab059_Narrowing_typecasting {
    public static void main(String[] args) {
        int val = 300;
        //byte b = val;  Narrowing (int > byte) - Implicit casting is not allowed
        byte b1= (byte)val; // Narrowing (int > byte) - Explicit casting is allowed
        //data loss
        System.out.println(b1);
    }
}
