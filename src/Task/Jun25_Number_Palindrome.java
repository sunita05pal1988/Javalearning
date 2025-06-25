package Task;

import java.util.Scanner;

// Check if a Number is a Palindrome.
public class Jun25_Number_Palindrome {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number to check palindrome");
        int num = sc.nextInt();
        int original = num;
        int rev = 0;

        while(num!=0){
            int n = num%10;
            rev = rev*10+n;
            num=num/10;
        }
        if(original==rev){
            System.out.println(rev +"  Number is palindrome");
        } else {
            System.out.println(rev +"  Number is  not palindrome");
        }

    }

}
