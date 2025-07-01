package Task;

import java.util.Scanner;

public class Jun25_Calculate_Employee_Salary {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the basic salary");
        double Salary = sc.nextDouble();

        if(Salary<=0){
            System.out.println("Invalid input: Salary must be greater than 0");
        } else
        {
            double hra = 0.25*Salary;
            double da= 0.15*Salary;
            double gross_salary = Salary+hra+da;
            double tax= 0.10*gross_salary;
            double netsalary = gross_salary-tax;

            System.out.println("Salary breakdown--------");
            System.out.println(hra);
            System.out.println(gross_salary);
            System.out.println(tax);
            System.out.println(netsalary);
        }
    }
}
