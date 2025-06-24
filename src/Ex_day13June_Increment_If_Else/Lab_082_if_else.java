package Ex_day13June_Increment_If_Else;

import java.util.Scanner;

public class Lab_082_if_else {
    public static void main(String[] args) {
        //Allowed to vote or not
      //  If age > 18 > allowed to vote
        // else age <  18 not allowed to vote

        //int age = Integer.parseInt(args[0])

        System.out.println("Enter the age");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if(age <18){
            System.out.println("Not allowed to vote!");
        }
        else{
            System.out.println("allowed to vote!");
        }
    }
}
