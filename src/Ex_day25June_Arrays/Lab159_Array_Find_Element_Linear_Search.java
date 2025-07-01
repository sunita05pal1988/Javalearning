package Ex_day25June_Arrays;

public class Lab159_Array_Find_Element_Linear_Search {
    public static void main(String[] args) {
        int[] a = {23,43,45,54,67,59,90};
        //find the target 67, give index
        int target = 67;
        for(int i =0;i<a.length;i++){
            if(target==a[i]){
                System.out.println(i);
            }
        }
    }
}
