package Ex_day17June_Loop_While;

import java.util.Scanner;

public class Lab122_While_IQ_FActorial {
    public static void main(String[] args) {
       //Factorial program
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number for factorial");
        if(!scanner.hasNextInt()){
            System.out.println("Enter the integer");
            return;
        }
        int num = scanner.nextInt();
        int factorial = 1;
        if(num<0){
            System.out.println("Negative Factorial is not allowed");
            return;
        }
        if(num <=0){
            System.out.println(factorial);
        }else{
            for (int i=1;i<=num; i++){
                factorial =factorial*i;
            }
        }
        System.out.println("Factorial is ->"  + factorial);


    }
}
