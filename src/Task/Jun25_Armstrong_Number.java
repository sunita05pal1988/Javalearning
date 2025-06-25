package Task;

import java.util.Scanner;

public class Jun25_Armstrong_Number {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int original = num;
        int result = 0;

        //count of digits
        int digit = String.valueOf(num).length();

        //sum of digit raised to be power of number count
        while(num!=0) {
            int n = num % 10;
            result += Math.pow(n, digit);
            num /= 10;
        }
        if (original == result){
            System.out.println(result + "number is Armstrong");
        } else {
            System.out.println(result+ "number is not Armstrong");
        }

        }
    }


