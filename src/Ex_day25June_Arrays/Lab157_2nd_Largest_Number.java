package Ex_day25June_Arrays;

import java.util.Arrays;

public class Lab157_2nd_Largest_Number {
    public static void main(String[] args) {

        int[] number = {12,56,77,74,53};
        Arrays.sort(number);
        System.out.println(number[number.length-2]);

    }
}
