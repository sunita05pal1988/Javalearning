package Task;

import java.util.Scanner;

public class Jun24_Smallest_Number_Bw_3 {

    public static void main(String[] args) {
        //8) Find the Smallest of Three Numbers.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number");
        int s1 = sc.nextInt();
        System.out.println("Enter the 2nd number");
        int s2 = sc.nextInt();
        System.out.println("Enter the 3rd number");
        int s3 = sc.nextInt();

        if (s1 < s2 && s1 < s3) {
            System.out.println("s1 is smallest number");
        } else if (s2 < s3 && s2 < s1) {
            System.out.println("s2 is smallest number");
        } else {
            System.out.println("s3 is smallest number");
        }
    }}
