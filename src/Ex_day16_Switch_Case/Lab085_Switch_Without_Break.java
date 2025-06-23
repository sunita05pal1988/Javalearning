package Ex_day16_Switch_Case;

import java.util.Scanner;

public class Lab085_Switch_Without_Break {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day number");
        int day = scanner.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday");
            case 2:
                System.out.println("Tuesday");
            case 3:
                System.out.println("WEdnesday");
            case 4:
                System.out.println("Thursday");
                case 5:
                System.out.println("Friday");
            case 6:
                System.out.println("Saturday");
            case 7:
                System.out.println("Sunday");
            default:
                System.out.println("Not Allowed");

        }

    }
}
