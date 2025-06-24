package Ex_day23June_String_Immutable;

import java.util.Scanner;

public class Lab144_IQ {
    public static void main(String[] args) {
        //Palindrome
        //madam -> reverse (madam) -> madam
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String");
        String s = scan.next();
        String rev = "";
        for( int i =s.length()-1; i>=0;i--) {
            rev = rev + s.charAt(i);
        }
        if(rev.equals(s)){
            System.out.println("Palindrome");
        }else{
            System.out.println("not palindrome");
        }
        }

       /* StringBuilder sb =new StringBuilder(s);
        sb.reverse();
        if(sb.equals(s)){
            System.out.println("Palindrome");
        }else{
            System.out.println("not palindrome");
        }
*/


    }

