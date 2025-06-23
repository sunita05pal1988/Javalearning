package Task;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Jun23_Age_Vote {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the age number");
        int age = sc.nextInt();
        if(age>=18){
            System.out.println("User can vote");
        }else {
            System.out.println("User can't vote");
        }
    }
}
