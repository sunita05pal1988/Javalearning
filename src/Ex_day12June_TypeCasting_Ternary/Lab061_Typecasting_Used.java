package Ex_day12June_TypeCasting_Ternary;

public class Lab061_Typecasting_Used {
    public static void main(String[] args) {
        int course = 100;
        float GST = 18.45f;
        int total1 = course + (int)GST;
        System.out.println(total1);

        float total2 = course+(float)GST;
        System.out.println(total2);
        float total3 = course+GST;
        System.out.println(total3);

    }
}
