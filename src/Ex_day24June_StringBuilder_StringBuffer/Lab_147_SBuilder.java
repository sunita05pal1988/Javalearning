package Ex_day24June_StringBuilder_StringBuffer;

public class Lab_147_SBuilder {
    public static void main(String[] args) {
        StringBuilder SB = new StringBuilder("Hello");
        SB.append(" World");
        SB.reverse();
        System.out.println(SB);
    }
}
