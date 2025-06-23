package Task;

import java.util.Scanner;

public class Jun23_Vowel_Consonant {
    public static void main(String[] args) {
        System.out.println("Enter the character");
        Scanner sc = new Scanner(System.in);

        char ch = sc.next().charAt(0);
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(ch + " is vowel");
            } else {
                System.out.println(ch + " is consonant");
            }
        } else {
            System.out.println("Invalid character");
        }

    }
}
