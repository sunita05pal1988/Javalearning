package Ex_day27June_Multidimensional_Arrays;

import java.util.Scanner;

public class Lab163_Right_Triangle {
    public static void main(String[] args) {

        //how the pattern for star *
        //
        System.out.println("Enter the number");
        Scanner scan = new Scanner(System.in);
        int n =scan.nextInt();
        for(int i =0;i<n; i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
