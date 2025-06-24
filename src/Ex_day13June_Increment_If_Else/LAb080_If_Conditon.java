package Ex_day13June_Increment_If_Else;

import java.util.Scanner;

public class LAb080_If_Conditon {
    public static void main(String[] args) {
        System.out.println("Enter the age");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if(age > 18){
        System.out.println("Allowed to vote"); }
    }
}
