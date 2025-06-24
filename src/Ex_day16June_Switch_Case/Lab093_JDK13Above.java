package Ex_day16June_Switch_Case;

public class Lab093_JDK13Above {
    public static void main(String[] args) {
        //in JDK > 13
        //no need break keyword
        //only one line supported
        int itemCode = 002;
        switch (itemCode) {
            case 001 -> System.out.println("001");
            case 002 -> System.out.println("002");
            case 003 -> System.out.println("003");
            default -> System.out.println("Default");
        }

    }
}
