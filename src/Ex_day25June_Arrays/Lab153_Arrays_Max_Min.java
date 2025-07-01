package Ex_day25June_Arrays;

import java.util.Arrays;

public class Lab153_Arrays_Max_Min {
    public static void main(String[] args) {
        int[] array = {25, 76, 43, 29, 89, 48, 59};
        // 1st way but not recommend
        Arrays.sort(array);
        System.out.println(array[array.length - 1]);

        System.out.println("---------------------------");
        int max_output = give_me_max(array);
        int min_output = give_me_min(array);
        System.out.println(max_output);
        System.out.println(min_output);
    }
        static int give_me_max(int[] array) {
            int max = array[0];

            for (int i = 0; i < array.length; i++) {
                if (array[i] > max) {
                    max = array[i];
                }
            }
            return max;
        }
            static int give_me_min(int[] array){
                int min = array[0];

                for(int i =0; i<array.length; i++){
                    if(array[i] <min){
                        min=array[i];
                    }
                }
                return min;

    }
}
