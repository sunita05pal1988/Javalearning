package Ex_day16_Switch_Case;

public class Lab094_JDK13 {
    public static void main(String[] args) {
        int itemcode = 005;
        switch (itemcode){
            case 001,002,005:
                System.out.println("all of the them are Electronic Gadget");
                break;
            case 004,006,007:
                System.out.println("This is mech gadget");
                break;
            default:
                System.out.println("None");
        }
    }
}
