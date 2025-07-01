package Ex_day25June_Arrays;

import java.util.Scanner;

public class Lab154_Array_User_Input {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array(int) only");
        int size =sc.nextInt();

        int[] number_marks = new int[size];
        for(int i=0; i<number_marks.length; i++){
            System.out.println("Enter the numbers");
            number_marks[i] =sc.nextInt();
        }
        System.out.println("--------------- Below code is printing the elements! ");
        for(int i = 0; i<number_marks.length; i++){
            System.out.println(number_marks[i]);
        }

    }
}
