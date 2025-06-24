package Ex_day16June_Switch_Case;

public class Lab089_Interview {
    public static void main(String[] args) {
        char ch = 'A';
        switch (ch){
            case 65:
                System.out.println("This is also allowed, because char is also integer");
                break;
            default:
                System.out.println("No match");
        }
    }
}
