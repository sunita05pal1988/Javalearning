package Ex_day25June_Arrays;

public class Lab156_Sum_of_Arrays {
    public static void main(String[] args) {
        int[] number = {12,43,56};
        int sum=0;
        for(int i =0; i<number.length; i++){
            sum = sum +number[i];
        }
        System.out.println(sum);
    }
}
