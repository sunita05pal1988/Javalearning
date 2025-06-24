package Ex_day17June_Loop_While;

public class Lab112_For_Loop_Break {
    public static void main(String[] args) {
        for (int i=0; i<50; i++){
            if(i==5){
                break; //it is used to come out the loop
            }else
                System.out.println(i);
        }
    }
}
