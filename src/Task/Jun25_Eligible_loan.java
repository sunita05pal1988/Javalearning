package Task;

import javax.swing.*;
import java.util.Scanner;

public class Jun25_Eligible_loan {
/*Check if a Person is Eligible for a Loan (Based on Age, Salary, and Credit Score)
        * Take the below User info and store it into the variables:
    Age (integer)
    Salary (double or float)
    Credit Score (integer)
    Age Validation:
            :- Check if the age is a positive integer.
            :- Ensure the age is at least 18 years old.
            :- Max age can be 80.
    Salary Validation:
            :- Check if the salary is a positive number.
            :- Define a minimum salary threshold (e.g., 30,000).
    Credit Score Validation:
            :- Check if the credit score is a positive integer.
             :- Define a minimum credit score threshold (e.g., 650).
            :- Max credit score threshold (e.g., 850).
*/

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the age");
        int age = sc.nextInt();
        System.out.println("Enter the salary");
        double salary =sc.nextDouble();
        System.out.println("Enter the Credit Score");
        int credit = sc.nextInt();

        if(age <=0 || salary<=0 ||credit <=0){
            System.out.println("Invalid input, age, salary and credit score should be greater than 0");
        }else if (age <18 || age > 80){
            System.out.println("Invalid input: Age must be between 18 and 80");
        } else if(salary < 30000){
            System.out.println("Invalid salary: Salary must be greater than 30000");
        } else if (credit<300 || credit >900){
            System.out.println("Invalid credit score");
        } else {
            System.out.println("Person is eligible for loan");
        }
    }
    }
