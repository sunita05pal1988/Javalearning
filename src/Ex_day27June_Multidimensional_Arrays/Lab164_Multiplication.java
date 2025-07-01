package Ex_day27June_Multidimensional_Arrays;

import java.util.Scanner;

public class Lab164_Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();

        for(int i =0; i< n; i++){
            for(int j=0; j<n; j++){
                System.out.print(i*j);
            }
            System.out.println(" ");
        }
    }
}
