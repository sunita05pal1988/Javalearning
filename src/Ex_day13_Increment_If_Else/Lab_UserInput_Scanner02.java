package Ex_day13_Increment_If_Else;

import java.util.Scanner;

public class Lab_UserInput_Scanner02 {
    public static void main(String[] args) {
        System.out.println("Enter the String");
        Scanner scanner = new Scanner(System.in);

        System.out.println(scanner.next());


        System.out.println("Enter the Int");
        int int_input = scanner.nextInt();

        System.out.println("Enter the double");
        double double_input =scanner.nextDouble();
        System.out.println(double_input);


    }
}
