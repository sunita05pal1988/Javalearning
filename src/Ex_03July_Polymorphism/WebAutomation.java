package Ex_03July_Polymorphism;

public class WebAutomation {
    public static void main(String[] args) {
        Browser b1 = new Browser();
        b1.startBrowser("chrome");
    }
}
class Browser {
    void startBrowser(){
        System.out.println("Starting a default browser");
    }

    String startBrowser(String Browser) {
        System.out.println("Staring browser " + Browser);
        return Browser;
    }
}
