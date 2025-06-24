package Ex_day12June_TypeCasting_Ternary;

public class Lab068_To_Three_Max {
    public static void main(String[] args) {
        //find the maximum number bt 3 number
        // Now we will be using the logic building formula
        //Step 1: find input /output
        // I/O -> n1,n2,n3 - int
        // O/P -> String -> max munber

        //Step 2 - Rough logic, Think about
        //n1> n2 && n1 > n3 - > n1 is max
        // n2 > n3 && n2 > n1  -> n2 is max
        // n3 is max

       // Step 3
        int n1 =33;
        int n2 = 44;
        int n3 = 5;
       int max = (n1> n2) ?  (n1 > n3) ? n1 : n3 : (n2 > n3)? n2: n3;
        System.out.println(max);
    }
}
