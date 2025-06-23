package Task;

import java.util.Scanner;

public class Jun23_Postive_Negative_Number {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scanner.nextInt();

        if(num>0){
            System.out.println("Number is positve");
        }else
        {
            System.out.println("Number is negative");
        }

    }
}
