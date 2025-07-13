package Ex_09July_Wrapper;

public class Lab214_Wrapper_Conversion {
    public static void main(String[] args) {

        int a = 10;
        Integer b = a;   //This Boxing -> automatically JVM will store the value
        //Primitive to wrapper -> AutoBoxing
        System.out.println(b.intValue());
        System.out.println(Integer.MAX_VALUE);  //behav
        System.out.println(Integer.MIN_VALUE); //behav

        Integer a2= 39;
        int v=a2; // Unboxing  -> wrapper is removed, attribute, behaviour is lost
        System.out.println(v);
    }
}
