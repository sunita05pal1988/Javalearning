package Ex_day27June_Multidimensional_Arrays;

import java.util.Scanner;

public class Lab165_Left_Triangle {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();

        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println( );
        }

    }
}
