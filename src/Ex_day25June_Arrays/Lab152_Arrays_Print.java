package Ex_day25June_Arrays;

import java.util.Arrays;

public class Lab152_Arrays_Print {
    public static void main(String[] args) {
        int[] marks = {51,32,32,100,90,79};
        System.out.println("------------");

        Arrays.sort(marks);
        for(int i =0; i<marks.length; i++){
            System.out.println(marks[i]);
           // System.out.println(marks[2]);
        }

    }
}
