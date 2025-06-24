package Ex_day10June_Variables_Datatypes;

public class LAb024_print_F {
    public static void main(String[] args) {
        int a = 10;

        System.out.println("add the new line in the end");
        System.out.print("print the command print without the new line");
        System.out.println("Hello World");

        System.out.println(a);
        System.out.printf("Your variable name is %d",a);

        //%d > int, byte, short, long  datatype
        //%s > string
        //%f > float and double
        // %b > boolean

        int b = 20;
        System.out.println("-----");
        System.out.printf("%d + %d",a,b);

    }
}
