package Ex_day24June_StringBuilder_StringBuffer;

public class Lab_144_StringBuilder_Vs_StringBuffer {
    public static void main(String[] args) {
        String s0= "Pramod";
        String s1 = new String("Pramod");

        StringBuffer stringbuffer = new StringBuffer("Pramod");
        StringBuilder stringbuilder = new StringBuilder("Pramod");

        System.out.println(s0);
        System.out.println(s1);
        System.out.println(stringbuffer);
        System.out.println(stringbuilder);
    }

}
