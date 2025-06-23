package Ex_day12_TypeCasting_Ternary;

public class Lab067_Nested_Ternary {
    public static void main(String[] args) {
        int age = 39;
        //age > 18 -> Adult
        //age < 18 -> minor
        // age > 65 - >Senior
String result = (age < 18) ? "Minor" : (age < 65 ) ? "Adult" : "Senior";
        System.out.println(result);
    }
}
