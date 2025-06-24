package Ex_day24June_StringBuilder_StringBuffer;

public class Lab_148_SB_Functions {
    public static void main(String[] args) {
        StringBuffer sb= new StringBuffer("JAVA");
        sb.append(" Programming");
        System.out.println("sb");
        sb.delete(5,6);
        System.out.println(sb);
        sb.replace(0,4,"test");
        System.out.println(sb);

    }
}
