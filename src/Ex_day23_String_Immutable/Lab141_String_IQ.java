package Ex_day23_String_Immutable;

public class Lab141_String_IQ {
    public static void main(String[] args) {

        String s1 = "Hello";
        String s2 = "Hello";  //SCP ->1

        String s3 = new String("Hello");  //OA
        String s4 = new String("Hello");
        String s5 = new String("hello"); //OA = 3

        //== -> comparision -> String -> this check the location ref.
        System.out.println(s1==s3);
        System.out.println(s2==s3);
        System.out.println(s1==s4);
        System.out.println(s1==s5);
        System.out.println(s1==s2);

        //equals  (content) -> value

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
        System.out.println(s1.equals(s5));  //for case use equalsIgnoreCase
        System.out.println(s1.equalsIgnoreCase(s5));
    }
}
