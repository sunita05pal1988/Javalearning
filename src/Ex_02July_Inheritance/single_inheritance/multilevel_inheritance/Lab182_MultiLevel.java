package Ex_02July_Inheritance.single_inheritance.multilevel_inheritance;

public class Lab182_MultiLevel {
    public static void main(String[] args) {
        GrandFather gf = new GrandFather();
        gf.gf();

        System.out.println("------");

        Father f1 = new Father();
        f1.f();
        f1.gf();
        System.out.println("----------");

        Son s1 = new Son();
        s1.gf();
        s1.f();
        s1.s();

    }
}
