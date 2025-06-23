package Ex_day19_Test;

public class Increment {
    //Create a program to show the difference between ++i and i++.

    public static void main(String[] args) {
        int i = 4;
        System.out.println(i++);
        System.out.println("print value after i++ : " + i);
        i= 5;
        System.out.println(++i);
        System.out.println("print value after ++i : " +i);
    }
}
