package Ex_03July_Polymorphism;

public class Lab190_MOverriding_Automation {
    public static void main(String[] args) {
        ChromeTC c1 = new ChromeTC();
        c1.openBrowser();

        Firefox f1= new Firefox();
        f1.openBrowser();

        CommonToAll CTA = new CommonToAll();
        CTA.openBrowser();

        //Dynamic Dispatch
        CommonToAll c2=new ChromeTC();
        c2.openBrowser();

        CommonToAll c3=new ChromeTC();
        c3.openBrowser();
    }
}
class CommonToAll{
    void openBrowser(){
        System.out.println("Starting IE browser!");
    }
}
class ChromeTC extends CommonToAll{
    @Override
    void openBrowser(){
        System.out.println("Starting Chrome Browser!");
    }
}

class Firefox extends CommonToAll{
    @Override
    void openBrowser(){
        System.out.println("Firefox will start!");
    }
}