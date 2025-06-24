package Ex_day16June_Switch_Case;

import java.util.Scanner;

public class Lab086_Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day");
        int day = scanner.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("tuseday");
                break;
        }

    }
}
