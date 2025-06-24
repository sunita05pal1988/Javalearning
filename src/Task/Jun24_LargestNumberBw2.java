package Task;

import java.util.Scanner;

public class Jun24_LargestNumberBw2 {
    public static void main(String[] args) {
        //8) Find the Largest of Two Numbers.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number");
        int s1 = sc.nextInt();
        System.out.println("Enter the 2nd number");
        int s2 = sc.nextInt();


        if(s1>s2){
            System.out.println("s1 is largest number");
        }
        else {
            System.out.println("s2 is largest number");
        }


    }}
