package Ex_08July_Static;

public class Lab209_Static_WebAutomation {
    public static void main(String[] args) {
        automation auto = new automation();
        System.out.println(auto.driver);

        automation auto2=new automation();
        automation auto3=new automation();
        System.out.println(auto2.driver);
        System.out.println(auto3.driver);
    }
}

class automation {
    static String driver ="Chrome";
}
