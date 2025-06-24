package Ex_day24June_StringBuilder_StringBuffer;

public class Lab145_SB {
    public static void main(String[] args) {
        StringBuffer stringbuffer = new StringBuffer("Pramod");
        stringbuffer.append("Dutta");
        System.out.println(stringbuffer);

        System.out.println(stringbuffer.reverse());

        String s1="Hello";
        String s2 = "World";
        String s3 = s1+s2;
        System.out.println(s3);
        System.out.println(s1);
    }
}
