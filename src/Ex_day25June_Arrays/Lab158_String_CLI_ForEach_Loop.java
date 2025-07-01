package Ex_day25June_Arrays;

public class Lab158_String_CLI_ForEach_Loop {
    public static void main(String[] pramod) {
        for(int i = 0; i<pramod.length;i++){
            System.out.println(pramod[i]);
        }

        System.out.println("---------------------------------------------");
        for(Object o:pramod){
            System.out.println(o);
        }
    }
}
