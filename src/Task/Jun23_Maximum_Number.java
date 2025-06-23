package Task;

import java.util.Scanner;

public class Jun23_Maximum_Number {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scanner.nextInt();
        System.out.println("Enter the 2nd number");
        int num1 = scanner.nextInt();

        if(num>num1){
            System.out.println("Num is maximum number");
        } else {
            System.out.println("Num1 is maximum number");

        }
    }
}

