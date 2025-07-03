package Ex_02July_Inheritance.single_inheritance.multilevel_inheritance;

public class Lab183_MultiLevel {
    public static void main(String[] args) {
        Son amit = new Son();
        GrandFather g1 = new Son();
        g1.gf();
        g1.home();

        GrandFather g2 = new Father();
        g2.home();

        Father f2 = new Son();
        f2.home();
    }
}
