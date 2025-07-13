package Ex_08July_Static;

public class Lab205_Static_IIB {
    public static void main(String[] args) {
        P p1= new P();
        P p2 = new P();
        System.out.println(P.a);
        p1.a=12;
        System.out.println(P.a);
        System.out.println(p1.a);
        System.out.println(p2.a);

        p1.b=24;
        p2.b=34;
        System.out.println(p1.b);
        System.out.println(p2.b);
    }
}

class P{
    static int a=10;
    int b= 10;

    static{
        //This is static block
        //this is called whenever a class a loaded.
        System.out.println("Hi, this is called becoz class is loaded");
        // the usage of static block is if you want call some of the methods, like calling a database collection, calling an excel collection
    }
}
