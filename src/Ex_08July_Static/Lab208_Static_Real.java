package Ex_08July_Static;

public class Lab208_Static_Real {
    public static void main(String[] args) {
ATB at =new ATB();
        System.out.println(at.getName());
        System.out.println(at.getPhone());
    }

}
class ATB{
    static {
        System.out.println("Load the class? ,I will execute");
    }

    {
        System.out.println("IIB - this is called when Object is created");
        //what is the purpose?
        //Here you can write code related to Start a website or anything before starting the
        // web automation or api automation
    }

    private String name;// non static

    public String getPhone(){
        return phone;
    }

    public void setPhone(String phone){
        this.phone=phone;
    }
    public String getName(){
        return name;
    }
    public void setName(){
        this.name = name;

    }

    private String phone;

    static String courseName = "ATB13x";
    static String mentorName = "Pramod";

    static void doAssignment(){
       // System.out.println(phone);   static method can't access the non static variables
        System.out.println("Do Assignment");
    }
    static void joinZoomForClass(){
        System.out.println("Class joined");
    }

    void howTheyAssignment(){
        System.out.println("It is different!");
    }
    }

