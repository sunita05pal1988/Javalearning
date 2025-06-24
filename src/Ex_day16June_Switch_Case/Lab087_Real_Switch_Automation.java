package Ex_day16June_Switch_Case;

import java.util.Scanner;

public class Lab087_Real_Switch_Automation {
    public static void main(String[] args) {
        //Web Automation
        // I will ask the user to give me the input from browser which he want to use to start in that browser

       // String browser = args[0];
       // System.out.println(browser);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the browser, which you want to start!");
        String browser = scanner.next();
browser = browser.toLowerCase();


        switch (browser) {
            case "chrome":
                System.out.println("starting the chrome");
                System.out.println("TC1");
                System.out.println("TC2");
                System.out.println("TC3");
                break;

            case "firefox":
                System.out.println("starting the firefox");
                System.out.println("Tc1");
                System.out.println("TC2");
                break;

            case "edge":
                System.out.println("starting the edge");
                System.out.println("Tc1");
                System.out.println("TC2");
                break;

            default:
                System.out.println("I have no idea about this browser");
        }


    }
}
