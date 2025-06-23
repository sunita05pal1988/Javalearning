package Ex_day13_Increment_If_Else;

public class Lab075_Exp1 {
    public static void main(String[] args) {
         int a =10;
        System.out.println(a++ + ++a);
        System.out.println(a);

        // a++ -> A -> ExpA -> 10, a -> 11
        //+
        //++a -> B -> ExpB -> 12, a->12

    }
}
