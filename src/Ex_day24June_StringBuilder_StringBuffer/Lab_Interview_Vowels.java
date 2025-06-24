package Ex_day24June_StringBuilder_StringBuffer;

import org.w3c.dom.ls.LSOutput;

public class Lab_Interview_Vowels {
    public static void main(String[] args) {

        //Java Program to count vowels and consonants
        //pramod -> a,e,i,o,u ->  2 vowels, consonants -> 4

        String input = "Java Program to count vowels and consonants ";
        int vowels = 0;
        int consonants = 0;

        input = input.toLowerCase();
        System.out.println(input);

        for(int i =0; i < input.length(); i++){
            char ch =input.charAt(i);
            if(ch == 'a' || ch=='e'||ch=='i'||ch=='o'||ch=='u') {
                vowels++;
            }else{
                consonants++;
            }

            }
        System.out.println("Numbers of vowels:  " +vowels);
        System.out.println("Numbers of consonants:  " +consonants);
        }


    }
