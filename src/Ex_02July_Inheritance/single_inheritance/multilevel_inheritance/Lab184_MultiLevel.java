package Ex_02July_Inheritance.single_inheritance.multilevel_inheritance;

public class Lab184_MultiLevel {
    public static void main(String[] args) {
        Son amit = new Son();
        System.out.println(amit.gold_gf);
        amit.gf();

        GrandFather grandFather = new Son();
        grandFather.home();
    }
}
