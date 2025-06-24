package Ex_day12June_TypeCasting_Ternary;

public class Lab064_TO {
    public static void main(String[] args) {
        //Find the max number using ternary operator
        int x = 10;
        int y =20;
       // System.out.println(Math.max(x,y)); predefined function
        int max = x > y? x:y;
        System.out.println(max);
    }
}
